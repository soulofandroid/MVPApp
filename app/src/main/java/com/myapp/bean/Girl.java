package com.myapp.bean;

public class Girl {
    String name;
    int age;
    String sex;
    String address;
    String des;

    public Girl(String name, int age, String sex, String address, String des) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.des = des;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
