package com.example.demo.service;

import com.example.demo.dao.TeacherDao;
import com.example.demo.entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by T009538 on 2019/5/18.
 */
@Service
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;

    public List<TeacherEntity> getall(){
        return teacherDao.findAll();
    }

    public  TeacherEntity getTeacherEntityByUsernameAndPass(String username,String pass){
        return  teacherDao.getTeacherEntityByUsernameAndPass(username,pass);
    }
}
