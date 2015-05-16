package com.lei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RestServiceApp extends SpringBootServletInitializer  {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestServiceApp.class);
    }

    /**
     * Running as stand alone app with:
     *   'java -jar target/[application].jar' to launch an app listening on port 8080
     */
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApp.class, args);
    }
}
