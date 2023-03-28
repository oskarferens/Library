package LibraryApplication.service;

import LibraryApplication.domain.Book;
import LibraryApplication.domain.Reader;
import LibraryApplication.dto.ReaderDto;
import LibraryApplication.mapper.ReaderMapper;
import LibraryApplication.repository.ReaderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    private ReaderRepository readerRepository;
    private ReaderMapper readerMapper;

    public ReaderService(ReaderRepository readerRepository, ReaderMapper readerMapper) {
        this.readerRepository = readerRepository;
        this.readerMapper = readerMapper;
    }

    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public Reader saveReader(Reader reader) {
        return readerRepository.save(reader);
    }
}
