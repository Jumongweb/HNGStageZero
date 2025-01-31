FROM maven:3-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM eclipse-temurin:21-alpine
COPY --from=build /target/Quagga-0.0.1-SNAPSHOT.jar hngstagezero.jar
ENTRYPOINT ["java","-Dspring.profiles.active=render","-jar","hngstagezero.jar"]
EXPOSE 2025