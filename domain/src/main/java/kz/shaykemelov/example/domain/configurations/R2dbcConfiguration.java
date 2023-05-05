package kz.shaykemelov.example.domain.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableJpaRepositories(basePackages = {"kz.shaykemelov.example.domain.repositories"})
@EntityScan("kz.shaykemelov.example.domain.entities")
@Configuration
public class R2dbcConfiguration
{
}
