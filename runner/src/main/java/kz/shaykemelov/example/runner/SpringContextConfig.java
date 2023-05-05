package kz.shaykemelov.example.runner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages =
                {
                        "kz.shaykemelov.example"
                }
)
public class SpringContextConfig
{
}
