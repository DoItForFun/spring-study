package com.ioc.pojo;

public class UserT {
    private String name;
    public UserT(){
        System.out.println("被创建了");
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
