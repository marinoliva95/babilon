package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import DAO.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>{
	//find one user by id
	public UserEntity findUser(String id);
}
