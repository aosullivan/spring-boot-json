package sample.jersey1;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RestResource.class);
        register(JacksonFeatures.class);
        register(MyObjectMapperProvider.class);        
    }
}