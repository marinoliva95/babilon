package babel.dev.service.userservice;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import babel.dev.mapper.UserMapper;
import babel.dev.model.dao.UserEntity;
import babel.dev.model.dto.UserDto;
import babel.dev.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public UserDto findUser(String id) {
    return mapper.apply(repository.findOne(id));
	}
	
	@PostConstruct
	public void setUp() {
		UserEntity user = new UserEntity();
		user.setUsername("Esparch3r");
		repository.save(user);
	}
	
}
