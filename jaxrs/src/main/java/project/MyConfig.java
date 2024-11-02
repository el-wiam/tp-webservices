package project;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.glassfish.jersey.jackson.JacksonFeature; // For JSON support
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule; // For XML support with Jackson

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        // Register the resource class
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        // Register JSON support
        jerseyServlet.register(JacksonFeature.class);
        // Register XML support using Jackson
        jerseyServlet.register(new JacksonXmlModule());
        return jerseyServlet;
    }
}
