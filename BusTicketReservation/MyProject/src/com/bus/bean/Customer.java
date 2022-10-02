package com.bus.bean;

public class Customer {
    private String cMob;
    private int refId;
    private int bId;
    private String bName;
    private String bRoute_From;
    private String bRoute_To;
    private String bType;
    private int bookedSeats;
    private String bDeptDateTime;
    private String bArriDateTime;
    private int bAdminId;
    private String bConPerName;
    private String bConPerMob;

    public Customer() {
    }

    public Customer(String cMob, int refId, int bId, String bName, String bRoute_From, String bRoute_To, String bType, int bookedSeats, String bDeptDateTime, String bArriDateTime, int bAdminId, String bConPerName, String bConPerMob) {
        this.cMob = cMob;
        this.refId = refId;
        this.bId = bId;
        this.bName = bName;
        this.bRoute_From = bRoute_From;
        this.bRoute_To = bRoute_To;
        this.bType = bType;
        this.bookedSeats = bookedSeats;
        this.bDeptDateTime = bDeptDateTime;
        this.bArriDateTime = bArriDateTime;
        this.bAdminId = bAdminId;
        this.bConPerName = bConPerName;
        this.bConPerMob = bConPerMob;
    }

    public String getcMob() {
        return this.cMob;
    }

    public void setcMob(String cMob) {
        this.cMob = cMob;
    }

    public int getRefId() {
        return this.refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    public int getbId() {
        return this.bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return this.bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbRoute_From() {
        return this.bRoute_From;
    }

    public void setbRoute_From(String bRoute_From) {
        this.bRoute_From = bRoute_From;
    }

    public String getbRoute_To() {
        return this.bRoute_To;
    }

    public void setbRoute_To(String bRoute_To) {
        this.bRoute_To = bRoute_To;
    }

    public String getbType() {
        return this.bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public int getBookedSeats() {
        return this.bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getbDeptDateTime() {
        return this.bDeptDateTime;
    }

    public void setbDeptDateTime(String bDeptDateTime) {
        this.bDeptDateTime = bDeptDateTime;
    }

    public String getbArriDateTime() {
        return this.bArriDateTime;
    }

    public void setbArriDateTime(String bArriDateTime) {
        this.bArriDateTime = bArriDateTime;
    }

    public int getbAdminId() {
        return this.bAdminId;
    }

    public void setbAdminId(int bAdminId) {
        this.bAdminId = bAdminId;
    }

    public String getbConPerName() {
        return this.bConPerName;
    }

    public void setbConPerName(String bConPerName) {
        this.bConPerName = bConPerName;
    }

    public String getbConPerMob() {
        return this.bConPerMob;
    }

    public void setbConPerMob(String bConPerMob) {
        this.bConPerMob = bConPerMob;
    }

    public String toString() {
        return "Customer [cMob=" + this.cMob + ", refId=" + this.refId + ", bId=" + this.bId + ", bName=" + this.bName + ", bRoute_From=" + this.bRoute_From + ", bRoute_To=" + this.bRoute_To + ", bType=" + this.bType + ", bookedSeats=" + this.bookedSeats + ", bDeptDateTime=" + this.bDeptDateTime + ", bArriDateTime=" + this.bArriDateTime + ", bAdminId=" + this.bAdminId + ", bConPerName=" + this.bConPerName + ", bConPerMob=" + this.bConPerMob + "]";
    }
}

