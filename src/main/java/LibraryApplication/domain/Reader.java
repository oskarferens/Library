package LibraryApplication.domain;

import javax.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "READER")
 public class Reader {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id ;

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


   public Reader(Long id, @NotNull String firstName, @NotNull String lastName, @NotNull String email, @NotNull Long phoneNumber) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      PhoneNumber = phoneNumber;
   }

   public Reader() {
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Reader reader = (Reader) o;

      if (id != null ? !id.equals(reader.id) : reader.id != null) return false;
      if (!firstName.equals(reader.firstName)) return false;
      if (!lastName.equals(reader.lastName)) return false;
      if (!email.equals(reader.email)) return false;
      return PhoneNumber.equals(reader.PhoneNumber);
   }

   @Override
   public int hashCode() {
      int result = id != null ? id.hashCode() : 0;
      result = 31 * result + firstName.hashCode();
      result = 31 * result + lastName.hashCode();
      result = 31 * result + email.hashCode();
      result = 31 * result + PhoneNumber.hashCode();
      return result;
   }

   @Override
   public String toString() {
      return "Reader{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              ", PhoneNumber=" + PhoneNumber +
              '}';
   }
}
