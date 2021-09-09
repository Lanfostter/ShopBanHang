package com.example.ShopDemo.Model;

import org.springframework.web.multipart.MultipartFile;

public class Employees {
    private int id;
    private String name;
    private int age;
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employees() {
    }

    public Employees(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
