FROM maven:3.6.3-jdk-11 as builder
LABEL maintainer="sola97 <my@sora.vip> "
WORKDIR /
RUN git clone https://github.com/sola97/sesearch.git && \
    cd sesearch && \
    mvn --no-transfer-progress package && \
    mv target/sesearch*.jar /app.jar && \
    chmod +x /app.jar

FROM openjdk:11-jdk-alpine
WORKDIR /
COPY --from=builder /app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","-Xmx128m","-Xms16m","-XX:+UseG1GC"]