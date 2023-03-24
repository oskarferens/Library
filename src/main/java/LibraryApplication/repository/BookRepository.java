package LibraryApplication.repository;

import LibraryApplication.domain.Book;
import LibraryApplication.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface BookRepository extends CrudRepository<Reader,Integer> {

    Book save (Book book);

    List<Book> findAll();

}
