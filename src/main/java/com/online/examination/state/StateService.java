package com.online.examination.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	public List<State> getAllState(){
		List<State> states = new ArrayList();
		stateRepository.findAll()
			.forEach(states::add);
		return states;
	}
	
	public Optional<State> getState(Integer id) {
		return stateRepository.findById(id);
	}
	
	public void addState(State state) {
		stateRepository.save(state);
	}
	
	public void updateState(Integer id,State state) {
		stateRepository.save(state);
	}
	
	public void deleteState(Integer id,State state) {
		stateRepository.save(state);
	}

}
