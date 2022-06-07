package org.example;

public class Student {
    private int studentID;
    private String studentName;
    private String studentDateOfBirth;
    private String universityName;
    private String departmentCode;
    private String departmentName;
    private int studentYearOfEnrollment;

    public Student(int studentID, String studentName, String studentDateOfBirth, String universityName, String departmentCode, String departmentName, int studentYearOfEnrollment) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.universityName = universityName;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.studentYearOfEnrollment = studentYearOfEnrollment;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(String studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getStudentYearOfEnrollment() {
        return studentYearOfEnrollment;
    }

    public void setStudentYearOfEnrollment(int studentYearOfEnrollment) {
        this.studentYearOfEnrollment = studentYearOfEnrollment;
    }
}