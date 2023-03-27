package LibraryApplication.controller;

import LibraryApplication.domain.Reader;
import LibraryApplication.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@CrossOrigin(origins = "*")
public class ReaderController {

    @Autowired
    private final ReaderService readerService;

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Reader reader) {
        readerService.saveReader(reader);
    }

    @GetMapping("/getAll")
    public List<Reader> list(){
        return readerService.getAllReaders();
    }
}
