package com.liuzh.designpattern.factory.entity;

import com.liuzh.core.utils.SpringContextUtil;
import com.liuzh.designpattern.factory.service.AbstractFactory;
import com.liuzh.designpattern.factory.service.FactoryService;

/**
 * Created by zhaohong on 2018/4/28.
 */
public class Factory {

    /**
     * 获取服务
     * @param code
     * @return
     */
    public FactoryService getService(String code) {
        String serviceName = "";
        switch (code) { // jdk7中可以使用string类型
            case "one":
                serviceName = "factoryOneServiceImpl";
                break;
            case "tow":
                serviceName = "factoryTowServiceImpl";
                break;
            default:break;
        }
        return (FactoryService) SpringContextUtil.getBean(serviceName);
    }
}
