package DAO;

import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="relation")
@CompoundIndexes({
    @CompoundIndex(name = "user1_user2", def = "{'user1' : 1, 'user2': 1}")
})
public class RelationsEntity {
	
	//attr
	private String user1;
	private String user2;
	private boolean confirmed;
	private boolean blocked;
	private Date date;
}
