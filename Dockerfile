FROM openjdk:11

EXPOSE 8080

ADD /target/poc-project-docker.jar poc-project-docker.jar

ENTRYPOINT [ "java", "-jar", "poc-project-docker.jar" ]