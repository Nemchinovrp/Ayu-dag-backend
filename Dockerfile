FROM openjdk:8-jdk-alpine

LABEL maintainer="nemchinovrp@yandex.ru"

EXPOSE 8080

ARG JAR_FILE=build/libs/ayu-dag-backend-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} ayu-dag.jar

ENTRYPOINT ["java","-jar","/ayu-dag.jar"]