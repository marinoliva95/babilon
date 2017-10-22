package babel.dev.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import babel.dev.model.dao.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>{

}
