FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8091
ADD target/SpringWebDocker-0.0.1-SNAPSHOT.war SpringWebDocker-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","SpringWebDocker-0.0.1-SNAPSHOT.war" ]
