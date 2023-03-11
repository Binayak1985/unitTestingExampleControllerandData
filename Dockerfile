FROM openjdk:8
ADD target/unitTestingExampleControllerandData-0.0.1-SNAPSHOT.jar unitTestingExampleControllerandData-0.0.1-SNAPSHOT.jar 
EXPOSE 8088
ENTRYPOINT ["java","-jar","unitTestingExampleControllerandData-0.0.1-SNAPSHOT.jar"]