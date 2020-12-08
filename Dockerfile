FROM maven:3.6.3-jdk-8 as builder
LABEL maintainer="sola97 <my@sora.vip> "
WORKDIR /
RUN git clone https://github.com/sola97/sesearch.git && \
    cd sesearch && \
    mvn --no-transfer-progress package -Dmaven.test.skip=true && \
    mv target/sesearch*.jar /app.jar && \
    chmod +x /app.jar

FROM openjdk:8-jdk-alpine
WORKDIR /
COPY --from=builder /app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","-Xmx128m","-Xms16m","-XX:+UseG1GC"]