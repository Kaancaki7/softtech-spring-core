package com.softtech.model;

import org.springframework.stereotype.Component;
@Component
public class Service {

    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public void testService(){
        dao.testDao();
    }
}
