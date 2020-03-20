FROM openjdk:8-jdk-alpine
ARG JAR_FILE=eatgo-api/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080
