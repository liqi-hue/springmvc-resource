package com.atguigu.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author: liqi
 * @create 2021-09-21 9:14 AM
 */
@ComponentScan(basePackages = "com.atguigu.springmvc",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
},useDefaultFilters = true)
@Configuration
public class SpringConfig {
}
