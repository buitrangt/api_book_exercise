package aibles.api_books_2.Entity;

import jakarta.persistence.*;

import java.util.Date;



@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int authorId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "books_published")
    private String booksPublished;

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBooksPublished(String booksPublished) {
        this.booksPublished = booksPublished;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBooksPublished() {
        return booksPublished;
    }

    public int getAuthorId() {
        return authorId;
    }

}


