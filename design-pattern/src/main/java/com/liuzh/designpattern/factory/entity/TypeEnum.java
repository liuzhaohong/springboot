package com.liuzh.designpattern.factory.entity;

/**
 * Created by zhaohong on 2018/4/28.
 */
public enum TypeEnum {
    TYPE_ONE("one", "factoryOneServiceImpl", "第一个服务"),
    TYPE_TOW("tow", "factoryTowServiceImpl", "第二个服务");

    private String code; // 编码
    private String serviceName; // 服务名称
    private String desc; // 描述

    TypeEnum(String code, String serviceName, String desc) {
        this.code = code;
        this.serviceName = serviceName;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDesc() {
        return desc;
    }
}
