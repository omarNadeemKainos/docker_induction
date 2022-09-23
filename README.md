# docker_induction
This example demonstrates using docker to setup and run the Java API used with Jmeter (using spring-boot).

Steps:

1. Clone this repo

2. Execute the following in a terminal: 'docker build -t [name of your choice] [directory to your clone]/docker_induction'\
Note: This uses the dockerfile specified in the repo to setup the maven environment and run mvn clean install

3. Execute the following: 'docker run -p 8080:8080' [name you chose above]'
Note: This runs mvn spring-boot to run the api project

4. After the container is running, head to http://localhost:8080/swagger-ui.html 
You should see the api running as usual, this time from a self-contained docker container!
