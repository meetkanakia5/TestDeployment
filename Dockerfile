FROM openjdk:17

WORKDIR /app

COPY target/Dockertest-0.0.1-SNAPSHOT.jar Dockertest-0.0.1-SNAPSHOT.jar

EXPOSE 8000

ENTRYPOINT ["java", "-jar", "Dockertest-0.0.1-SNAPSHOT.jar"]
