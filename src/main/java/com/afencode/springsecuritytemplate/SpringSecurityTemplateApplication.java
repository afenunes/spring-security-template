package com.afencode.springsecuritytemplate;

import com.afencode.springsecuritytemplate.repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTemplateApplication.class, args);
    }

}
