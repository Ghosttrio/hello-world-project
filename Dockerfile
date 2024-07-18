FROM openjdk:17-alpine
ARG JAR_FILE=/build/libs/helloworld.jar
COPY ${JAR_FILE} helloworld.jar
ENTRYPOINT ["java","-jar","/helloworld.jar"]
