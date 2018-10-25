package com.online.examination.city;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.examination.state.State;

@Service
public class CityServices{
	
	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getAllCity(){
		List<City> cityes = new ArrayList();
		cityRepository.findAll()
			.forEach(cityes::add);
		return cityes;
	}
	
	public Optional<City> getCity(Integer id) {
		return cityRepository.findById(id);
	}
	
	public void addCity(City city) {
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        Date currentdate=new Date();
        
        city.setUuid(randomUUIDString);
        city.setName(city.getName());
        city.setDescription(city.getDescription());
        city.setCreatedBy(city.getCreatedBy());
        city.setCreatedAt(currentdate);
        city.setStateId(city.getStateId());
        city.setIsDeleted(false);
        city.setIsActive(city.getIsActive());
		cityRepository.save(city);
	}
	
	public void updateCity(Integer id,City city) {
		cityRepository.save(city);
	}
	
	public void deleteCity(Integer id,City city) {
		cityRepository.save(city);
	}
}
