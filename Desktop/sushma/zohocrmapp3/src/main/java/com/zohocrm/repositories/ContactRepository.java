package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.contact;

public interface ContactRepository extends JpaRepository<contact,Long> {

}
