FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /scraping-service

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim

WORKDIR /scraping-service

COPY --from=build /scraping-service/target/*.jar scraping-service.jar

ENTRYPOINT java -jar scraping-service.jar
