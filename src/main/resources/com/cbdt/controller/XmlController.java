package com.cbdt.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbdt.model.PersonalDetails;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.;

@RestController
@RequestMapping("/personal")
public class XMLController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResonseBody PersonalDetails getPersonalDetailsInXML( ) {
		
		ObjectMapper mapper=new ObjectMapper();
	try{
		Personaletails pd = mapper.readValue(new URL("http://localhost:8080/SpringRestApplication/user.json"));
		
	
	
	} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pd;

	}
	
}
