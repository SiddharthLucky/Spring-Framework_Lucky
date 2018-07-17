package lucky.springframework.springWebApp.repositories;

import lucky.springframework.springWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, String>
{

}
