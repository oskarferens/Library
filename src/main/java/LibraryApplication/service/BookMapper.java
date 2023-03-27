package LibraryApplication.service;

import LibraryApplication.domain.Book;
import LibraryApplication.dto.BookDto;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class BookMapper {

    public Book mapToBook(final BookDto bookDto) {
        return new Book(Math.toIntExact(bookDto.getId()),
                bookDto.getTitle(),
                bookDto.getAuthorName(),
                bookDto.getAuthorLastname(),
                bookDto.isStatus(),
                bookDto.getPublicationYear()
        );
    }

    public BookDto mapToBookDto(final Book book) {
        return new BookDto((long) book.getId(),
                book.getTitle(),
                book.getAuthorName(),
                book.getAuthorLastname(),
                book.isStatus(),
                book.getPublicationYear()
        );
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList) {
        return book
    }

}
