package com.bridgelabz.addressbookapp.AddressBookApp.interfaces;

import com.bridgelabz.addressbookapp.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.AddressBookApp.model.AddressBook;

import java.util.List;

public interface IAddressBookService {
    void addContact(AddressBookDTO dto);
    List<AddressBook> getAllContacts();
    AddressBook getContactById(Long id);
    void updateContact(Long id, AddressBookDTO dto);
    void deleteContact(Long id);
}

