package LibraryApplication.service;

import LibraryApplication.domain.Book;
import LibraryApplication.mapper.BookMapper;
import LibraryApplication.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
