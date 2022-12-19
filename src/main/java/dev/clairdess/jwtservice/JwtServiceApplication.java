package dev.clairdess.jwtservice;

import dev.clairdess.jwtservice.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtServiceApplication.class, args);
    }

}
