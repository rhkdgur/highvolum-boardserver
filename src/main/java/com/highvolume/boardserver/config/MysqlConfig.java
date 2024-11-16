package com.highvolume.boardserver.config;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * packageName    : com.highvolume.boardserver.config
 * fileName       : MysqlConfig
 * author         : GAMJA
 * date           : 2024/11/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/16        GAMJA       최초 생성
 */
@Configuration
@MapperScan(basePackages = "com.highvolume.boardserver.mapper")
public class MysqlConfig {
    public SqlSessionFactory sqlSessionFactory(DataSource datasource) throws Exception{
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(datasource);

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactoryBean.setMapperLocations(resolver.getResource("classpath:mappers/*.xml"));

        Resource mybatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");
        sessionFactoryBean.setConfigLocation(mybatisConfig);
        return sessionFactoryBean.getObject();
    }
}
