package org.adrian;

import javax.ws.rs.ext.Provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(value = "org.adrian", includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Provider.class))
public class SampleResteasyApplication {
    
    //java -jar target/spring-boot-stuff-1.0.0-SNAPSHOT.jar

    public static void main(final String[] args) {
        new SpringApplicationBuilder(SampleResteasyApplication.class)
        .showBanner(false)
        .run(args);
    }

}
