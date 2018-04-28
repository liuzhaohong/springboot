package com.liuzh.designpattern.factory.service.impl;

import com.liuzh.designpattern.factory.entity.TypeEnum;
import com.liuzh.designpattern.factory.service.FactoryService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohong on 2018/4/28.
 */
@Component("factoryOneServiceImpl")
public class FactoryOneServiceImpl implements FactoryService {
    @Override
    public String run() {
        return TypeEnum.TYPE_ONE.getDesc();
    }
}
