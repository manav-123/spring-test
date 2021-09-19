package com.microsoft.securedrestfulservices.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Contact {

	   private final String name;
	    private final String url;
	    private final String email;
}
