package com.czxy.controller;

import com.czxy.domain.City;
import com.czxy.domain.Emp;
import com.czxy.domain.Provincial;
import com.czxy.service.CityService;
import com.czxy.service.EmpService;
import com.czxy.service.ProService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: 传智新星123456789
 * @Date: 2019/7/23 08:17
 * @Description:
 *
 */
@RestController
@RequestMapping("emp")
public class EmpServlet {

    @Resource
    private EmpService empService;

    @Resource
    private ProService proService;

    @Resource
    private CityService cityService;


    /**
     * 展示所有
     * @return
     */
    @GetMapping("findAll")
    public ResponseEntity<List<Emp>> findAll(){

        try {
            List<Emp> all = empService.findAll();
            return new ResponseEntity<>(all,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    /**
     * 删除
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){

        System.out.println("需要删除对象的id:"+id);

        try {
            empService.deleteEmp(id);
            System.out.println("删除成功!");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }

    /**
     * 详情
     */
    @GetMapping("findEmp/{id}")
    public ResponseEntity<Emp> findEmpById(@PathVariable String id){
        //详情id
        System.out.println("详情id:"+id);

        try {
            Emp emp = empService.findEmpById(id);
            return new ResponseEntity<>(emp,HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }
    /**
     * 添加
     */
    @PostMapping("add")
    public ResponseEntity<Void> add(MultipartFile file,Emp emp) throws IOException {

        System.out.println("需要添加的对象:"+emp);

        //把图片下载到本地项目中
        file.transferTo(new File("G:\\idea arc\\IDEAmaven\\springboot_day0723_member\\member_web\\src\\main\\resources\\static\\img\\"+file.getOriginalFilename()));

        emp.setImgsrc("img/"+file.getOriginalFilename());

        //调用工程的添加方法
        try {
            empService.addEmp(emp);
            return new ResponseEntity<>(HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);


        }

    }

    /**
     * 查询所有的省份
     */
    @GetMapping("findPro")
    public ResponseEntity<List<Provincial>> find(){

        List<Provincial> all = proService.findAll();

        return new ResponseEntity<>(all,HttpStatus.OK);
    }

    /**
     * 查询对应的市区
     */
    @GetMapping("findCity/{id}")
    public ResponseEntity<List<City>> findAll(@PathVariable String id){


        System.out.println("省份id:"+id);
        List<City> city = cityService.findCity(id);

        return new ResponseEntity<>(city,HttpStatus.OK);


    }
}
