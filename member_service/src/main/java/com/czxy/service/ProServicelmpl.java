package com.czxy.service;

import com.czxy.dao.ProvincialMapper;
import com.czxy.domain.Provincial;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/23 08:35
 * @Description:
 */
@Service
@Transactional
public class ProServicelmpl implements ProService {


    @Resource
    private ProvincialMapper provincialMapper;


    @Override
    public List<Provincial> findAll() {

        List<Provincial> provincials = provincialMapper.selectAll();

        return provincials;
    }
}