package com.luomo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@Configuration
//开启Spring Security的功能
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                ///和/hello不需要任何认证就可以访问，其他的路径都必须通过身份验证。
//                .antMatchers("/", "/hello").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                //通过formLogin()定义当需要用户登录时候，转到的登录页面
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
    }

    /**
     * 在内存中创建了一个用户，该用户的名称为user，密码为password，用户角色为USER
     *
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }

}
