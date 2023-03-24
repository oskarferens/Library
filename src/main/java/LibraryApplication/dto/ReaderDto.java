package LibraryApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReaderDto {
    private int Id;
    private String firstName;
    private String lastName;
    private String email;
    private Long PhoneNumber;
}
