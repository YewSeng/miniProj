FROM openjdk:11
EXPOSE 8084
ADD target/DockerWithDB-0.0.1-SNAPSHOT.war DockerWithDB-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java" , "-jar", "DockerWithDB-0.0.1-SNAPSHOT.war"]