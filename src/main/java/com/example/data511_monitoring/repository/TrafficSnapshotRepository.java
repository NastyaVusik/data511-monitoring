package com.example.data511_monitoring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data511_monitoring.entity.TrafficSnapshot;

@Repository
public interface TrafficSnapshotRepository extends JpaRepository<TrafficSnapshot, UUID>     {

}
