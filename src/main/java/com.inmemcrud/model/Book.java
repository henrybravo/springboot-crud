package com.inmemcrud.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Book {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String Title;
    private String Author;
 
    public String getTitle() {
        return Title;
    }
 
    public void setTitle(String Title) {
        this.Title = Title;
    }
 
    public String getAuthor() {
        return Author;
    }
 
    public void setAuthor(String Author) {
        this.Author = Author;
    }
}
