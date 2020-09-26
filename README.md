
##How to run the app
Checkout the project from github
Open command prompt and go to project directory
Do maven build - mvn clean install
Go to target folder and run "java -jar babysitter-0.0.1-SNAPSHOT.jar"
Access service endpoint with number of night as input - http://localhost:8080/v1/babysitter/charge?numberOfNight=1
Swagger endpoint to call the service from UI - http://localhost:8080/swagger-ui.html#/baby-sitter-controller
App health endpoint - http://localhost:8080/actuator/health
