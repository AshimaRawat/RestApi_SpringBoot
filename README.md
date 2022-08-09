# RestApi_SpringBoot
This repository contains a RestApi created in Spring Boot Java that can return product information and the insurance necessary to cover the risks of delivering them. The product details are in  separate file(.json files).

Get the product information via:
http://localhost:3306/Products

Software Programs used:
1. JDK(1.8+)
2. IDE(Visual studio/ Eclipse)
3. MySql Server 8.0.24
4. curl

Steps to setup:
1.Clone the application
git clone https://github.com/Ashimarawat/RestApi_SpringBoot.git

2.Create mysql database

3.Change mysql username and password as per your installation
  open src/main/resources/application.yml
  change spring.datasource.username and spring.datasource.password as per your mysql installation
  
4.Build and run the app using maven .

Alternatively, you can run the app without packaging it using -

mvn spring-boot:run
The app will start running at http://localhost:3306.

Explore Rest APIs
The app defines following CRUD APIs.
You can test them using postman or any other rest client.

Methodology:
1. Create Mysql database
2. Create Maven Project
3. Configure Datasource Properties
4. Code Domain model Class
5. Code repository interface
6. Code service class
7. Code Spring Boot Application class
8. Code rest controller class
9. Code Restful CRUD API

