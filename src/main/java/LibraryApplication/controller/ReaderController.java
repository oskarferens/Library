package LibraryApplication.controller;

import LibraryApplication.domain.Reader;
import LibraryApplication.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ReaderController {

    @Autowired
    private final ReaderService readerService;

    @PostMapping("/add")
    public String add(@RequestBody Reader reader) {
        readerService.saveReader(reader);
        return ("New reader created");   //use dictionary class for sending messages instead
    }

    @GetMapping("/getAll")
    public List<Reader> list(){
        return readerService.getAllReaders();
    }
}
