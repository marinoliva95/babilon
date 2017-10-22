package ServiceImpl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.UserEntity;
import DTO.UserDto;
import Service.UserService;
import mapper.UserMapper;
import repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public UserDto findUser(String id) {
		return mapper.apply(repository.findUser(id));
	}
	
	@PostConstruct
	public void setUp() {
		UserEntity user = new UserEntity();
		user.setUsername("Esparch3r");
		repository.save(user);
	}
	
}
