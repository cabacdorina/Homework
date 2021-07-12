package com.unicredit.homework.service;

import com.unicredit.homework.component.C;
import com.unicredit.homework.repository.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
    private B b;

    @Autowired
    private C c;

    @Autowired
    public void setB(B b) {
        this.b = b;
    }
}
