package LibraryApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private int Id;
    private String title;
    private String authorName;
    private String authorLastname;
    private boolean status;
    private Date publicationYear;
}
