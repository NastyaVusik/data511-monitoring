package com.example.data511_monitoring.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.locationtech.jts.geom.LineString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@ToString
@Table(name = "road_segment")
public class RoadSegment {

    @Id
    private UUID id;

    @Column(name = "external_id", nullable = false)
    private String externalId;

    private String name;

    @Column(columnDefinition = "geometry(LineString,4326)")
    private LineString geometry;

    @Column(name = "created_at", updatable = false)
    private OffsetDateTime createdAt;
}
