FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
MAINTAINER Dimas Maryanto <software.dimas_m@icloud.com>

COPY target/${JAR_FILE} app.jar
