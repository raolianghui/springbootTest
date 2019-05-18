package com.example.demo.dao;

import com.example.demo.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by T009538 on 2019/5/18.
 */
public interface TeacherDao extends JpaRepository<TeacherEntity,Integer> {
    TeacherEntity getTeacherEntityByUsernameAndPass(String username,String pass);
}
