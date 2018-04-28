package com.liuzh.springboot.controller.designpattern.factory;

import com.liuzh.designpattern.factory.entity.Factory;
import com.liuzh.designpattern.factory.entity.TypeEnum;
import com.liuzh.designpattern.factory.service.FactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaohong on 2018/4/28.
 */
@Controller
@RequestMapping("/pattern")
public class FactoryController {

    @RequestMapping("/factory")
    @ResponseBody
    public Object factoryTest() {
        String code = TypeEnum.TYPE_ONE.getCode();
        FactoryService factoryService = new Factory().getService(code);
        return factoryService.run();
    }
}
