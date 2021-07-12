package com.unicredit.homework.component;

import com.unicredit.homework.configuration.S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class D {
    private S s;

    @Autowired
    public D(S s) {
        this.s = s;
    }
}
