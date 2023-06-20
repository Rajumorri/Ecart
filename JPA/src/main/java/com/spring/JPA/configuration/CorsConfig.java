package com.spring.JPA.configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig {
     public static final String GET="GET";
    public static final String POST="POST";
    public static final String DELETE="DELETE";
    public static final String PUT="PUT";
    public WebMvcConfigurer congigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods(GET,DELETE,PUT,POST)
                        .allowCredentials(true)
                        .allowedOriginPatterns("*")
                        .allowedHeaders("*")
                ;
            }
        };
    }
}
