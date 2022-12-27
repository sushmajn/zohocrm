package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceimpl implements EmailService {

	
	@Autowired
	private JavaMailSender javaMailSender;//this is the very important interface that helps me to trigger clicking on send button
	
	
	
	
	@Override
	public void sendSimpleMail(String to, String sub, String emailBody) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setSubject(sub);
        mailMessage.setText(emailBody);
        javaMailSender.send(mailMessage);


	}

}
