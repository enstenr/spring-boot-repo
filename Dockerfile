FROM  openjdk:17-jdk-slim
MAINTAINER srajesh.in
COPY target/rajesh-0.0.1-SNAPSHOT.war rajesh-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/rajesh-0.0.1-SNAPSHOT.war"]
