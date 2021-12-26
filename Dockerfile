FROM domblack/oracle-jdk8

MAINTAINER gurpreetgandhi3@gmail.com

ADD target/jspdemo-0.0.1.jar jspdemo-0.0.1.jar

ENTRYPOINT ["java", "-jar", "jspdemo-0.0.1.jar"] 
