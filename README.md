# digital-platoon

EOH Digital Platoon Assignment. A spring boot app exposing a simple REST endpoint storing data in H2 in memory database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You will need:

```
Java JDK 8
maven 3 (mvnw wrapper is also included)
Git
```

### Installing

To get this project up and running you will need to have the Git, Java JDK 8 installed as well as maven 3. The related MAVEN_HOME and JAVA_HOME paths need to be set and the related git, java, javac and mvn binary files need to be set in your systems PATH. Access to the internet is required to download the related system dependencies.

Create an initial clone of this project by doing a git clone, these steps are performed via the terminal.
```
git clone git@github.com:somejavadev/digital-platoon.git
```

Change into this directory:

```
cd digital-platoon
```

Do an initial build (this may take a while depending on your internet connection as required dependencies are downloaded at this stage):

```
mvn clean install
```

After the build is completed you should see the following:

```
[INFO] --------------------------------------------
[INFO] BUILD SUCCESS
[INFO] --------------------------------------------

```
If at this point you see any failures these need to be corrected before continuing.

To run the app, run the following command:

```$xslt
mvn spring-boot:run
```
After running this command you should see output similar to the following:
```$xslt
main] c.h.d.DigitalplatoonApplication          : Started DigitalplatoonApplication in 2.598 ..
```
Please do not close the terminal or CTRL-C as this will kill the application.

Once the command above has completed the application exposes the following REST endpoints on port 8080

- POST http://localhost:8080/cic/
- GET  http://localhost:8080/cic/{cicID}

The project contains a [postman](https://www.getpostman.com/) collections json [file](postman/digital-platoon.postman_collection.json) which assists with testing the REST API. This is a GUI friendly way as apposed to using CURL.

## Notes
Authentication was seen as out of scope for this assignment but adding token based authentication such as JWT would be used should it have been required.

The in memory database H2 creates a digital-platoon-db.mv.db and digital-platoon-db.trace.db file under the Users home directory. They can simply be deleted to create a fresh start.

Should you wish to inspect the in memory database you may access http://localhost:8080/h2/ when the application is running. Login details are stored the spring config file.
## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/) 
* [Spring Boot](https://projects.spring.io/spring-boot/)
* [H2](http://www.h2database.com/html/main.html) 


## Authors

* **Hein Smith** - *Initial work* - [digital-platoon](https://github.com/somejavadev/digital-platoon)

See also the list of [contributors](https://github.com/somejavadev/digital-platoon/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details