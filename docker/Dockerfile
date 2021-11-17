FROM openjdk:8-jdk-alpine
LABEL Aleksey Knyazhev <aleksey.knyazhev@gmail.com>
EXPOSE 8080
WORKDIR /
ADD /target/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "docker-0.0.1-SNAPSHOT.jar"]
#CMD ["--spring.profiles.acrive=qa"] - оказалось неприменимо