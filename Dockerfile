FROM openjdk:17
COPY ./out/artifacts/hw1_jar/hw1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]