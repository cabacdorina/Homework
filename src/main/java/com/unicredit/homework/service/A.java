package com.unicredit.homework.service;

import com.unicredit.homework.component.C;
import com.unicredit.homework.configuration.S;
import com.unicredit.homework.repository.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class A implements CommandLineRunner {
    private B b;

    @Autowired
    private C c;

    @Autowired
    public void setB(B b) {
        this.b = b;
    }


    @Override
    public void run(String... args) throws Exception {

       System.out.println("new->"+c.getD());
       System.out.println("new->"+c.getD().getS());
    }
}
