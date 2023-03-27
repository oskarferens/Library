package LibraryApplication.service;

import LibraryApplication.domain.Book;
import LibraryApplication.dto.BookDto;
import LibraryApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAllBooks() {
        List<BookDto> bookList = bookRepository.findAll();
        return bookMapper.mapToBookDtoList(bookList);
    }

    public void saveBook(BookDto book) {
        return bookRepository.save(book);
    }
}
