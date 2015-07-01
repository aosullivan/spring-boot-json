package org.adrian;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SampleJerseyApplication {
    
    public static void main(final String[] args) {
        new SpringApplicationBuilder(SampleJerseyApplication.class)
        .showBanner(false)
        .run(args);
    }

}
