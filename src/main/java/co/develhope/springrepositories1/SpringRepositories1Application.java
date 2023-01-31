package co.develhope.springrepositories1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class SpringRepositories1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRepositories1Application.class, args);
    }

}
