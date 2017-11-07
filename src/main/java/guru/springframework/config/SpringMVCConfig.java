package guru.springframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jt on 2/19/16.
 * @EnableWebMvc can be put into any configuration class because like for the AOP annotation, EnableAspectJAutoProxy,
 * if we want to change anything related to Spring MVC it is better that there is a separate configuration for it.
 */
@EnableWebMvc
@Configuration
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");

    }
}
