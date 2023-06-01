package com.adamaroesner.metricscraper.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("security")
public record SecretConfig(String secret) {
}
