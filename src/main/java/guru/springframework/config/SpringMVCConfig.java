package guru.springframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by jt on 2/19/16.
 * @EnableWebMvc can be put into any configuration class because like for the AOP annotation, EnableAspectJAutoProxy,
 * if we want to change anything related to Spring MVC it is better that there is a separate configuration for it.
 */
@EnableWebMvc
@Configuration
public class SpringMVCConfig {
}
