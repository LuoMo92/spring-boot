package com.luomo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@Component
public class SelfProperties {

    @Value("${com.luomo.name}")
    private String name;

    @Value("${com.luomo.title}")
    private String title;

    @Value("${com.luomo.desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
