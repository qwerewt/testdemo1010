FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/demo12.jar demo12.jar
ENTRYPOINT ["java","-jar","/demo12.jar", "&"]