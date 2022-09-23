# api-perf-test
Simple API to use for performance testing

This API has 4 endpoints:  

**GET /all-students** - returns all student records

**POST /new-student** - this allows you to create a new student record

Sample payload:
```
{
"name": "John Bowie",
"description": "Class of 16"
}
```
**POST /students** - this adds 3 new student records

**GET /students/{studentId}** - this retrieves a student record by their Student ID


## To Build the project and run:
```mvn clean install```

## To start the application:
```java -jar target/api-perf-test-0.0.1-SNAPSHOT.jar```

## To build and start the application without running the tests:
```mvn spring-boot:run```

## Swagger UI
```http://localhost:8080/swagger-ui.html```
