package com.bridgelabz.addressbookapp.AddressBookApp.service;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AddressBook;
import com.bridgelabz.addressbookapp.AddressBookApp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbookapp.AddressBookApp.interfaces.IAddressBookService;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    AddressBookRepository repository;

    // ✅ Add a new contact
    public void addContact(AddressBookDTO dto) {
        AddressBook contact = new AddressBook(null, dto.getName(), dto.getPhoneNumber(), dto.getEmail());
        repository.save(contact);
    }

    // ✅ Get all contacts
    public List<AddressBook> getAllContacts() {
        return repository.findAll();
    }

    // ✅ Get contact by ID
    public AddressBook getContactById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    // ✅ Update contact
    public void updateContact(Long id, AddressBookDTO dto) {
        AddressBook contact = getContactById(id);
        contact.setName(dto.getName());
        contact.setPhoneNumber(dto.getPhoneNumber());
        contact.setEmail(dto.getEmail());
        repository.save(contact);
    }

    // ✅ Delete contact
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}



