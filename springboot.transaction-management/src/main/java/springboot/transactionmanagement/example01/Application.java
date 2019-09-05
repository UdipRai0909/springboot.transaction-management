package springboot.transactionmanagement.example01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages={"springboot.transactionmanagement"})
@EntityScan("springboot.transactionmanagement..*") 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
