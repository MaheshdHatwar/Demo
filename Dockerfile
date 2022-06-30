FROM openjdk:11
EXPOSE 7070
ADD target/docker-demo-spring-boot-0.0.1-SNAPSHOT.jar docker-demo-spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker-demo-spring-boot-0.0.1-SNAPSHOT.jar"]