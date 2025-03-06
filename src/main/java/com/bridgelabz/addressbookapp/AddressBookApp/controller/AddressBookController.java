package com.bridgelabz.addressbookapp.AddressBookApp.controller;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AddressBook;
import com.bridgelabz.addressbookapp.AddressBookApp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    AddressBookService service;

    @PostMapping("/add")
    public ResponseEntity<String> addContact(@RequestBody AddressBookDTO dto) {
        service.addContact(dto);
        return ResponseEntity.ok("Contact added successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<List<AddressBook>> getAllContacts() {
        return ResponseEntity.ok(service.getAllContacts());
    }
}

