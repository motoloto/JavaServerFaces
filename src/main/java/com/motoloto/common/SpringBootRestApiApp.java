package com.motoloto.common;
 
import javax.faces.webapp.FacesServlet;

import org.eclipse.jdt.internal.compiler.batch.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(basePackages={""})
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.motoloto.common"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootRestApiApp extends SpringBootServletInitializer  {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApp.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootRestApiApp.class);
    }
    
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.xhtml");
        return servletRegistrationBean;
    }
}