package com.example.billing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 自定义配置类
 * @author Administrator
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    //省略部分代码
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor()).addPathPatterns("/sys_admin/**");
    }

}