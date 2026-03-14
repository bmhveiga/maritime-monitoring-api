package com.bruno.maritime.repository;

import com.bruno.maritime.model.MaritimeEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaritimeEventRepository extends JpaRepository<MaritimeEvent, Long> {

}