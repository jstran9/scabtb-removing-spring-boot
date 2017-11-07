package guru.springframework.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * This class gets scanned by the SpringConfig class because of the component scan.
 */
public class SpringSecInit extends AbstractSecurityWebApplicationInitializer {
}
