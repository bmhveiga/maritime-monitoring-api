package com.bruno.maritime.service;

import com.bruno.maritime.model.Vessel;
import com.bruno.maritime.repository.VesselRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VesselServiceImpl implements VesselService{
    private final VesselRepository vesselRepository;

    public VesselServiceImpl(VesselRepository vesselRepository) {
        this.vesselRepository = vesselRepository;
    }

    public List<Vessel> getAllVessels() {
        return vesselRepository.findAll();
    }

    public Vessel getVesselById(Long id){
        return vesselRepository.findById(id).orElse(null);
    }

    public Vessel createVessel(Vessel vessel) {
        return vesselRepository.save(vessel);
    }

    public void deleteVessel(Long id){
        vesselRepository.deleteById(id);
    }
}
