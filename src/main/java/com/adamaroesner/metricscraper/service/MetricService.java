package com.adamaroesner.metricscraper.service;

import com.adamaroesner.metricscraper.model.Metric;
import com.adamaroesner.metricscraper.model.MetricDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricService {

    private final MetricRepository repo;

    public List<Metric> getMetrics(){
        return repo.findAll();
    }

    public void postMetric(MetricDTO metricDTO){
        if(metricDTO.tikTokLikes()!=null
                && metricDTO.tikTokLikes().length()>0
                && metricDTO.instagramFollowers()!=null
                && metricDTO.instagramFollowers().length()>0
                && metricDTO.tikTokFollowers()!=null
                && metricDTO.tikTokFollowers().length()>0){
            Metric metricToSave = Metric.builder()
                    .instagramFollowers(metricDTO.instagramFollowers())
                    .tikTokFollowers(metricDTO.tikTokFollowers())
                    .tikTokLikes(metricDTO.tikTokLikes())
                    .build();
            repo.save(metricToSave);
        }
    }

}
