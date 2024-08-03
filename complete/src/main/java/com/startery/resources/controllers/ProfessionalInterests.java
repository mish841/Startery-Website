package com.startery.resources.controllers;

public class ProfessionalInterests {

    private String industryPreferences;
    private String rolePreferences;
    private String locationPreferences;
    private String careerGoals;

    // Constructor
    public ProfessionalInterests(String industryPreferences, String rolePreferences, 
                                 String locationPreferences, String careerGoals) {
        this.industryPreferences = industryPreferences;
        this.rolePreferences = rolePreferences;
        this.locationPreferences = locationPreferences;
        this.careerGoals = careerGoals;
    }

    // Getters and Setters
    public String getIndustryPreferences() {
        return industryPreferences;
    }

    public void setIndustryPreferences(String industryPreferences) {
        this.industryPreferences = industryPreferences;
    }

    public String getRolePreferences() {
        return rolePreferences;
    }

    public void setRolePreferences(String rolePreferences) {
        this.rolePreferences = rolePreferences;
    }

    public String getLocationPreferences() {
        return locationPreferences;
    }

    public void setLocationPreferences(String locationPreferences) {
        this.locationPreferences = locationPreferences;
    }

    public String getCareerGoals() {
        return careerGoals;
    }

    public void setCareerGoals(String careerGoals) {
        this.careerGoals = careerGoals;
    }
}
