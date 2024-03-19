package aibles.api_books_2.Repository;

import aibles.api_books_2.Entity.Author;
import aibles.api_books_2.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    interface CategoryRepository extends JpaRepository<Category, Long> {
    }
}

