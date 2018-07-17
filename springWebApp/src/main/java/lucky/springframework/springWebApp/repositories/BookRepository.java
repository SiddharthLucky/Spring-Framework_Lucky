package lucky.springframework.springWebApp.repositories;

import lucky.springframework.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>
{

}
