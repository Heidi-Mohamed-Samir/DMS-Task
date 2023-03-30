-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: dmstask
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `birth_city` varchar(45) DEFAULT NULL,
  `code` int DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  `direct_manager` varchar(45) DEFAULT NULL,
  `contract_type` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Heidi','2000-09-11','cairo',11,'back-end','developer','ahmed','full time',' available'),(2,'ALY','1995-01-22','Cairo',12,'back-end','manager','ahmed','full time',' available'),(3,'SARA','1994-02-22','CAIRO',23,'front-end','developer','ALY','full time',' available'),(4,'Rana','1999-03-27','alex',13,'back-end','devleoper','Heidi','part time','off'),(5,'mohamed','1989-11-14','cairo',78,'full stack','developer','aly','full time','available'),(6,'mohen','1977-02-19','cairo',3,'full stack','developer','ahmed','part time','available'),(7,'ahmed','1990-06-20','giza',10,'front-end','programmer','sara','full time','available'),(8,'amira','1999-10-13','cairo',2,'front-end','programmer','aly','part time','off'),(9,'nada','2001-08-01','alex',4,'back-end','developer','heidi','full time','off'),(10,'marwa','1998-01-22','giza',5,'back-end','programmer','heidi','part time','off'),(11,'omer','2023-03-30','cairo',6,'full stack','programmer','ahmed','full time','available');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-30 15:58:17
