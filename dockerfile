FROM maven:3.8.6-jdk-11
WORKDIR /publish
COPY ./api-example /publish
RUN mvn clean install
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]
