package com.luomo;

import com.luomo.properties.RandomProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomTests {

    @Autowired
    private RandomProperties randomProperties;


    @Test
    public void test() throws Exception {
        System.out.println(randomProperties.getString());
        System.out.println(randomProperties.getIntValue());
        System.out.println(randomProperties.getLongValue());
        System.out.println(randomProperties.getWithin10());
        System.out.println(randomProperties.getInteger10to20());
    }


}
