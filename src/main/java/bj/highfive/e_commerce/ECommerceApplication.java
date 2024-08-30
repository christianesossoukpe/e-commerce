package bj.highfive.e_commerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bj.highfive.e_commerce.model.User;
import bj.highfive.e_commerce.repository.UserRepository;
import java.time.LocalDateTime;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(UserRepository UserRepository){
		return(args)->{
		// sauvegarder John Doe dans la base de donnée

			User johnDoe = User.builder()
				.username("john doe")
				.email("johndoe@gmail.com")
				.password(555)
				.created_At(LocalDateTime.now())
				.updated_At(LocalDateTime.now())
				.build();
			User yoanDoe = User.builder()
				.username("yoan doe")
				.email("johndoe@gmail.com")
				.password(565)
				.created_At(LocalDateTime.now())
				.updated_At(LocalDateTime.now())
				.build();

				UserRepository.save(johnDoe);
				UserRepository.save(yoanDoe);

		};
	}
}
