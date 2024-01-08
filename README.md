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
![Screenshot 2024-01-08 153505](https://github.com/Chetan090302/Springboot-API/assets/134623805/8e99966f-93b8-4da6-b17d-979e76920420)

-Add Task UI
![Screenshot 2024-01-08 153413](https://github.com/Chetan090302/Springboot-API/assets/134623805/9b6236ec-ceaf-4d48-8056-1e4b9b2a2398)

-Update Task UI
![Screenshot 2024-01-08 153505](https://github.com/Chetan090302/Springboot-API/assets/134623805/8e99966f-93b8-4da6-b17d-979e76920420)


-deleted Task UI
![Screenshot 2024-01-08 155403](https://github.com/Chetan090302/Springboot-API/assets/134623805/c753c503-3e74-4fa8-b228-ce53a67f7cdf)



6. Original Creator:
Author: JETTY CHETAN

Github Project Name:Springboot API

Github URL: https://github.com/Chetan090302/Springboot-API
