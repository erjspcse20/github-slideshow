package com.online.examination.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cou/api")
public class CountryController {
	@Autowired
	private CountryService CountryService;
	
	@RequestMapping("/allCountry")
	public List<Country> getAllCountrys() {
		return CountryService.getAllCountry();
	}
	
	@RequestMapping("/country/{uuid}")
	public Optional<Country> getCountry(@PathVariable String uuid) {
		//either you can give same name as parameter argument 
		//or put path variable name of request mapping to path
		//variable
		
		return CountryService.getCountry(uuid);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addCountry")
	public void addCountry(@RequestBody Country country) {
		CountryService.addCountry(country);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updatecountry/{id}")
	public void updateCountry(@RequestBody Country country, @PathVariable String id) {
		CountryService.updateCountry(id, country);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deletecountry/{id}")
	public void deleteCountry(@RequestBody Country country, @PathVariable String id) {
		CountryService.deleteCountry(id, country);
	}
}
