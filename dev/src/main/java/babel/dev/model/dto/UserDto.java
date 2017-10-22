package babel.dev.model.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserDto {
	//attr
	private String id;
	private String name;
	private String surname;
	private String username;
	private String pass;
	private String email;
	private String languaje;
	private List<UserDto> listaAmigos;
}
