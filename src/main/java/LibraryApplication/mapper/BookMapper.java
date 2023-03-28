package LibraryApplication.mapper;

import LibraryApplication.domain.Book;
import LibraryApplication.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookMapper {

    public Book mapToBook(final BookDto bookDto) {
        return new Book(bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthorName(),
                bookDto.getAuthorLastname(),
                bookDto.isStatus(),
                bookDto.getPublicationYear()
        );
    }

    public BookDto mapToBookDto(final Book book) {
        return new BookDto(book.getId(),
                book.getTitle(),
                book.getAuthorName(),
                book.getAuthorLastname(),
                book.isStatus(),
                book.getPublicationYear()
        );
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList) {
        return bookList.stream()
                .map(this::mapToBookDto)
                .collect(Collectors.toList());
    }

}
