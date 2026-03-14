package com.bruno.maritime.service;

import com.bruno.maritime.model.MaritimeEvent;

import java.util.List;

public interface MaritimeEventService {
    List<MaritimeEvent> getAllMaritimeEvent();
    MaritimeEvent getMaritimeEvent(Long id);
    MaritimeEvent createMaritimeEvent(MaritimeEvent maritimeEvent);
    void deleteMaritimeEvent(Long id);
}
