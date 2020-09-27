package com.sj.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * Created by chenguang on 2019/11/8.
 */
@Configuration
@MapperScan(basePackages = "com.sj.mapper", sqlSessionTemplateRef = "wjSqlSessionTemplate")
public class DruidDataSourceConfig {

    @Primary
    @Bean(name = "wjDataSource")
    @ConfigurationProperties("spring.datasource.druid.wjcrm")
    public DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "wjSqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("wjDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:**/mapper/*.xml"));
        return bean.getObject();
    }

    @Primary
    @Bean(name = "wjSqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("wjSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}