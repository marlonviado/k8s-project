FROM openjdk:17
EXPOSE 8082
ADD target/k8s-project.jar k8s-project.jar
ENTRYPOINT ["java","-jar","/k8s-project.jar"]