package sample.jersey1;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class AppConfig {
    
    @Bean
    public Foo foo(){
        return new Foo();
    }
    
    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        final Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.dateFormat(new SimpleDateFormat("dd-MM-yyyy"));
        return builder;
    }

}
