FROM maven:3.8.6-jdk-11
COPY ./api-example /publish
WORKDIR /publish
