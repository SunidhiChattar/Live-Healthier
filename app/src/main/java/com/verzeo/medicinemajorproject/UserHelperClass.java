package com.verzeo.medicinemajorproject;

public class UserHelperClass {

     String name,dose,date,time;

    public UserHelperClass() {
    }

    public UserHelperClass(String name, String dose, String date, String time) {
        this.name = name;
        this.dose = dose;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
