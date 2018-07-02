package com.liuzh.designpattern;

import com.liuzh.designpattern.principle.LSP.entity.Animal;
import com.liuzh.designpattern.principle.LSP.entity.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Package : com.liuzh.designpattern
 *
 * @author YixinCapital -- liuzhaohong
 *         2018/6/29 下午2:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LSPTest {

    @Test
    public void test() {
        /**
         * 里氏替换原则
         * 父类出现的地方，子类必然可以出现，子类出现的地方，父类未必可以胜任。
         */
        Animal animal = new Animal();
        animal.getName();
        Dog dog = new Dog();
        Map map = new HashMap();
        dog.running(map);
        dog.running((HashMap)map);
        animal.running((HashMap) map);
    }

}
