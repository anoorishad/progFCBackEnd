package com.example.programmingflashcardsbe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "card")
public class FlashCard implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private long id;

    private String concept;

    private String content;

    private String progLang;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProgLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlashCard flashCard = (FlashCard) o;
        return id == flashCard.id && Objects.equals(concept, flashCard.concept) && Objects.equals(content, flashCard.content) && Objects.equals(progLang, flashCard.progLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, concept, content, progLang);
    }

    @Override
    public String toString() {
        return "FlashCard{" +
                "id=" + id +
                ", concept='" + concept + '\'' +
                ", definition='" + content + '\'' +
                ", progLang='" + progLang + '\'' +
                '}';
    }
}
