package com.example.data511_monitoring.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.locationtech.jts.geom.Point;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor 
@Table(name = "traffic_event")
public class TrafficEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String type;

     @Column(nullable = false)
    private String description;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point location;

    @Column(nullable = false)
    private OffsetDateTime sourceUpdatedAt;

    @Column(nullable = false)
    private OffsetDateTime ingestedAt;
}
