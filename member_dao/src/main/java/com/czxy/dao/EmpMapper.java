package com.czxy.dao;

import com.czxy.domain.Emp;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/23 08:23
 * @Description:
 */

@org.apache.ibatis.annotations.Mapper
public interface EmpMapper extends Mapper<Emp> {


    void select();
}