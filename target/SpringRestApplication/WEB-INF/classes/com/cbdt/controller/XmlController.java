package com.cbdt.controller;

import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbdt.model.PersonalDetails;


@RestController
@RequestMapping("/PersonalDetails")
public class XMLController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public @ResponseBody PersonalDetails getPersonalDetailsInXML(@PathVariable String name ) {

		PersonalDetails pd = new PersonalDetails();
		pd.setFirstName(name);
		pd.setLastName("dsf");
		pd.setAddress1("dsfs");
		pd.setAddress2("sdfsdf");
		pd.setCity("sdfsf");
		pd.setState("fdgdfgdfg");
		
		return pd;

	}
	
}