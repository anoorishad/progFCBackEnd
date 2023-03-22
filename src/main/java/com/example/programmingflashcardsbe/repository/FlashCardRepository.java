package com.example.programmingflashcardsbe.repository;

import com.example.programmingflashcardsbe.model.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard, Integer> {
}
