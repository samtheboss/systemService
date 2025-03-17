FROM maven:3.9.6-eclipse-temurin-22-jammy AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:22-jdk
COPY --from=build /target/systemServices-0.0.1-SNAPSHOT.jar systemServices.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","systemServices.jar"]
