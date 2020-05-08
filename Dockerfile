FROM openjdk:8
EXPOSE 8081
# Add the application's jar to the container
ADD target/spe_calculator-1.0-SNAPSHOT.jar spe_calculator-1.0-SNAPSHOT.jar
# Run the jar file
ENTRYPOINT ["java","-cp","spe_calculator-1.0-SNAPSHOT.jar","calculator.Calculator"]
