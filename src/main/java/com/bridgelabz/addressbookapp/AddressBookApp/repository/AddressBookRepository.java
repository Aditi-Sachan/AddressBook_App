package com.bridgelabz.addressbookapp.AddressBookApp.repository;

import com.bridgelabz.addressbookapp.AddressBookApp.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {
}

