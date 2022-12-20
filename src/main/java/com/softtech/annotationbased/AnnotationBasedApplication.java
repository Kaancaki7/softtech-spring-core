package com.softtech.annotationbased;

import com.softtech.model.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//kullanacağın classların üstüne @component ekliyorsun ve aşağıdaki gibi apllication metodu ile kullanabiliyorsun. Bean'ler
//otomatik olarak oluşturulmuş oluyor.
//javabased'dan ve xmlbased'den farkı Bean'ler otomatik olarak oluşturuluyor Annotation based'de
public class AnnotationBasedApplication {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation-based-config.xml");

        Service service = applicationContext.getBean(Service.class);

        service.testService();
    }
}
