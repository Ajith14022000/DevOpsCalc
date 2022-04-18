FROM openjdk:11

WORKDIR /calculatorapp

COPY ./ ./

CMD ["java", "-jar", "./target/DevOpsCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]


