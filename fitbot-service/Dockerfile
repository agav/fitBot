FROM openjdk:13

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} etc/application.jar

ENTRYPOINT ["java","-jar","etc/application.jar"]