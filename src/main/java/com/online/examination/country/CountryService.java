package com.online.examination.country;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getAllCountry() {
		List<Country> Countrys = new ArrayList();
		countryRepository.findAll()
			.forEach(Countrys::add);
		return Countrys;
		
	}
	
	public Optional<Country> getCountry(String uuid) {
		//return countryRepository.findById(id);
		//return null;
		//String qry = "select uuid,name,description,is_active from country where uuid='"+uuid+"' and ";
		return countryRepository.findById(uuid);
	}

	public void addCountry(Country country) {
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        Date currentdate=new Date();

        country.setUuid(randomUUIDString);
        country.setName(country.getName());
        country.setDescription(country.getDescription());
        country.setCreatedAt(currentdate);
        country.setIsDeleted(false);
        country.setIsActive(country.getIsActive());
        country.setCreatedBy(country.getCreatedBy());
		countryRepository.save(country);
		
	}

	public void updateCountry(String id, Country country) {
		countryRepository.save(country);
		
	}

	public void deleteCountry(String id, Country country) {
		countryRepository.save(country);
	}

}
