package com.liuzh.designpattern.principle.LSP;

import com.liuzh.designpattern.principle.LSP.entity.Dog;

import java.util.HashMap;

/**
 * Created by zhaohong on 2018/6/29.
 */
public class LSPDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        HashMap map = new HashMap();
        dog.running(map);
    }
}
