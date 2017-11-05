package guru.springframework.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * Created by jt on 1/7/16.
 * for reference: org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration
 */
@Configuration
public class ThymeleafConfig {

    @Autowired
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public SpringResourceTemplateResolver defaultTemplateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setApplicationContext(this.applicationContext);
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setCharacterEncoding("UTF-8");
        resolver.setCacheable(true);
        return resolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(SpringResourceTemplateResolver defaultTemplateResolver) {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.addTemplateResolver(defaultTemplateResolver);
        return engine;
    }

    @Bean
    public ThymeleafViewResolver thymeleafViewResolver(SpringTemplateEngine templateEngine) {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine);
        resolver.setCharacterEncoding("UTF-8");
        resolver.setContentType("text/html");
        resolver.setOrder(Ordered.LOWEST_PRECEDENCE - 5);
        return resolver;
    }

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
