# Amigoscode Spring-Boot Tutorial
---

## Intro
- Spring Boot is a framework
- we use the [Spring starter template website](start.spring.io) to start our project.
- added dependencies include 
	- web kit
	- Spring data JPA
	- postgresSQL driver

- We're using Intellij IDE
- We configure our applications properties and environment specific info inside of the application.properties file
- the static folder is used when working with web files css, javascript HTML etc..

## Running the project
- simply go to the main file i.e. DemoApplication.java in src/main/java/com.example.demo
- it failed to run the first time 
- so we go to the pom.xml file and comment out  a couple of dependencies 
- which ones specifically?
``` <dependency>  
 <groupId>org.springframework.boot</groupId>  
 <artifactId>spring-boot-starter-data-jpa</artifactId>  
</dependency>
```
- now we right click on pom.xml file and go to maven->reload project 
- then run the project again and this time it'll work
- we will un-comment the dependency code when we're ready to connect to the database

## A simple API 
- in DemoApplication class we write an annotation  `@RestController`
- then we'll set up a function `hello()` to return a string to the main web-page at localhost:8080 
- for the `hello()` function to work as a restful endpoint we'll need to annotate it 
- in this case we'll use `@GetMapping`
- Now when we restart the server and refresh localhost:8080 our message will show up
- we can also show/display other things like `List<String>`




























## Questions
---
1. What is the difference between List and Array in java?
