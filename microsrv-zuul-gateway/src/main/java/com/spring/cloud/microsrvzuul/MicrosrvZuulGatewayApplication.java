package com.spring.cloud.microsrvzuul;
import com.spring.cloud.microsrvzuul.Filter.OAuth2TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MicrosrvZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicrosrvZuulGatewayApplication.class, args);
    }

    @Bean
    public OAuth2TokenFilter tokenFilter() {
        return new OAuth2TokenFilter();
    }
}