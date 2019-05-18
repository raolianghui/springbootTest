package com.example.demo.entity;



import javax.persistence.*;

/**
 * Created by T009538 on 2019/5/18.
 */
@Entity
@Table(name = "teacher")
public class TeacherEntity {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;
    private String nickName;
    private String pass;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
