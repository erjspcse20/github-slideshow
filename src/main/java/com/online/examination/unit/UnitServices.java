package com.online.examination.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitServices {
	
	@Autowired
	private UnitRepository unitRepository;
	
	public List<Unit> getAllUnit(){
		List<Unit> units = new ArrayList();
		unitRepository.findAll()
			.forEach(units::add);
		return units;
	}
	
	public Optional<Unit> getUnit(Integer id) {
		return unitRepository.findById(id);
	}
	
	public void addUnit(Unit unit) {
		unitRepository.save(unit);
	}
	
	public void updateUnit(Unit unit, Integer id) {
		unitRepository.save(unit);
	}
	
	public void deleteUnit(Unit unit, Integer id) {
		unitRepository.save(unit);
	}
}
