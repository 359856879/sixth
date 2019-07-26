package com.czxy.service;

import com.czxy.domain.Emp;

import java.util.List;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/23 08:24
 * @Description:
 */
public interface EmpService {


    List<Emp> findAll();

    void deleteEmp(String id);

    Emp findEmpById(String id);

    void addEmp(Emp emp);


}