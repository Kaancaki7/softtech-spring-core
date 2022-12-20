package com.softtech.javabased;

import com.softtech.model.Dao;
import com.softtech.model.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedApplication.class);

        Service service = context.getBean(Service.class);


        service.testService();
    }
    @Bean
    public Service service() {
        return new Service(dao());
    }
    @Bean
    public Dao dao() {
        return new Dao();
    }
}
