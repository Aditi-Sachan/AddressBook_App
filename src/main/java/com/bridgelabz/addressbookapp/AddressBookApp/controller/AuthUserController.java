package com.bridgelabz.addressbookapp.AddressBookApp.controller;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AuthUserDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.dto.LoginDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.interfaces.IAuthService;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AuthUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthUserController {
//    @Autowired
//    AuthenticationService authenticationService;

    @Autowired
    @Qualifier("authenticationService")
    IAuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> register(@Valid @RequestBody AuthUserDTO userDTO) throws Exception{
        AuthUser user=authService.register(userDTO);
        ResponseDTO responseUserDTO =new ResponseDTO("User details is submitted!",user);
        return new ResponseEntity<>(responseUserDTO, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@Valid @RequestBody LoginDTO loginDTO){
        String result=authService.login(loginDTO);
        ResponseDTO responseUserDTO=new ResponseDTO("Login successfully!!",result);
        return  new ResponseEntity<>(responseUserDTO,HttpStatus.OK);
    }
}
