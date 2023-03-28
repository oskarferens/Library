package LibraryApplication.repository;

import LibraryApplication.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReaderRepository extends CrudRepository<Reader,Long> {

    Reader save (Reader reader);

    Optional<Reader> findById(Long Id);

    Optional<Reader> findByFirstName(String firstName);

    List<Reader> findAll();
}
