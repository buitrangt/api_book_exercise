package aibles.api_books_2;

import aibles.api_books_2.Entity.Author;
import aibles.api_books_2.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
public class ApiBooks2Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiBooks2Application.class, args);
    }

    @Service
    public static class AuthorService {
        @Autowired
        private AuthorRepository authorRepository;

        public List<Author> getAllAuthors() {
            return authorRepository.findAll();
        }

        public Author addAuthor(Author author) {
            return authorRepository.save(author);
        }

        // Add other CRUD operations as needed
    }
}
