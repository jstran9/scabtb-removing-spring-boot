package guru.springframework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jt on 4/17/16.
 * This acts as the "master class" prior we had a Spring Boot Application class.
 */
@Configuration
@ComponentScan(basePackages = "guru.springframework")
@EnableWebMvc
public class SpringConfig extends WebMvcConfigurerAdapter {
}
