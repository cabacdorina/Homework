package com.unicredit.homework.implementations;

import com.unicredit.homework.interfaces.IE;
import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
@Profile("e1")
public class E1 implements IE {
}
