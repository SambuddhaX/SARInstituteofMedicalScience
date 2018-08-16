package com.example.shreyesh.sarinstituteofmedicalscience;

public class Departments {
    private String departmentName;
    private String departmentImage;

    public Departments() {

    }

    public Departments(String departmentName, String departmentImage) {

        this.departmentName = departmentName;
        this.departmentImage = departmentImage;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentImage() {
        return departmentImage;
    }

    public void setDepartmentImage(String departmentImage) {
        this.departmentImage = departmentImage;
    }
}
