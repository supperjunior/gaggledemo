## System Requirement

1. Java 1.8
2. Maven 3+
3. Docker

## Steps to run the project

1. Build the project using following command

   `mvn clean install`

   This will test the API and create a jar of your project
2. Build the Docker image

   `docker build -t <image-name> .`

   Run this command from the directory where project is copied, dont't forgot (
   PERIOD) symbol in the end

3. Run the App Automatically via Docker Image

   `docker run -p 8080:8080 <image-name>`

4. Test the API go to the browser and paste this

   `localhost:8080`

   Result should look like this JSON payload
   
   `{"msg":"Welcome to the machine","localDateTime":"2021-03-31T14:55:45.89"}`