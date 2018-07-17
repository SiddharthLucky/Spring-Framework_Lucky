package lucky.springframework.springWebApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String FirstName;
    private String LastName;

    @ManyToMany(mappedBy = "authors")
    Set<Book> books = new HashSet<>();

    // - Getters and Setters.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    //- Author Constructor
    public Author()
    {

    }

    public Author(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Author(String firstName, String lastName, Set<Book> books) {
        setFirstName(firstName);
        setLastName(lastName);
        setBooks(books);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) &&
                Objects.equals(FirstName, author.FirstName) &&
                Objects.equals(LastName, author.LastName) &&
                Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, FirstName, LastName, books);
    }
}
