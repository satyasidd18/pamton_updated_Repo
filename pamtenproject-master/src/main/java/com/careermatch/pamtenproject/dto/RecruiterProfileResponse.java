package com.careermatch.pamtenproject.dto;

public class RecruiterProfileResponse {
    private Long userId;          // From User
    private String name;          // Recruiter's full name
    private String email;         // From User
    private String companyName;   // Recruiter's company
    private String phoneNumber;   // Contact phone number
    private String jobTitle;      // Recruiter's title or position

    // Default constructor
    public RecruiterProfileResponse() {
    }

    // Parameterized constructor
    public RecruiterProfileResponse(Long userId, String name, String email, String companyName, String phoneNumber, String jobTitle) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
