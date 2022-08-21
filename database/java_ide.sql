DROP SCHEMA IF EXISTS `java_ide`;
CREATE SCHEMA `java_ide`;
USE `java_ide`;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET TIME_ZONE = "+05:30";
SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE `user_table` (
    `userid` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(40) NOT NULL,
    `email` VARCHAR(255) NOT NULL UNIQUE KEY,
    `password` TEXT NOT NULL,
    `verified` TINYINT UNSIGNED DEFAULT 0
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO `user_table` (`name`, `email`, `password`) VALUES('user', 'user@javaide.com', '1234');

CREATE TABLE `snippet_table`(
	`userid` BIGINT UNSIGNED NOT NULL,
	`description` TEXT NOT NULL,
	`visibility` TINYINT UNSIGNED DEFAULT 0,
	`code` TEXT NOT NULL,
	`input` TEXT NOT NULL,
	`output` TEXT NOT NULL,
	`hash` VARCHAR(100),
    PRIMARY KEY(`userid`, `hash`),
	CONSTRAINT `userid_stfk_1`
	FOREIGN KEY (`userid`)
	REFERENCES `user_table` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;