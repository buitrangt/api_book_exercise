package aibles.api_books_2.Entity;

import aibles.api_books_2.Entity.Book;
import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "books_in_category")
    private String booksInCategory;

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setBooksInCategory(String booksInCategory) {
        this.booksInCategory = booksInCategory;
    }

    public String getBooksInCategory() {
        return booksInCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

}
