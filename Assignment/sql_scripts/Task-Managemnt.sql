CREATE DATABASE  IF NOT EXISTS `tast_db`;
USE `employee_directory`;

--
-- Table structure for table `Task1`
--

DROP TABLE IF EXISTS 'Task1';

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `taskname` varchar(45) DEFAULT NULL,
  `taskdetails` varchar(45) DEFAULT NULL,
  `taskstatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `Task1` VALUES
	(1,'React','Task Repository Interface','Incomplete'),
	(2,'Java','Palindrome problem ','Completed'),
	(3,'python','substring problem','Incomplete'),