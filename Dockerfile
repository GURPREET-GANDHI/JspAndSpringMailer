#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/jspdemo-0.0.2.jar /usr/local/lib/jspdemo-0.0.2.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/jspdemo-0.0.2.jar"]
