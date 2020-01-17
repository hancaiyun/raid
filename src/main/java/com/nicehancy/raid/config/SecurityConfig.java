package com.nicehancy.raid.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * SpringSecurity
 * <p>
 * <p/>
 *
 * @author hancaiyun
 * @since 2020/1/17 13:54
 **/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 访问配置
     * @param http 请求
     * @throws Exception 异常
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //解决iframe框架不允许内嵌问题
        http.headers().frameOptions().disable();
        http.cors().and().csrf().disable();
        http
            //允许不登陆就可以访问的方法，多个用逗号分隔
            .authorizeRequests().antMatchers("/**")
            .permitAll();
    }
}
