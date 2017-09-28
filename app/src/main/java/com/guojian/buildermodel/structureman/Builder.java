package com.guojian.buildermodel.structureman;

/**
 * Created by Hello on 2017/9/28.
 */

public interface Builder {

    public Builder setAge(int age);

    public Builder setSex(String sex);

    public Builder setName(String name);

    public Builder setAddress(String address);

    public Builder isHaveStudy(boolean haveStudy);

    public Builder setHeight(float height);

    public Builder setWeight(float weight);

    public Person create();
}

