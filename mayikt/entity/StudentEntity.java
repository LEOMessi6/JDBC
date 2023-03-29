package com.mayikt.entity;

public class StudentEntity {
    //实例层，就是对表做映射
    //学生对象。在java中定义数据库实体类层，不建议使用基本数据类型，会使用包装类
    private Long id;//默认值为null
    private String name;
    private Integer age;
    private String addrs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addrs='" + addrs + '\'' +
                '}';
    }

    public StudentEntity(Long id, String name, Integer age, String addrs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addrs = addrs;
    }
}
