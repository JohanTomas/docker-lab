FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY src/main/resources .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=builder /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
