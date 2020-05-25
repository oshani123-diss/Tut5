package com.e.testapplicationfirebase;

public class Student {
    private static final String SID = "STD";
    private String ID;
    private String name;
    private String address;
    private Integer conNo;
    private static  int num = 0;

    public Student() {
        num += 1;
    }

    public static String getSID(){
        return SID + num;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getConNo() {
        return conNo;
    }

    public void setConNo(int conNo) {
        this.conNo = conNo;
    }
}
