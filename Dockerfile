#indicate what java type
FROM openjdk:19
#add the jar target file path and then the name
ADD target/apiFrontBackend-0.0.1-SNAPSHOT.jar apiFrontBackend-0.0.1-SNAPSHOT.jar
#indicate which port to use
EXPOSE 8080
#command in an array of string to run command
ENTRYPOINT ["java","-jar","apiFrontBackend-0.0.1-SNAPSHOT.jar"]