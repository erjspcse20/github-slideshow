package com.online.examination.state;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.examination.country.Country;

@RestController
@RequestMapping(value = "state/api")
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@RequestMapping("/allState")
	public List<State> getAllState(){
		return stateService.getAllState();
	}
	
	@RequestMapping("/state/{id}")
	public Optional<State> getState(@PathVariable Integer id) {
		return stateService.getState(id);
	}

	@RequestMapping(method=RequestMethod.POST, value = "/addState")
	public void addState(@RequestBody State state) {
		stateService.addState(state);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateState/{id}")
	public void updateState(@RequestBody State state,@PathVariable Integer id) {
		stateService.updateState(id, state);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteState/{id}")
	public void deleteState(@RequestBody State state,@PathVariable Integer id) {
		stateService.deleteState(id, state);
	}
}
