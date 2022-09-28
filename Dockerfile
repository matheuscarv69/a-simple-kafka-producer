## Builder image
FROM maven:3.8.5-jdk-11 AS builder
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip

## Runner image
FROM openjdk:11-slim
MAINTAINER matheuscarv69
COPY --from=builder /usr/src/app/target/a-simple-kafka-producer-0.0.1-SNAPSHOT.jar /usr/app/app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/usr/app/app.jar"]
