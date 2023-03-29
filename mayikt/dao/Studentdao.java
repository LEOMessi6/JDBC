package com.mayikt.dao;

import com.mayikt.entity.StudentEntity;

import java.sql.*;
import java.util.ArrayList;

public class Studentdao {
    //学生数据对象访问层
    public static ArrayList<StudentEntity> inquireStudent(String sql) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1.java连接数据库，并查询数据
        //2.将这些存入到ArrayList集合中
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaweb?serverTimezone=UTC", "root", "123");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            ArrayList<StudentEntity> studentEntities = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String adress = resultSet.getString("adress");
                //将db中查询到的数据封装成java学生对象
                StudentEntity studentEntity = new StudentEntity(id, name, age, adress);
                //将该对象存入到集合中
                studentEntities.add(studentEntity);
            }
            return studentEntities;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static ArrayList<StudentEntity> getByIdStudent(Long stuId){
        //根据学生ID查询学生信息
        if (stuId == null){
            return null;
        }else {
            ArrayList<StudentEntity> studentEntities = inquireStudent("select * from mayikt_student where id=" + stuId);
            return studentEntities;
        }
    }
}

