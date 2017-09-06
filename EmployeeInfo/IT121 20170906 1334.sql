-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.36-community-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema it121db
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ it121db;
USE it121db;

--
-- Table structure for table `it121db`.`employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EmpID` varchar(15) NOT NULL DEFAULT '',
  `Lastname` varchar(45) NOT NULL DEFAULT '',
  `Firstname` varchar(45) NOT NULL DEFAULT '',
  `Middlename` varchar(45) NOT NULL DEFAULT '',
  `Position` varchar(45) NOT NULL DEFAULT '',
  `Department` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`EmpID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `it121db`.`employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`EmpID`,`Lastname`,`Firstname`,`Middlename`,`Position`,`Department`) VALUES 
 ('101','larrobis','archie joy','bustillo','test','IT'),
 ('102','mmm','mmm','mmm','manager','microsoft'),
 ('103','Pit','Brad','Cruz','Artist','Hollywood'),
 ('104','Penduco','Pedro','Dela Cruz','Instructor','ICE'),
 ('105','ooo','ooo','ooo','o','o'),
 ('121','BBB','BBB','BBB','B','B');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Table structure for table `it121db`.`person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `idnum` int(11) NOT NULL,
  `lname` varchar(25) DEFAULT NULL,
  `fname` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idnum`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `it121db`.`person`
--

/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`idnum`,`lname`,`fname`) VALUES 
 (1,'Larrobis','Archie Joy');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
