FROM openjdk:8
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN ./mvnw package
EXPOSE 8088
ENTRYPOINT ["java","-jar","target/unitTestingExampleControllerandData-0.0.1-SNAPSHOT.jar"]