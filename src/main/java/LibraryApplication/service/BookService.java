package LibraryApplication.service;

import LibraryApplication.domain.Book;
import LibraryApplication.domain.Reader;
import LibraryApplication.repository.BookRepository;
import LibraryApplication.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
