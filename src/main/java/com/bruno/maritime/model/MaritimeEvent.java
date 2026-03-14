package com.bruno.maritime.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "maritime_events")
public class MaritimeEvent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //— auto generated primary key (Long)
    private String eventType;
    //— what kind of event: "Distress Signal", "Oil Spill", "Piracy Alert", "Weather Warning"
    private String description;
    //— details about what happened
    private Double latitude;
    //— where it happened
    private Double longitude;
    //— where it happened
    private LocalDateTime eventDate;
    //— when it happened

    @ManyToOne
    @JoinColumn(name = "vessel_id")
    private Vessel vessel;
    //— which vessel is involved (this links to your Vessel entity


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public Vessel getVessel() {
        return vessel;
    }

    public void setVessel(Vessel vessel) {
        this.vessel = vessel;
    }
}