package com.careermatch.pamtenproject.dto;

public class RecruiterProfileResponse {
    private String name;
    private String email;
    private String company;

    // Default constructor
    public RecruiterProfileResponse() {}

    // Parameterized constructor
    public RecruiterProfileResponse(String name, String email, String company) {
        this.name = name;
        this.email = email;
        this.company = company;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
}
