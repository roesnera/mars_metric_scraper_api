package com.adamaroesner.metricscraper;

import com.adamaroesner.metricscraper.config.SecretConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecretConfig.class)
public class MetricScraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricScraperApplication.class, args);
	}

}
