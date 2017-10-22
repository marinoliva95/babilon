package babel.dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import com.mongodb.MongoClient;
import babel.dev.repository.UserRepository;

@Configuration
@EnableMongoRepositories
public class AppConfig {
 
  @Bean
	  UserRepository userRepository() throws Exception {
	    return (new MongoRepositoryFactory(
        new MongoTemplate(new SimpleMongoDbFactory(new MongoClient("localhost:27017"), "BABEL"))))
	            .getRepository(UserRepository.class);
	  }
 
}