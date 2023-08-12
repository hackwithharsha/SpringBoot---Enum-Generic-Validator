package com.example.demo.constants;

public enum Names {

    HAR_SHA("harsha"),
    PAVAN("pavan");

    private String name;

    private Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
