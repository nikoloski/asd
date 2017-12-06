package com.seavus.library;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "book")
public class Book {

    @ManyToMany(mappedBy = "books")

    @Id
    @GeneratedValue
    private long id;

    private String isbn;
    private String title;

    private Collection<Member> members;

    public Book () {

    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public Book(String isbn, String title, Collection<Member> members) {
        this.isbn = isbn;
        this.title = title;
        this.members = members;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
