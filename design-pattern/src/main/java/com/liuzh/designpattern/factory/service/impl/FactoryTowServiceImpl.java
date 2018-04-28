package com.liuzh.designpattern.factory.service.impl;

import com.liuzh.designpattern.factory.entity.TypeEnum;
import com.liuzh.designpattern.factory.service.AbstractFactory;
import com.liuzh.designpattern.factory.service.FactoryService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by zhaohong on 2018/4/28.
 */
@Component("factoryTowServiceImpl")
public class FactoryTowServiceImpl extends AbstractFactory implements FactoryService {

    private Log log = LogFactory.getLog(FactoryTowServiceImpl.class);

    @Override
    public String run() {
        String res = commonMethod();
        log.info(res);
        return TypeEnum.TYPE_TOW.getDesc();
    }
}
