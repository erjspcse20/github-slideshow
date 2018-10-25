package com.online.examination.state;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
	
	public Optional<State> getState(String id) {
		return stateRepository.findById(id);
	}
	
	public void addState(State state) {
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        Date currentdate=new Date();
        
        state.setUuid(randomUUIDString);
        state.setName(state.getName());
        state.setDescription(state.getDescription());
        state.setCreatedBy(state.getCreatedBy());
        state.setCreatedAt(currentdate);
        state.setCountryId(state.getCountryId());
        state.setIsDeleted(false);
        state.setIsActive(state.getIsActive());
		stateRepository.save(state);
	}
	
	public void updateState(String id,State state) {
		stateRepository.save(state);
	}
	
	public void deleteState(String id,State state) {
		stateRepository.save(state);
	}

}
