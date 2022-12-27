package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.contact;
import com.zohocrm.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	@Override
	public void saveContact(contact contact) {
		contactRepo.save(contact);

	}
	@Override
	public List<contact> getAllContacts() {
        List<contact> contacts = contactRepo.findAll();
		return contacts;
	}
	@Override
	public contact getContactById(long id) {
		Optional<contact> findById = contactRepo.findById(id);
		contact contact = findById.get();
		return contact;
	}

}
