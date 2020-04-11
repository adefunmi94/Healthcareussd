CREATE DATABASE IF NOT EXISTS `healthcare_app`;

USE `healthcare_app`;

DROP TABLE IF EXISTS `hospitals`;

CREATE TABLE `hospitals` (
`id` int(11)NOT NUL AUTO_INCREMENT,
`hospital_name`  varchar(45)DEFAULT NULL,
`address`  varchar(45)DEFAULT NULL,
`health_professional varchar(45))DEFAULT NULL,
PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `hospitals` VALUES
(1,'jublac Mothercare','No.213, jones street Lagos','Gynacologist'),
(2,'Budas optical Center','No.13, cladus street yola','Optician'),
(3,'Philion health therapy Center','No.577, Judas street Lagos','General Doctor'),
(4,'Mother & Child Healthcare','No.11,  street Abuja','Pediatrician'),
(5,'Elvon Health Home','No.222, James street Ghana','Dentician');