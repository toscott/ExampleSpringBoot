# ExampleSpringBoot
An Example Spring Boot Application using:
* Gradle 
* Java
* OpenId Connect Using Google

### Prereqs:
Java 8+
Google APIs ClientId & Secret: See https://developers.google.com/identity/protocols/OAuth2WebServer

### To Build:
{project-home}/gradlew

### To Run Application in Local Mode:
java -DGOOGLE_CLIENT_ID=[YOUR_CLIENT_ID] -DGOOGLE_CLIENT_SECRET=[YOUR_CLIENT_SECRET] -jar {project-home}/example/build/libs/example.jar --spring.profiles.active=local

### To Access Application:
localhost:8080

### Secure Hello World:
localhost:8080/api/hello

### Public Hello World:
localhost:8080/public/api/hello/MyName

### To Run Application in Production Mode:
java -DGOOGLE_CLIENT_ID=[YOUR_CLIENT_ID] -DGOOGLE_CLIENT_SECRET=[YOUR_CLIENT_SECRET] -jar {project-home}/example/build/libs/example.jar --spring.profiles.active=production
