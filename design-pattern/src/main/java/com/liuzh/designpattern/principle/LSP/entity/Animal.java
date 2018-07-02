package com.liuzh.designpattern.principle.LSP.entity;

import lombok.*;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by zhaohong on 2018/6/29.
 */
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Animal {

    private String name;
    private String age;

    public Collection running(HashMap map) {
        System.out.println("**********Animal Running**********");
        this.setName("dog");
        this.setAge("10");
        System.out.println(this.toString());

        return map.values();
    }
}
