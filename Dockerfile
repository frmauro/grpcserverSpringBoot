
FROM adoptopenjdk/openjdk11:alpine
ADD target/grpcserver-0.0.1-SNAPSHOT.jar grpcserver-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENV ACTIVE_PROFILE=dev
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","grpcserver-0.0.1-SNAPSHOT.jar"]