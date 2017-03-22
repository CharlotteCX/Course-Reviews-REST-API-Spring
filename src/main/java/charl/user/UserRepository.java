package charl.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by chenxi on 2017-03-13.
 */

@RepositoryRestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);
}

