package com.startery.resources.controllers;

public class EducationInformation {

    private String graduationMonth;
    private String graduationYear;
    private String degree;
    private String major;
    private String minor;
    private String secondMajor;
    private String certificate;
    private String academicAchievements;

    // Constructor
    public EducationInformation(String graduationMonth, String graduationYear, String degree, 
                                String major, String minor, String secondMajor, 
                                String certificate, String academicAchievements) {
        this.graduationMonth = graduationMonth;
        this.graduationYear = graduationYear;
        this.degree = degree;
        this.major = major;
        this.minor = minor;
        this.secondMajor = secondMajor;
        this.certificate = certificate;
        this.academicAchievements = academicAchievements;
    }

    // Getters and Setters
    public String getGraduationMonth() {
        return graduationMonth;
    }

    public void setGraduationMonth(String graduationMonth) {
        this.graduationMonth = graduationMonth;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getSecondMajor() {
        return secondMajor;
    }

    public void setSecondMajor(String secondMajor) {
        this.secondMajor = secondMajor;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getAcademicAchievements() {
        return academicAchievements;
    }

    public void setAcademicAchievements(String academicAchievements) {
        this.academicAchievements = academicAchievements;
    }
}
