package com.mayikt.Test;

import com.mayikt.entity.StudentEntity;
import com.mayikt.serverce.StudentServerce;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        StudentServerce studentServerce = new StudentServerce();
        ArrayList<StudentEntity> studentEntities = studentServerce.allStudent();
        for (StudentEntity stu:
                studentEntities) {
            System.out.println(stu.toString());
        }
    }
}
