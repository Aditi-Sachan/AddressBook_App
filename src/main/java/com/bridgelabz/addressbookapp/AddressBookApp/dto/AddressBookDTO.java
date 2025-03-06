package com.bridgelabz.addressbookapp.AddressBookApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddressBookDTO {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Phone number cannot be empty")
    private String phoneNumber;

    @Email(message = "Invalid email format")
    private String email;
}

