package com.guojian.buildermodel.structureman;

/**
 * Created by Hello on 2017/9/28.
 */

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(int age, String sex, String name, String address, boolean haveStudy, float height, float weight) {

        builder.setAge(age);
        builder.setAddress(address);
        builder.setName(name);
        builder.setHeight(height);
        builder.setWeight(weight);
        builder.isHaveStudy(haveStudy);
        builder.setSex(sex);
    }
}
