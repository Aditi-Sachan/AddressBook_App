package com.bridgelabz.addressbookapp.AddressBookApp.service;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AddressBook;
import com.bridgelabz.addressbookapp.AddressBookApp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {

    @Autowired
    AddressBookRepository repository;

    public void addContact(AddressBookDTO dto) {
        AddressBook contact = new AddressBook(null, dto.getName(), dto.getPhoneNumber(), dto.getEmail());
        repository.save(contact);
    }

    public List<AddressBook> getAllContacts() {
        return repository.findAll();
    }
}


