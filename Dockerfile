# Use Maven to build the application
FROM maven:3.8.5-openjdk-17 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Run Maven build to create the JAR file
RUN mvn clean package -DskipTests

# Use OpenJDK runtime for the final image
FROM openjdk:17-jdk-slim

# Set the working directory for the runtime
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /app/target/usermanagement-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the application runs
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
