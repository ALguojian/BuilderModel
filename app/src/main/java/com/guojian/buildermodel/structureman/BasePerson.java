package com.guojian.buildermodel.structureman;

/**
 * Created by Hello on 2017/9/28.
 */

public abstract class BasePerson {

    public int age;
    public String sex;
    public String name;
    public String address;
    public boolean haveStudy;
    public float height;
    public float weight;

    public BasePerson() {
    }

    @Override
    public String toString() {
        return "BasePerson{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", haveStudy=" + haveStudy +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public abstract void setAge(int age);
    public abstract void setSex(String age);
    public abstract void setName(String age);
    public abstract void setAddress(String age);
    public abstract void setHaveStudy(boolean age);
    public abstract void setHeight(float age);
    public abstract void setWeight(float age);

}
