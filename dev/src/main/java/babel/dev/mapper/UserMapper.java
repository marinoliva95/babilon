package babel.dev.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Component;
import babel.dev.model.dao.UserEntity;
import babel.dev.model.dto.UserDto;

@Component
public class UserMapper implements Function<UserEntity, UserDto> {

	@Override
	public UserDto apply(UserEntity ent) {
		UserDto dto = new UserDto();
		dto.setId(ent.getId());
		dto.setEmail(ent.getEmail());
		dto.setLanguaje(ent.getLanguaje());
		dto.setName(ent.getPass());
		dto.setPass(ent.getPass());
		dto.setSurname(ent.getSurname());
		dto.setUsername(ent.getUsername());
		return dto;
	}
	
}
