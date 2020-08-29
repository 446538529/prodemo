/*
Navicat MySQL Data Transfer

Source Server         : master
Source Server Version : 50645
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50645
File Encoding         : 65001

Date: 2020-08-29 21:23:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
