FROM openjdk:21-jdk-slim
RUN mkdir /app
WORKDIR /app
COPY --from=build /target/testeapi-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar", "/app/app.jar"]