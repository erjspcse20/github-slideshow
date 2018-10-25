package com.online.examination.unit;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="unit/api")
public class UnitController {
	
	@Autowired
	private UnitServices unitServices;
	
	@RequestMapping(value="/allUnit")
	public List<Unit> getAllUnit(){
		return unitServices.getAllUnit();
	}
	
	@RequestMapping(value="/unit/{id}")
	public Optional<Unit> getUnit(@PathVariable Integer id) {
		return unitServices.getUnit(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addUnit")
	public void addUnit(@RequestBody Unit unit) {
		unitServices.addUnit(unit);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateUnit/{id}")
	public void updateUnit(@RequestBody Unit unit, @PathVariable Integer id) {
		unitServices.updateUnit(unit, id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteUnit/{id}")
	public void deleteUnit(@RequestBody Unit unit, @PathVariable Integer id) {
		unitServices.deleteUnit(unit, id);
	}

}
