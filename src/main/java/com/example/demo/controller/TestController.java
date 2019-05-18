package com.example.demo.controller;

import com.example.demo.VO.ResultVO;
import com.example.demo.entity.TeacherEntity;
import com.example.demo.enums.ResultEnums;
import com.example.demo.service.TeacherService;
import com.example.demo.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by T009538 on 2019/5/18.
 */
@RestController
@RequestMapping("/api")
@Api(
        tags = "测试"
)
public class TestController {
    @Autowired
    TeacherService teacherService;
    @RequestMapping("/qwe")
    public  String getname(){
        return  "hello";
    }

    @RequestMapping("findall")
    public Object findall(){
        return  teacherService.getall();
    }
    @RequestMapping("login")
    @ApiOperation(value = "测试" ,httpMethod = "GET")
    public Object getTeacherEntityByUsernameAndPass(String username,String pass){
        TeacherEntity teacherEntity=teacherService.getTeacherEntityByUsernameAndPass(username, pass);
        if(teacherEntity==null){
            return ResultUtil.fail(ResultEnums.LOGIN_FAIL);
        }
        return  ResultUtil.success(teacherService.getTeacherEntityByUsernameAndPass(username, pass));
    }
}
