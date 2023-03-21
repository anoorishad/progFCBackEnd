package com.example.programmingflashcardsbe.controller;

import com.example.programmingflashcardsbe.model.FlashCard;
import com.example.programmingflashcardsbe.repository.FlashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flashcard")
public class FlashCardController {

    @Autowired
    FlashCardRepository repo;

    @GetMapping()
    public List<FlashCard> getFlashCards() {return repo.findAll();}

    @GetMapping("/{id}")
    public FlashCard getFlashCardById(@PathVariable int id){
        Optional<FlashCard> returnVal = repo.findById(id);
        if(returnVal.isPresent()){
            return returnVal.get();
        } else {
            return null;
        }
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public FlashCard addFlashCard(@RequestBody FlashCard flashCard){return repo.save(flashCard);}

    @PutMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFlashCard(@RequestBody FlashCard flashCard) {
        repo.save(flashCard);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFlashCard(@PathVariable int id) {
        repo.deleteById(id);
    }
}
