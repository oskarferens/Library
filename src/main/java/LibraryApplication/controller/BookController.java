package LibraryApplication.controller;

import LibraryApplication.domain.Book;
import LibraryApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping("/getAll")
    public List<Book> list(){
        return bookService.getAllBooks();
    }
}
