package LibraryApplication.repository;

import LibraryApplication.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

    Book save (Book book);

    Optional<Book> findByTitle(String title);

    Optional<Book> findByAuthorName(String authorName);

    List<Book> findAll();

}
