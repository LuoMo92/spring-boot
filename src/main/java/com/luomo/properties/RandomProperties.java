package com.luomo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@Component
public class RandomProperties {

    @Value("${string}")
    private String string;

    @Value("${int}")
    private Integer intValue;

    @Value("${long}")
    private Long longValue;

    @Value("${within10}")
    private Integer within10;

    @Value("${10to20}")
    private Integer integer10to20;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public Integer getWithin10() {
        return within10;
    }

    public void setWithin10(Integer within10) {
        this.within10 = within10;
    }

    public Integer getInteger10to20() {
        return integer10to20;
    }

    public void setInteger10to20(Integer integer10to20) {
        this.integer10to20 = integer10to20;
    }
}
