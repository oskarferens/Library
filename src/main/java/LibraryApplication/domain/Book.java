package LibraryApplication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
