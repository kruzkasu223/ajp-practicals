SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";    
    /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;    
    /*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;    
    /*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;    
    /*!40101 SET NAMES utf8 */;    
      CREATE TABLE IF NOT EXISTS `cus` (    
      `cno` int(11) NOT NULL,    
      `cname` varchar(255) NOT NULL,    
      `add` int(11) NOT NULL,    
      PRIMARY KEY (`cno`)    
    ) 