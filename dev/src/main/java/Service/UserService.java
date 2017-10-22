package Service;

import org.springframework.transaction.annotation.Transactional;

import DTO.UserDto;

@Transactional
public interface UserService {
	public UserDto findUser(String id);
}
