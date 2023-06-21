CREATE DATABASE  IF NOT EXISTS `examen_practic` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `examen_practic`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: examen_practic
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `agent_table`
--

DROP TABLE IF EXISTS `agent_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agent_table` (
  `codAgent` int NOT NULL AUTO_INCREMENT,
  `nume` text,
  `prenume` text,
  `varsta` int DEFAULT NULL,
  `telefon` text,
  PRIMARY KEY (`codAgent`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent_table`
--

LOCK TABLES `agent_table` WRITE;
/*!40000 ALTER TABLE `agent_table` DISABLE KEYS */;
INSERT INTO `agent_table` VALUES (1,'Ion','Antonel',26,'060789456'),(2,'Vasile','Moraru',35,'060456789');
/*!40000 ALTER TABLE `agent_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apartamente_table`
--

DROP TABLE IF EXISTS `apartamente_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apartamente_table` (
  `codApartament` int NOT NULL AUTO_INCREMENT,
  `etaj` int DEFAULT NULL,
  `nrCamere` int DEFAULT NULL,
  `pret` int DEFAULT NULL,
  `metriPatrati` int DEFAULT NULL,
  `codAgent` int DEFAULT NULL,
  PRIMARY KEY (`codApartament`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apartamente_table`
--

LOCK TABLES `apartamente_table` WRITE;
/*!40000 ALTER TABLE `apartamente_table` DISABLE KEYS */;
INSERT INTO `apartamente_table` VALUES (1,1,2,50000,80,1),(2,1,3,65000,90,2);
/*!40000 ALTER TABLE `apartamente_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-21 17:36:28
