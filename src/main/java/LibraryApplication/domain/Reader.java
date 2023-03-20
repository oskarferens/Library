package LibraryApplication.domain;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "READER")
 public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id ;

    @Column(name = "NAME")
    @NotNull
    private String firstName;

    @Column(name = "LASTNAME")
    @NotNull
    private String lastName;

    @Column(name = "EMAIL")
    @NotNull
    private String email;

    @Column(name = "PHONE_NUMBER")
    @NotNull
    private Long PhoneNumber;
}
