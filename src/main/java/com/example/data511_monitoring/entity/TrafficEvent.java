package com.example.data511_monitoring.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.locationtech.jts.geom.Point;

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
@Table(name = "traffic_event")
public class TrafficEvent {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String type;

    private String description;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point location;

    private OffsetDateTime sourceUpdatedAt;

    private OffsetDateTime ingestedAt;
}
