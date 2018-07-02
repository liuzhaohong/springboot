package com.liuzh.designpattern.principle.LSP.entity;

import java.util.Collection;
import java.util.Map;

/**
 * Created by zhaohong on 2018/6/29.
 */
public class Dog extends Animal {

    //重载
    public Collection running(Map map) {
        System.out.println("**********Dog Running**********");
        return map.values();
    }

}
