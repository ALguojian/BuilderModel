package com.guojian.buildermodel.structureman;

/**
 * Created by Hello on 2017/9/28.
 * 实际创建者类
 */

public class ConcreateBuilder implements Builder {

    private Person person;

    public ConcreateBuilder() {
        person = new Person();
    }

    @Override
    public Builder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public Builder setSex(String sex) {
        person.setSex(sex);
        return this;
    }

    @Override
    public Builder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public Builder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    @Override
    public Builder isHaveStudy(boolean haveStudy) {
        person.setHaveStudy(haveStudy);
        return this;
    }

    @Override
    public Builder setHeight(float height) {
        person.setHeight(height);
        return this;
    }

    @Override
    public Builder setWeight(float weight) {
        person.setWeight(weight);
        return this;
    }

    @Override
    public Person create() {
        return person;
    }
}
