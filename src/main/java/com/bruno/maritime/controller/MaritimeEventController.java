package com.bruno.maritime.controller;
import com.bruno.maritime.model.MaritimeEvent;
import com.bruno.maritime.service.MaritimeEventServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaritimeEventController {

    private final MaritimeEventServiceImpl maritimeEventService;

    public MaritimeEventController(MaritimeEventServiceImpl maritimeEventService) {
        this.maritimeEventService = maritimeEventService;
    }

    @GetMapping("/maritimeEvents")
    public List <MaritimeEvent> getAllMaritimeEvents(){
        return maritimeEventService.getAllMaritimeEvent();
    }

    @GetMapping("/maritimeEvents/{id}")
    public MaritimeEvent getMaritimeEventlById(@PathVariable Long id) {
        return maritimeEventService.getMaritimeEvent(id);
    }

    @PostMapping("/maritimeEvents")
    public MaritimeEvent createMaritimeEvent(@RequestBody MaritimeEvent maritimeEvent){
        return maritimeEventService.createMaritimeEvent(maritimeEvent);
    }

    @DeleteMapping("/maritimeEvents/{id}")
    public void deleteMaritimeEvent(@PathVariable Long id) {
        maritimeEventService.deleteMaritimeEvent(id);
    }
}