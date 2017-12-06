package com.seavus.library;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "member")
public class Member {

    @ManyToMany
    @JoinTable(name = "member_book",
        joinColumns = @JoinColumn(name = "member_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id"))


    @Id
    @GeneratedValue
    private long id;

    private String email;
    private String name;

    private Collection<Book> books;

    public Member () {

    }

    public Member (String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Member (String email, String name, Collection<Book> books) {
        this.email = email;
        this.name = name;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
