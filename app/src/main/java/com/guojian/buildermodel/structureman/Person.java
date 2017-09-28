package com.guojian.buildermodel.structureman;

/**
 * Created by Hello on 2017/9/28.
 */

public class Person extends BasePerson {

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHaveStudy(boolean haveStudy) {
        this.haveStudy = haveStudy;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
