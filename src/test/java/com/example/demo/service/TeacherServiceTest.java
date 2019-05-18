package com.example.demo.service;

import com.example.demo.entity.TeacherEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by T009538 on 2019/5/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherServiceTest {
    @Autowired
    TeacherService teacherService;
    @Test
    public void getTeacherEntityByUsernameAndPass() throws Exception {
        TeacherEntity xiaomage = teacherService.getTeacherEntityByUsernameAndPass("xiaomag1e", "123456");
        Assert.assertNotNull("sssss",xiaomage);
    }

}