package com.startery.resources.controllers;

public class StudentProfile {

    private Long id;
    private PersonalInformation personalInformation;
    private EducationInformation educationInformation;
    private ExperienceInformation experienceInformation;
    private ProfessionalInterests professionalInterests;
    private MiscInformation miscInformation;

    // Constructor
    public StudentProfile(Long id, PersonalInformation personalInformation, 
                          EducationInformation educationInformation, 
                          ExperienceInformation experienceInformation,
                          ProfessionalInterests professionalInterests,
                          MiscInformation miscInformation) {
        this.id = id;
        this.personalInformation = personalInformation;
        this.educationInformation = educationInformation;
        this.experienceInformation = experienceInformation;
        this.professionalInterests = professionalInterests;
        this.miscInformation = miscInformation;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public EducationInformation getEducationInformation() {
        return educationInformation;
    }

    public void setEducationInformation(EducationInformation educationInformation) {
        this.educationInformation = educationInformation;
    }

    public ExperienceInformation getExperienceInformation() {
        return experienceInformation;
    }

    public void setExperienceInformation(ExperienceInformation experienceInformation) {
        this.experienceInformation = experienceInformation;
    }

    public ProfessionalInterests getProfessionalInterests() {
        return professionalInterests;
    }

    public void setProfessionalInterests(ProfessionalInterests professionalInterests) {
        this.professionalInterests = professionalInterests;
    }

    public MiscInformation getMiscellaneousInformation() {
        return miscInformation;
    }

    public void setMiscellaneousInformation(MiscInformation miscInformation) {
        this.miscInformation = miscInformation;
    }
}
