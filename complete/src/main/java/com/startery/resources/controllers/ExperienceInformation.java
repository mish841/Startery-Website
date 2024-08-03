package com.startery.resources.controllers;

public class ExperienceInformation {

    private String experienceTitle;
    private String companyName;
    private String experienceType;
    private String startDate;
    private String endDate;
    private String responsibilitiesAndAchievements;

    // Constructor
    public ExperienceInformation(String experienceTitle, String companyName, String experienceType, 
                                 String startDate, String endDate, String responsibilitiesAndAchievements) {
        this.experienceTitle = experienceTitle;
        this.companyName = companyName;
        this.experienceType = experienceType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.responsibilitiesAndAchievements = responsibilitiesAndAchievements;
    }

    // Getters and Setters
    public String getExperienceTitle() {
        return experienceTitle;
    }

    public void setExperienceTitle(String experienceTitle) {
        this.experienceTitle = experienceTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExperienceType() {
        return experienceType;
    }

    public void setExperienceType(String experienceType) {
        this.experienceType = experienceType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getResponsibilitiesAndAchievements() {
        return responsibilitiesAndAchievements;
    }

    public void setResponsibilitiesAndAchievements(String responsibilitiesAndAchievements) {
        this.responsibilitiesAndAchievements = responsibilitiesAndAchievements;
    }
}
