package LibraryApplication.service;

import LibraryApplication.domain.Reader;
import LibraryApplication.dto.ReaderDto;
import LibraryApplication.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private ReaderMapper readerMapper;

    public List<ReaderDto> getAllReaders() {
        List<Reader> readersList = readerRepository.findAll();
        return readerMapper.mapToReaderDtoList(readerList);
    }

    public Reader saveReader(Reader reader) {
        return readerRepository.save(reader);
    }



}
