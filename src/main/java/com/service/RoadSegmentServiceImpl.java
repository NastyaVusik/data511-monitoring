package com.service;

import org.springframework.stereotype.Service;

import com.example.data511_monitoring.repository.RoadSegmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoadSegmentServiceImpl implements RoadSegmentService {

    private final RoadSegmentRepository roadSegmentRepository;

}
