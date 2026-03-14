package com.bruno.maritime.service;

import com.bruno.maritime.exception.ResourceNotFoundException;
import com.bruno.maritime.model.MaritimeEvent;
import com.bruno.maritime.repository.MaritimeEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaritimeEventServiceImpl implements MaritimeEventService{
    private final MaritimeEventRepository maritimeEventRepository;


    public MaritimeEventServiceImpl(MaritimeEventRepository maritimeEventRepository) {
        this.maritimeEventRepository = maritimeEventRepository;
    }

    public List<MaritimeEvent> getAllMaritimeEvent(){
        return maritimeEventRepository.findAll();
    }

    public MaritimeEvent getMaritimeEvent(Long id){
        return maritimeEventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Maritime event not found with id: " + id));
    }

    public MaritimeEvent createMaritimeEvent(MaritimeEvent maritimeEvent){
        return maritimeEventRepository.save(maritimeEvent);
    }

    public void deleteMaritimeEvent(Long id){
        if (!maritimeEventRepository.existsById(id)) {
            throw new ResourceNotFoundException("Maritime Event not found with id: " + id);
        }
        maritimeEventRepository.deleteById(id);
    }
}