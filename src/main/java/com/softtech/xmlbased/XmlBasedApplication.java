package com.softtech.xmlbased;

import com.softtech.model.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedApplication {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-based-config.xml");

        Service service = applicationContext.getBean(Service.class);

        service.testService();
    }
}
