package com.online.examination.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="city/api")
public class CityController {
	
	@Autowired
	private CityServices cityServices;
	
	@RequestMapping(value="/allCity")
	public List<City> getAllCity(){
		return cityServices.getAllCity();
	}
	
	@RequestMapping(value="/city/{id}")
	public Optional<City> getCity(@PathVariable Integer id) {
		return cityServices.getCity(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addCity")
	public void addCity(@RequestBody City city) {
		cityServices.addCity(city);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateCity/{id}")
	public void updateCity(@RequestBody City city, @PathVariable Integer id) {
		cityServices.updateCity(id, city);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteCity/{id}")
	public void deleteCity(@RequestBody City city, @PathVariable Integer id) {
		cityServices.deleteCity(id, city);
	}
}
