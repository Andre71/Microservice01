FROM fabric8/s2i-java:latest 
MAINTAINER Andre J. "andre.jankovsky@scotiabank.com" 
EXPOSE 8080 
COPY /target/MicroService-01-v1.jar /app/ws01app.jar 
WORKDIR /app 
ENTRYPOINT ["java", "-jar", "ws01app.jar"] 
CMD ["start"] 
 
