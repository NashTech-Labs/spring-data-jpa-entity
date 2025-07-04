FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# built JAR file into the container
COPY target/entity-lifecycle-0.0.1-SNAPSHOT.jar app.jar

# Exposed the port your Spring Boot app runs on
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
