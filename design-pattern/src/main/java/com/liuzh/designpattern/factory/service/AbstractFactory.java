package com.liuzh.designpattern.factory.service;

/**
 * Created by zhaohong on 2018/4/28.
 */
public abstract class AbstractFactory {

    /**
     * 这是一个公用方法，放在抽象类里
     * @return
     */
    public String commonMethod() {
        return "天苍苍，野茫茫，风吹草低见牛羊";
    }
}
