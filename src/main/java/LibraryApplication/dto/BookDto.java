package LibraryApplication.dto;

import java.util.Date;

public class BookDto {
    private Long Id;
    private String title;
    private String authorName;
    private String authorLastname;
    private boolean status;
    private Date publicationYear;

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public BookDto(Long id, String title, String authorName, String authorLastname, boolean status, Date publicationYear) {
        Id = id;
        this.title = title;
        this.authorName = authorName;
        this.authorLastname = authorLastname;
        this.status = status;
        this.publicationYear = publicationYear;
    }
}
