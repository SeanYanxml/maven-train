FROM openjdk:8-jre-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JHIPSTER_SLEEP=0 \
    JAVA_OPTS=""

ENV LANG C.UTF-8
ENV TZ=Asia/Shanghai

# add directly the war
COPY target/maven-train-jenkins-0.0.1-SNAPSHOT.tar /tmp/app.tar
#ADD target/*.tar /tmp/app.tar

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 8060 5701/udp
# ./install the app
RUN cd /tmp \
	&& tar -xvf app.tar \ 
	&& cd maven-train-jenkins-0.0.1-SNAPSHOT/scripts \
# && ./install.sh \ 

RUN cd /tmp \
    && touch docker-entrypoint.sh \
    && chmod +x docker-entrypoint.sh \
    && echo "/opt/apps/jdk/bin/java -jar ${dockerDestFolder}/current/*.war --spring.config.location=${dockerDestFolder}/current/env/application.properties >/dev/null 2>&1" > docker-entrypoint.sh
CMD java -version
# CMD .${dockerDestFolder}/current/docker-entrypoint.sh
