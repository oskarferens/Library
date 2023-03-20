package LibraryApplication.repository;

import LibraryApplication.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface ReaderRepository extends CrudRepository<Reader,Integer> {

    Reader save (Reader reader);

    List<Reader> findAll();
}
