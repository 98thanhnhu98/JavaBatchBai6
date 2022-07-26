package com.example.Example4.dto;

public class SubjectCount {
    private int sem;
    private long slg;

    public SubjectCount(int sem, long slg) {
        this.sem = sem;
        this.slg = slg;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public long getSlg() {
        return slg;
    }

    public void setSlg(long slg) {
        this.slg = slg;
    }
}
