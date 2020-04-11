CREATE DATABASE IF NOT EXISTS `healthcare_app`;
USE `healthcare_app`;

DROP TABLE IF EXISTS`healthuser`

CREATE TABLE `healthuser`(
`id` int(11)NOT NUL AUTO_INCREMENT,
`first_name`  varchar(45)DEFAULT NULL,
`last_name`  varchar(45)DEFAULT NULL,
`pin`  int(11)DEFAULT NULL,
PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `healthuser` VALUES
(1,'Funmilayo','Oyeyipo',2020),
(2,'Matthew','Balogun',4050),
(4,'Ifeoluwa','Adeola',4040),
(5,'Festus','john',4060),
(2,'Nickolas','James',1050);