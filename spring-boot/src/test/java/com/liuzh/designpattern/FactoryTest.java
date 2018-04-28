package com.liuzh.designpattern;

import com.liuzh.designpattern.factory.entity.Factory;
import com.liuzh.designpattern.factory.entity.TypeEnum;
import com.liuzh.designpattern.factory.service.FactoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhaohong on 2018/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {

    @Test
    public void test() {
        String code = TypeEnum.TYPE_ONE.getCode();
        FactoryService factoryService = new Factory().getService(code);
        String result = factoryService.run();
        System.out.print(result);
    }
}
