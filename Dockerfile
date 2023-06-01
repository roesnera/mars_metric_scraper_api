FROM openjdk:17-alpine

WORKDIR /app

COPY target/* .

EXPOSE 80

ENTRYPOINT ["java", "-jar", "metricScraper-0.0.1-SNAPSHOT.jar"]