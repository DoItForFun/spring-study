package com.autoconfig.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("rose")
    public void setName(String name) {
        this.name = name;
    }
}
