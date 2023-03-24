package LibraryApplication.controller;

import LibraryApplication.domain.Book;
import LibraryApplication.domain.Reader;
import LibraryApplication.service.BookService;
import LibraryApplication.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class BookController {

    @Autowired
    private final BookService bookService;

    @PostMapping("/add")
    public String add(@RequestBody Book book) {
        bookService.saveBook(book);
        return ("New book created");
    }

    @GetMapping("/getAll")
    public List<Book> list(){
        return bookService.getAllBooks();
    }
}
