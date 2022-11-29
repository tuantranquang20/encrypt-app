FROM maven:3.8.6-amazoncorretto-11 AS BUILD_IMAGE

WORKDIR /ecrypt

COPY . .
RUN mvn clean install

FROM maven:3.8.6-amazoncorretto-11
COPY --from=BUILD_IMAGE /ecrypt/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
