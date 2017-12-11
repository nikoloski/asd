package com.seavus.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@SpringBootApplication
@EnableJpaRepositories
public class LibraryApplication {

    public static void main (String[] args) {

        SpringApplication.run(LibraryApplication.class);

        /*ApplicationContext ctx = SpringApplication.run(LibraryApplication.class, args);

        BookRepository book = ctx.getBean(BookRepository.class);
        MemberRepository member = ctx.getBean(MemberRepository.class);

        Scanner input = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            int number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Insert isbn: ");
                    String isbn = inputLine.nextLine();
                    System.out.println("Insert title: ");
                    String title = inputLine.nextLine();
                    book.save(new Book(isbn, title));
                    break;
                case 2:
                    Iterable<Book> books = book.findAll();
                    for (Book book1 : books) {
                        System.out.println(book1.toString());
                    }
                    break;
                case 3:
                    System.out.println("Insert email: ");
                    String email = inputLine.nextLine();
                    System.out.println("Insert name: ");
                    String name = inputLine.nextLine();
                    member.save(new Member(email, name));
                    break;
                case 4:
                    Iterable<Member> members = member.findAll();
                    for (Member member1 : members) {
                        System.out.println(member1.toString());
                    }
                    break;
                case 6:
                    flag = false;
                    System.out.println("Leaving application!");
                    break;
                    default:
                        System.out.println("Invalid input, try again!");
                        break;
            }
        }*/


    }

}
