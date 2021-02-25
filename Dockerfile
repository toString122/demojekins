FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/demojekins-0.0.1-SNAPSHOT.jar demojekins.jar
ENTRYPOINT ["java","-jar","demojekins.jar","&"]