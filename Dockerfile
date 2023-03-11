FROM openjdk:18
WORKDIR /app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN mvnw package
EXPOSE 8099
ENTRYPOINT ["java","-jar","target/unitTestingExampleControllerandData-0.0.1-SNAPSHOT.jar"]