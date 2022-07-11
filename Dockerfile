FROM openjdk:11-jdk
# docker pull openjdk:11-jdk
# docker image 다운로드
WORKDIR /server

COPY ./build/libs/*-SNAPSHOT.jar server.jar

ENTRYPOINT ["java","-jar","server.jar"]