package com.atguigu.springmvc.init;

import com.atguigu.springmvc.config.SpringConfig;
import com.atguigu.springmvc.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author: liqi
 * @create 2021-09-21 9:12 AM
 */

public class QuickAppStart extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Spring容器创建!");
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("SpringMVC容器创建!");
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
