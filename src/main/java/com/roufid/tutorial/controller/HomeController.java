package com.roufid.tutorial.controller;

import com.roufid.tutorial.dao.mysql.AuthorRepository;
import com.roufid.tutorial.dao.postgresql.BookRepository;
import com.roufid.tutorial.dao.postgresql.PersonRepository;
import com.roufid.tutorial.entity.mysql.Author;
import com.roufid.tutorial.entity.postgresql.Book;
import com.roufid.tutorial.entity.postgresql.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;


    @RequestMapping(value="/")
    public ModelAndView mainPage() {
        return new ModelAndView("home");
    }

    @RequestMapping(value="/index")
    public ModelAndView indexPage() {
        return new ModelAndView("home");
    }

    @RequestMapping(value="/main-second")
    public List<Person> mainPage2() {
        Person person = new Person();
        person.setName("Pankaj");
        person.setCountry("India");
        personRepository.save(person);
        System.out.println("Person::"+person);
        List<Person> list = (List<Person>) personRepository.findAll();
        for(Person p : list){
            System.out.println("Person List::" + p);
        }

        Author author = new Author();
        author.setFirstname("Ahmet");
        author.setLastname("Mehmet");
        authorRepository.save(author);

        Book book = new Book();
        book.setAuthorId(author.getId());
        book.setName("Book");
        bookRepository.save(book);

        return list;
    }
}
