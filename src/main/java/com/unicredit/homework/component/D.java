package com.unicredit.homework.component;

import com.unicredit.homework.configuration.S;
import com.unicredit.homework.interfaces.IE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class D {
    private S s;

    @Autowired
    private ApplicationContext spring;

    @Autowired
    public D(S s) {
        this.s = s;
    }

    @PostConstruct
    private IE getIEInstance() {
        IE iE=spring.getBean(IE.class);
        //System.out.println("Call -> " + iE);
        return iE;
    }

    public S getS() {
        return s;
    }

    public ApplicationContext getSpring() {
        return spring;
    }
}
