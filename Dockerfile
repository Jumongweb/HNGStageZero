FROM openjdk:17-jdk-slim
WORKDIR /app

COPY . .
RUN ./mvnw clean install
EXPOSE 2025

ENTRYPOINT ["java","-jar","target/HNGStageZero-0.0.1-SNAPSHOT.jar"]
