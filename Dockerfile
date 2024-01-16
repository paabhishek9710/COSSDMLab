FROM openjdk:11
COPY . /myapp
WORKDIR /myapp
RUN javac FindSumOfDigits.java
CMD ["java", "FindSumOfDigits"]