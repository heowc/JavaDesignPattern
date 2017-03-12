package com.tistory.heowc.composite;

public class File implements Node {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("File Name : %s", name);
    }
}
