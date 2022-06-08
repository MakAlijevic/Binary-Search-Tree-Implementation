package org.example;

public class Student {
    private int studentID;
    private String studentName;
    private String studentDateOfBirth;
    private String universityName;
    private String departmentCode;
    private String departmentName;
    private int studentYearOfEnrolment;

    public Student(int studentID, String studentName, String studentDateOfBirth, String universityName, String departmentCode, String departmentName, int studentYearOfEnrolment) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.universityName = universityName;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.studentYearOfEnrolment = studentYearOfEnrolment;
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

    public int getStudentYearOfEnrolment() {
        return studentYearOfEnrolment;
    }

    public void setStudentYearOfEnrolment(int studentYearOfEnrolment) {
        this.studentYearOfEnrolment = studentYearOfEnrolment;
    }
    public String toString() {
        return "\n" + "Student ID: " + this.studentID + "\n" + "Name and surname: " + this.studentName + "\n" + "Date of birth: " + this.studentDateOfBirth + "\n" + "University: " + this.universityName
                + "\n" + "Department code: " + this.departmentCode + "\n" + "Department: " + this.departmentName + "\n" + "Year of enrolment: " + this.studentYearOfEnrolment + "\n\n";
    }
}
