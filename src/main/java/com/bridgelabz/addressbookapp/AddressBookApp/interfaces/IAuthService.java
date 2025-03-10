package com.bridgelabz.addressbookapp.AddressBookApp.interfaces;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AuthUserDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.dto.LoginDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AuthUser;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface IAuthService {
    AuthUser register(@Valid AuthUserDTO userDTO);

    String login(@Valid LoginDTO loginDTO);
}
