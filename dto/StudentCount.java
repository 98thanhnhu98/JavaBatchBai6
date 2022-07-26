package com.example.Example4.dto;

public class StudentCount {
    private String name;
    private Long slg;

    public StudentCount(String name, Long slg) {
        this.name = name;
        this.slg = slg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSlg() {
        return slg;
    }

    public void setSlg(Long slg) {
        this.slg = slg;
    }
}
