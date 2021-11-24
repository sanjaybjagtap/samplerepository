FROM openjdk:11
ARG JAR_FILE=./target/*.jar
ADD ${JAR_FILE} BookApp.jar
ENTRYPOINT ["java","-jar","BookApp.jar"]