package babel.dev.service.userservice;

import babel.dev.model.dto.UserDto;

public interface UserService {
	public UserDto findUser(String id);
}
