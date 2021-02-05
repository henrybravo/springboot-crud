FROM java:8

ENV PACKAGE_NAME inmemcrud-0.0.1-SNAPSHOT.jar

ENV PACKAGE_HOME /tmp

COPY target/$PACKAGE_NAME $PACKAGE_HOME/

EXPOSE 8080

WORKDIR $PACKAGE_HOME

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","inmemcrud-0.0.1-SNAPSHOT.jar"]
