package com.test.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Mapper
@RefreshScope
public interface TestDao {
    public void test();
}
