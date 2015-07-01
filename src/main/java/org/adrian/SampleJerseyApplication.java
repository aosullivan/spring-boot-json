package org.adrian;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SampleJerseyApplication {
    
    //java -jar target/spring-boot-stuff-1.0.0-SNAPSHOT.jar
    
    public static void main(final String[] args) {
        new SpringApplicationBuilder(SampleJerseyApplication.class)
        .showBanner(false)
        .run(args);
    }

}
