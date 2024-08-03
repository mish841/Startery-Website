package com.startery.resources.controllers;

public class MiscInformation {

    private String skills;
    private String tools;
    private String linkedIn;
    private String portfolio;
    private String biography;

    // Constructor
    public MiscInformation(String skills, String tools, String linkedIn, 
                                    String portfolio, String biography) {
        this.skills = skills;
        this.tools = tools;
        this.linkedIn = linkedIn;
        this.portfolio = portfolio;
        this.biography = biography;
    }

    // Getters and Setters
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
