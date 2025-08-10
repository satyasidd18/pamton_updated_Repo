package com.careermatch.pamtenproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecruiterProfileResponse {
    private String userId;
    private String fullName;       // ✅ Add this
    private String email;
    private String companyName;
    private String phoneNumber;
    private String jobTitle;
}
