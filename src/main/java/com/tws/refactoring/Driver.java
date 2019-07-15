package com.tws.refactoring;

public class Driver {
    public int age;

    public Driver(){
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegalDriver() {
        return this.age>=18;
    }
}
