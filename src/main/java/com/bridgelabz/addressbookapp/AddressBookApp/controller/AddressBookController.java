package com.bridgelabz.addressbookapp.AddressBookApp.controller;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AddressBook;
import com.bridgelabz.addressbookapp.AddressBookApp.service.AddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    AddressBookService service;

    // ✅ Create a new contact with validation
    @PostMapping("/add")
    public ResponseEntity<String> addContact(@Valid @RequestBody AddressBookDTO dto) {
        service.addContact(dto);
        return ResponseEntity.ok("Contact added successfully");
    }

    // ✅ Update an existing contact with validation
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateContact(@PathVariable Long id, @Valid @RequestBody AddressBookDTO dto) {
        service.updateContact(id, dto);
        return ResponseEntity.ok("Contact updated successfully");
    }

    // ✅ Get all contacts
    @GetMapping("/all")
    public ResponseEntity<List<AddressBook>> getAllContacts() {
        return ResponseEntity.ok(service.getAllContacts());
    }

    // ✅ Get a contact by ID
    @GetMapping("/{id}")
    public ResponseEntity<AddressBook> getContactById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getContactById(id));
    }

    // ✅ Delete a contact
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
        return ResponseEntity.ok("Contact deleted successfully");
    }
}




