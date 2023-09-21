FROM maven:3.8.4-openjdk-17 as buildstage
WORKDIR /workspace/app
COPY . .
RUN mvn clean install

FROM openjdk:17
WORKDIR /app
COPY --from=buildstage /workspace/app/target/contapps-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/contapps-0.0.1-SNAPSHOT.jar"]