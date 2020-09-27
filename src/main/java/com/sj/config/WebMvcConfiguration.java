package com.sj.config;


import com.sj.web.AccessInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import javax.annotation.Resource;

/**
 * Created by chenguang 2019/8/2
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    AccessInterceptor accessInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessInterceptor).addPathPatterns("/**").excludePathPatterns("/api/**", "/test**", "/error", "/api/index/kaptcha", "/demo/test", "/resource/**", "/api/loan/*");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //支持 /user 和 /user/
        configurer.setUseSuffixPatternMatch(false).setUseTrailingSlashMatch(true);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //支持直接访问静态资源
        registry.addResourceHandler("/resource1/**").addResourceLocations("file:///H:/审计/后端/zhihuishenji/src/main/resources/static/" );
        registry.addResourceHandler("/resource/**").addResourceLocations("file:/home/data_vol/" );
        		
        //+ UploaderSettings.FILE_UPLOAD_PATH);

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*  registry.addViewController("/index").setViewName("index");*/
        registry.addViewController("/query/index").setViewName("query_index");
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//设置允许跨域的路径
                //.allowedOrigins("http://155.101.252.196:10005","http://155.101.252.220","https://wjzx.borf.cn:10001","http://localhost")//设置允许跨域请求的域名
                .allowedOrigins("*")//设置允许跨域请求的域名
                .allowedMethods("GET", "POST", "PUT", "DELETE")//设置允许的方法
                .maxAge(3600);//跨域允许时间
    }

}