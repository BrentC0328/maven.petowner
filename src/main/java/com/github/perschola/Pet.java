package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Pet {
    private String name;
    private Integer age;

    public Pet() {
        this.name = "";
        this.age = -1;
    }

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
