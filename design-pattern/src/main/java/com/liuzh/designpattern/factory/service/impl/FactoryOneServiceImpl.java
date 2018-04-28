package com.liuzh.designpattern.factory.service.impl;

import com.liuzh.designpattern.factory.entity.TypeEnum;
import com.liuzh.designpattern.factory.service.AbstractFactory;
import com.liuzh.designpattern.factory.service.FactoryService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohong on 2018/4/28.
 */
@Component("factoryOneServiceImpl")
public class FactoryOneServiceImpl extends AbstractFactory implements FactoryService {
    @Override
    public String run() {
        commonMethod();
        return TypeEnum.TYPE_ONE.getDesc();
    }
}
