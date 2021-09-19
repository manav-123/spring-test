package com.microsoft.securedrestfulservices.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.microsoft.securedrestfulservices.dto.Contact;
import com.microsoft.securedrestfulservices.services.SampleService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class SampleController {
	
	   private final SampleService sampleService;

	   @GetMapping("/samples")
	   @PreAuthorize("hasRole('ROLE_USER')")   
	   @ResponseStatus(HttpStatus.OK)
	   public Contact getContactDetails() {
	       return sampleService.printDetails();
	   }


}
