package springboot.transactionmanagement.example01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="springboot.transactionmanagement.example01.repository")
public class JpaConfig {

}
