From openjdk:11
ADD target/dockerassignment-0.0.1-SNAPSHOT.jar dockerassignment-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","dockerassignment-0.0.1-SNAPSHOT.jar"]

