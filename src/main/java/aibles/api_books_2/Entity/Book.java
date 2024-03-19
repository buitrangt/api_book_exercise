package aibles.api_books_2.Entity;

import jakarta.persistence.*;



@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;

    @Column(name = "author_name", nullable = false)
    private String authorName;

    @Column(name = "publication_year")
    private int publicationYear;

    @Column(name = "category_name", nullable = false)
    private String categoryName;


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
