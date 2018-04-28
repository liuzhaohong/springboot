package com.liuzh.designpattern;

import com.liuzh.designpattern.factory.entity.Factory;
import com.liuzh.designpattern.factory.entity.TypeEnum;
import com.liuzh.designpattern.factory.service.FactoryService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaohong on 2018/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {
    private Log log = LogFactory.getLog(FactoryTest.class);

    /**
     * 工厂模式测试
     */
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add(TypeEnum.TYPE_ONE.getCode());
        list.add(TypeEnum.TYPE_TOW.getCode());
        for (String code : list) {
            FactoryService factoryService = new Factory().getService(code);
            String result = factoryService.run();
            log.info(result);
        }
    }
}
