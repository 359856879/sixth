package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/11 15:03
 * @Description:
 */
@Table(name = "provincial")
public class Provincial {

    @Id
    private Integer provincialid;

    private String provincialname;

    @Override
    public String toString() {
        return "Provincial{" +
                "provincialid=" + provincialid +
                ", provincialname='" + provincialname + '\'' +
                '}';
    }

    public Integer getProvincialid() {
        return provincialid;
    }

    public void setProvincialid(Integer provincialid) {
        this.provincialid = provincialid;
    }

    public String getProvincialname() {
        return provincialname;
    }

    public void setProvincialname(String provincialname) {
        this.provincialname = provincialname;
    }

    public Provincial() {
    }

    public Provincial(Integer provincialid, String provincialname) {
        this.provincialid = provincialid;
        this.provincialname = provincialname;
    }
}