package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/11 15:04
 * @Description:
 */
@Table(name = "city")
public class City {

    @Id
    private Integer cityid;

    private String cityname;

   private Integer provincialid;

    @Override
    public String toString() {
        return "City{" +
                "cityid=" + cityid +
                ", cityname='" + cityname + '\'' +
                ", provincialid=" + provincialid +
                '}';
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getProvincialid() {
        return provincialid;
    }

    public void setProvincialid(Integer provincialid) {
        this.provincialid = provincialid;
    }

    public City() {
    }

    public City(Integer cityid, String cityname, Integer provincialid) {
        this.cityid = cityid;
        this.cityname = cityname;
        this.provincialid = provincialid;
    }
}