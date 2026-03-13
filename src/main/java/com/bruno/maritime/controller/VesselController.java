package com.bruno.maritime.controller;
import com.bruno.maritime.model.Vessel;
import com.bruno.maritime.service.VesselService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VesselController {
    private final VesselService vesselService;

    public VesselController(VesselService vesselService) {
        this.vesselService = vesselService;
        System.out.println("GreetingService object: " + vesselService);
    }

    @GetMapping("/vessels")
    public List<Vessel> getVessels() {
        return vesselService.getAllVessels();
    }
    @GetMapping("/vessels/{id}")
    public Vessel getVesselById(@PathVariable Long id){
        return vesselService.getVesselById(id);
    }
    @PostMapping("/vessels")
    public Vessel createVessel(@RequestBody Vessel vessel){
        return vesselService.createVessel(vessel);
    }
    @DeleteMapping("/vessels/{id}")
    public void deleteVessel(@PathVariable Long id) {
        vesselService.deleteVessel(id);
    }


}