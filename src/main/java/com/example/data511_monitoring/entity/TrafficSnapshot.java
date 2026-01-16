package com.example.data511_monitoring.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "traffic_snapshot")
public class TrafficSnapshot {


    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "road_segment_id", nullable = false)
    private RoadSegment roadSegment;

    private BigDecimal speedKmh;

    private Integer congestionLevel;

    @Column(nullable = false)
    private OffsetDateTime measuredAt;
}
