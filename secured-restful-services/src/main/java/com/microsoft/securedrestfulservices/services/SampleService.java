package com.microsoft.securedrestfulservices.services;

import org.springframework.stereotype.Service;

import com.microsoft.securedrestfulservices.dto.Contact;
@Service
public class SampleService {

	public static final Contact DEFAULT_CONTACT = new Contact("Digital OnUs",
	        "http://digitalonus.com", "gitlab@digitalonus.com");
	   public Contact printDetails() {
	   return DEFAULT_CONTACT;
	  }
}
