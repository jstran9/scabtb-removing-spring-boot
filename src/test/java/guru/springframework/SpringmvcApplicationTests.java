package guru.springframework;

import guru.springframework.config.JpaIntegrationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringmvcApplication.class)
@ContextConfiguration(classes = JpaIntegrationConfig.class)
public class SpringmvcApplicationTests {

    @Test
    public void contextLoads() {
    }

}
