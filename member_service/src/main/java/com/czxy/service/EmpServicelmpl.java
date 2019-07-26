package com.czxy.service;

import com.czxy.dao.CityMapper;
import com.czxy.dao.EmpMapper;
import com.czxy.dao.ProvincialMapper;
import com.czxy.domain.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/23 08:24
 * @Description:
 */
@Service
@Transactional
public class EmpServicelmpl implements EmpService {


    @Resource
    private EmpMapper empMapper;

    @Resource
    private ProvincialMapper provincialMapper;

    @Resource
    private CityMapper cityMapper;

    @Override
    public List<Emp> findAll() {

        List<Emp> list = empMapper.selectAll();
        for (Emp emp : list) {

            emp.setProvincials(provincialMapper.selectByPrimaryKey(emp.getProvinceid()));
            emp.setCitys(cityMapper.selectByPrimaryKey(emp.getCity()));
        }

        return list;
    }

    @Override
    public void deleteEmp(String id) {

        //把id转成int类型的参数
        Integer num=Integer.parseInt(id);

        empMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Emp findEmpById(String id) {

        Integer num=Integer.parseInt(id);
        Emp emp = empMapper.selectByPrimaryKey(num);

        emp.setCitys(cityMapper.selectByPrimaryKey(emp.getCity()));
        emp.setProvincials(provincialMapper.selectByPrimaryKey(emp.getProvinceid()));

        return emp;
    }

     @Override
     public void addEmp(Emp emp){

        empMapper.insert(emp);

    }
}