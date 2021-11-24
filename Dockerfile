FROM openjdk:11
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} BookApp.jar
ENTRYPOINT ["java","-jar","/BookApp.jar"]