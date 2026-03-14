package com.bruno.maritime.service;

import com.bruno.maritime.model.Vessel;
import java.util.List;

public interface VesselService {
    List<Vessel> getAllVessels();
    Vessel getVesselById(Long id);
    Vessel createVessel(Vessel vessel);
    void deleteVessel(Long id);
}