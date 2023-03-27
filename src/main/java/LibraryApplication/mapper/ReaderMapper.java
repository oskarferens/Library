package LibraryApplication.mapper;

import LibraryApplication.domain.Reader;
import LibraryApplication.dto.ReaderDto;
import org.springframework.stereotype.Service;

@Service
public class ReaderMapper {
    public Reader mapToReader(final ReaderDto readerDto) {
        return new Reader(readerDto.getId(),
                readerDto.getFirstName(),
                readerDto.getLastName(),
                readerDto.getEmail(),
                readerDto.getPhoneNumber()
        );
    }

    public ReaderDto mapToReaderDto(final Reader reader) {
        return new ReaderDto(reader.getId(),
                reader.getFirstName(),
                reader.getLastName(),
                reader.getEmail(),
                reader.getPhoneNumber()
        );
    }
}
