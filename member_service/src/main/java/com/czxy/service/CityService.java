package com.czxy.service;

import com.czxy.domain.City;

import java.util.List;

/**
 * @version v 1.0
 * @date 2019/7/23
 */
public interface CityService {

    List<City> findCity(String id);
}
