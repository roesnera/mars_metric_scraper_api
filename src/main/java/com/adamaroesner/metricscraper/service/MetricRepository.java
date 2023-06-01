package com.adamaroesner.metricscraper.service;

import com.adamaroesner.metricscraper.model.Metric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricRepository extends JpaRepository<Metric, Integer> {
}
