package com.bus.bean;

public class Admin {
    private String aName;
    private String aAddr;
    private String aEmail;
    private String aPass;

    public Admin() {
    }

    public Admin(String aName, String aAddr, String aEmail, String aPass) {
        this.aName = aName;
        this.aAddr = aAddr;
        this.aEmail = aEmail;
        this.aPass = aPass;
    }

    public String getaName() {
        return this.aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaAddr() {
        return this.aAddr;
    }

    public void setaAddr(String aAddr) {
        this.aAddr = aAddr;
    }

    public String getaEmail() {
        return this.aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getaPass() {
        return this.aPass;
    }

    public void setaPass(String aPass) {
        this.aPass = aPass;
    }

    public String toString() {
        return "Admin [aName=" + this.aName + ", aAddr=" + this.aAddr + ", aEmail=" + this.aEmail + ", aPass=" + this.aPass + "]";
    }
}

