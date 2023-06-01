package com.adamaroesner.metricscraper.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="metrics")
@Builder
public class Metric {
    @Id
    @GeneratedValue
    private Integer id;
    private String tikTokFollowers;
    private String tikTokLikes;
    private String instagramFollowers;
}
