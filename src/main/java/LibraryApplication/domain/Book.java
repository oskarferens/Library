package LibraryApplication.domain;

import javax.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id ;

    @Column(name = "TITLE")
    @NotNull
    private String title;

    @Column(name = "AUTHOR_NAME")
    @NotNull
    private String authorName;

    @Column(name = "AUTHOR_LASTNAME")
    @NotNull
    private String authorLastname;

    @Column(name = "STATUS")
    @NotNull
    private boolean status;

    @Column(name = "PUBLICATION_YEAR")
    @NotNull
    private Date publicationYear;

    public Book(int id, @NotNull String title, @NotNull String authorName, @NotNull String authorLastname, @NotNull boolean status, @NotNull Date publicationYear) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.authorLastname = authorLastname;
        this.status = status;
        this.publicationYear = publicationYear;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (status != book.status) return false;
        if (!title.equals(book.title)) return false;
        if (!authorName.equals(book.authorName)) return false;
        if (!authorLastname.equals(book.authorLastname)) return false;
        return publicationYear.equals(book.publicationYear);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + title.hashCode();
        result = 31 * result + authorName.hashCode();
        result = 31 * result + authorLastname.hashCode();
        result = 31 * result + (status ? 1 : 0);
        result = 31 * result + publicationYear.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorLastname='" + authorLastname + '\'' +
                ", status=" + status +
                ", publicationYear=" + publicationYear +
                '}';
    }
}