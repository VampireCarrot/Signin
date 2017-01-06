/*
Navicat MySQL Data Transfer

Source Server         : lwd
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : signin

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2017-01-06 17:10:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `User_id` int(11) NOT NULL COMMENT '用户iD',
  `User_name` varchar(32) NOT NULL COMMENT '用户名',
  `User_desc` varchar(255) DEFAULT NULL COMMENT '用户自我介绍',
  `User_tel` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `User_sex` int(11) NOT NULL DEFAULT '1' COMMENT '性别',
  `User_avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `User_nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `User_longitude` decimal(10,7) DEFAULT NULL COMMENT '经度',
  `User_latitude` decimal(10,7) DEFAULT NULL COMMENT '纬度',
  `User_statue` int(11) NOT NULL DEFAULT '1' COMMENT '用户状态',
  `User_password` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`User_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'lwd', '打算大苏打实打实大苏打打算大苏打大苏打', '13102169005', '1', 'xxxx', '萝卜', '39.9667743', '116.4393399', '1', '123456');
