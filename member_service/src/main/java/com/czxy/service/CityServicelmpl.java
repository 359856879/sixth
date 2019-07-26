package com.czxy.service;

import com.czxy.dao.CityMapper;
import com.czxy.domain.City;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/23 09:04
 * @Description:
 */
@Service
@Transactional
public class CityServicelmpl implements CityService{


    @Resource
    private CityMapper cityMapper;


    @Override
    public List<City> findCity(String id) {
        Example example = new Example(City.class);
        Example.Criteria criteria = example.createCriteria();

        criteria.andEqualTo("provincialid",id);

        List<City> cities = cityMapper.selectByExample(example);

        return cities;
    }
}