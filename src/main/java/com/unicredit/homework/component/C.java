package com.unicredit.homework.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    private D d;

    @Autowired
    public C(D d) {
        this.d = d;
    }
}
