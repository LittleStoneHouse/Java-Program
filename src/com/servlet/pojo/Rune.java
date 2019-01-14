package com.servlet.pojo;

public class Rune {
    private int id;
    private String runeName;
    private String weapInfo;
    private String armrInfo;
    private String shidInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuneName() {
        return runeName;
    }

    public void setRuneName(String runeName) {
        this.runeName = runeName;
    }

    public String getWeapInfo() {
        return weapInfo;
    }

    public void setWeapInfo(String weapInfo) {
        this.weapInfo = weapInfo;
    }

    public String getArmrInfo() {
        return armrInfo;
    }

    public void setArmrInfo(String armrInfo) {
        this.armrInfo = armrInfo;
    }

    public String getShidInfo() {
        return shidInfo;
    }

    public void setShidInfo(String shidInfo) {
        this.shidInfo = shidInfo;
    }

    @Override
    public String toString() {
        return "Rune{" +
                "id=" + id +
                ", runeName='" + runeName + '\'' +
                ", weapInfo='" + weapInfo + '\'' +
                ", armrInfo='" + armrInfo + '\'' +
                ", shidInfo='" + shidInfo + '\'' +
                '}';
    }
}