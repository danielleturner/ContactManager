package com.example.contactdatabase.repositories;

import com.example.contactdatabase.Models.ContactName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface contactRepository extends JpaRepository<ContactName, Long> {
}
