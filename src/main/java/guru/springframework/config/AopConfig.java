package guru.springframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // From Spring Context (Spring Core)
/**
 * Note: The above @EnableAspectJAutoProxy could be used on an existing class but this was done
 * by choice in case more needs to be added in regards to configuring aop.
 */
public class AopConfig {
}
