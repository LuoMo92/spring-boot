package com.luomo;

import com.luomo.properties.SelfProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTests {

    @Autowired
    private SelfProperties selfProperties;


    @Test
    public void test() throws Exception {
        Assert.assertEquals(selfProperties.getName(), "落墨test");
//        Assert.assertEquals(selfProperties.getTitle(), "Spring Boot学习dev");
//        Assert.assertEquals(selfProperties.getDesc(), "落墨dev正在进行Spring Boot学习dev");
    }


}
