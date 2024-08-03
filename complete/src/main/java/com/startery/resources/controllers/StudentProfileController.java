package com.startery.resources.controllers;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentProfileController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/studentprofile/{id}")
    public StudentProfile studentProfile(@PathVariable("id") Long id) {

        // Creating instances of each information section
        PersonalInformation personalInfo = new PersonalInformation("Mishal", "Khan", "mishal@gmail.com", "508-474-5", "NJ");
        EducationInformation educationInfo = new EducationInformation("May", "2025", "Bachelor's", "Computer Science", "Mathematics", null, "AI Certificate", "Dean's List");
        ExperienceInformation experienceInfo = new ExperienceInformation("Intern", "Tech Company", "Full-time", "June 2023", "August 2023", "Developed features");
        ProfessionalInterests professionalInterests = new ProfessionalInterests("Tech", "Software Engineer", "NYC", "Lead a tech team");
        MiscInformation miscInformation = new MiscInformation("Java, Python", "Git, AWS", "linkedin.com/mishalkhan", "portfolio.com/mishalkhan", "Passionate coder");

        // Creating a StudentProfile object using these instances
        StudentProfile studentProfile = new StudentProfile(id, personalInfo, educationInfo, experienceInfo, professionalInterests, miscInformation);

        return studentProfile;
    }
}

// package com.startery.resources.controllers;
// import java.util.concurrent.atomic.AtomicLong;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.*;
// import java.util.Map;
// import java.util.concurrent.ConcurrentHashMap;

// @RestController
// public class StudentProfileController {

//     private Map<Long, StudentProfile> studentProfiles = new ConcurrentHashMap<>();
//     private final AtomicLong counter = new AtomicLong();

//     @PostMapping("/studentprofile")
//     public StudentProfile createStudentProfile(@RequestBody StudentProfile studentProfile) {
//         Long id = counter.incrementAndGet();
//         studentProfile.setId(id);
//         studentProfiles.put(id, studentProfile);
//         return studentProfile;
//     }

//     @GetMapping("/studentprofile/{id}")
//     public StudentProfile getStudentProfile(@PathVariable("id") Long id) {
//         return studentProfiles.get(id);
//     }
// }
