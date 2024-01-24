FROM amazoncorretto:17
ADD target/gcp-0.0.1-SNAPSHOT.jar gcp-test.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "gcp-test.jar"]