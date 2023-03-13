FROM openjdk:11-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/ServiceOne-0.0.1-SNAPSHOT.jar /app

# Make the port available to the world outside this container
EXPOSE 8080

ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE http://epic_dijkstra:8761/eureka/

# Run the application when the container starts
CMD ["java", "-jar", "ServiceOne-0.0.1-SNAPSHOT.jar"]