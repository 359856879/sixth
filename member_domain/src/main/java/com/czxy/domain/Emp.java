package com.czxy.domain;

import javax.persistence.Id;

/**
 * @Auther: 传智新星
 * @Date: 2019/7/11 15:06
 * @Description:
 */
public class Emp {

    @Id
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String imgsrc;

    private Integer provinceid;

    private Integer city;

    //省对应的对象
    private City citys;

    //市对应的对象
    private Provincial provincials;


    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", provinceid=" + provinceid +
                ", city=" + city +
                ", citys=" + citys +
                ", provincials=" + provincials +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public City getCitys() {
        return citys;
    }

    public void setCitys(City citys) {
        this.citys = citys;
    }

    public Provincial getProvincials() {
        return provincials;
    }

    public void setProvincials(Provincial provincials) {
        this.provincials = provincials;
    }

    public Emp() {
    }

    public Emp(Integer id, String name, Integer age, String sex, String imgsrc, Integer provinceid, Integer city, City citys, Provincial provincials) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.imgsrc = imgsrc;
        this.provinceid = provinceid;
        this.city = city;
        this.citys = citys;
        this.provincials = provincials;
    }
}