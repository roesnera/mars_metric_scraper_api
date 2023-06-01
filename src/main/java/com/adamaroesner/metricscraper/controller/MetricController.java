package com.adamaroesner.metricscraper.controller;

import com.adamaroesner.metricscraper.model.Metric;
import com.adamaroesner.metricscraper.model.MetricDTO;
import com.adamaroesner.metricscraper.service.MetricService;
import jakarta.persistence.GeneratedValue;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/metrics")
@RequiredArgsConstructor
public class MetricController {

    private final MetricService service;

    @GetMapping("/peek")
    public List<Metric> getMetrics(){
        return service.getMetrics();
    }

    @PostMapping("/new")
    public void postMetric(@RequestBody MetricDTO metricDTO){
        service.postMetric(metricDTO);
    }

}
