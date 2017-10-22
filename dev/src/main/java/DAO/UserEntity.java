package DAO;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="user")
public class UserEntity {
	
	//attr
	@Id
	private String id;
	private String name;
	private String surname;
	private String username;
	private String pass;
	private String email;
	private String languaje;
	private List<UserEntity> listaAmigos;
}
