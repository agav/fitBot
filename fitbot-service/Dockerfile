FROM openjdk:13

ARG JAR_FILE=target/*.jar

ENV KS_PATH;
ENV KS_PWD;
ENV KS_ALIAS;

ENV TG_API_KEY;

COPY ${JAR_FILE} etc/application.jar




ENTRYPOINT ["java","-jar","etc/application.jar"]