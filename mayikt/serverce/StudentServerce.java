package com.mayikt.serverce;

import com.mayikt.dao.Studentdao;
import com.mayikt.entity.StudentEntity;

import java.util.ArrayList;

public class StudentServerce {
    //业务逻辑层
    private Studentdao studentdao = new Studentdao();
    public ArrayList<StudentEntity> allStudent(){
        //通过业务逻辑层去调用dao层代码
        ArrayList<StudentEntity> studentEntities = Studentdao.inquireStudent("select * from mayikt_student");
        return studentEntities;
    }
    public ArrayList<StudentEntity> inquireByIdStudent(Long stuId){
        ArrayList<StudentEntity> byIdStudent = Studentdao.getByIdStudent(stuId);
        return byIdStudent;
    }
}
