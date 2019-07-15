package com.tws.refactoring;

public class Driver {
    private int age;
    private static final int LEGAL_AGE=18;

    public Driver(){
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegalDriver() {
        return this.age>=LEGAL_AGE;
    }
}
