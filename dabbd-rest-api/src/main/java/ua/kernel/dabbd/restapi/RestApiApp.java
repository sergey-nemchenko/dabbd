package ua.kernel.dabbd.restapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ua.kernel.dabbd.commons.config.RepositoryConfig;

import static ua.kernel.dabbd.commons.util.DabBdUtils.logSystemProperties;

@Slf4j
@Import({RepositoryConfig.class})
@SpringBootApplication
public class RestApiApp {

    public static void main(String[] args) {
        logSystemProperties();
        SpringApplication app = new SpringApplication(RestApiApp.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
    }


}