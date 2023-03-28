package LibraryApplication.dto;

public class ReaderDto {
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private Long PhoneNumber;

    public Long getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public ReaderDto(Long Id, String firstName, String lastName, String email, Long PhoneNumber) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }
}
