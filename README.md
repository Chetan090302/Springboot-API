Project Title:
TASK Management (CRUD) System

1. Project Description:
A Spring MVC web application for TASK Management with the following CRUD operations:

Get all the Tasks
Add a new Task
Update an Task
Delete an Task


2. Tech Stack:
Java 17
Spring Boot
HTML
Bootstrap
Thymeleaf
Spring MVC
Spring Data JPA
Hibernate
Maven

MySql database
4. Installing:
i. Clone the git repo

https://github.com/AAdewunmi/SpringBoot-Employee-Management-System.git
ii. Open project folder

iii. Explore

4. How To Use:
i. Create Database -> tast_db

ii. And create a table with the following command :-

CREATE TABLE `Task1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `taskname` varchar(45) DEFAULT NULL,
  `taskdetails` varchar(45) DEFAULT NULL,
  `taskstatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


iii. Open project in preferred IDE (I used SpringToolsSuite4)

iv.  Run project as Spring Boot App

v. Add sample data to table using MySQL Workbench Client

vi. Open web app at localhost: 8080/

vii. Add, Update and Delete records from web app

5. Demo:
- All Task UI
images/Screenshot 2024-01-08 153505.png
-Add Task UI
images/Screenshot 2024-01-08 153413.png
-Update Task UI
images/Screenshot 2024-01-08 153413.png
-deleted Task UI
![Screenshot 2024-01-08 153413](https://github.com/Chetan090302/Springboot-API/assets/134623805/9a04a6cd-f5ca-47db-8d36-433cc6ac2068)



6. Original Creator:
Author: Ramesh Fadatare

Github Project Name: springboot-thymeleaf-crud-pagination-sorting-webapp

Github URL: 
