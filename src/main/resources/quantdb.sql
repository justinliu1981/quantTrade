CREATE DATABASE IF NOT EXISTS quantdb;
USE quantdb;

DROP TABLE IF EXISTS `cash`;
CREATE TABLE `cash` (
  `id` integer PRIMARY KEY auto_increment,
  `account_id` varchar(255),
  `market_value` float,
  `nav` float,
  `pnl` float,
  `fpnl` float,
  `frozen` float,
  `available` float,
  `balance` float,
  `order_frozen` float,
  `created_at` timestamp,
  `updated_at` timestamp,
  `recv_at` timestamp
);

DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` integer PRIMARY KEY auto_increment,
  `account_id` varchar(255),
  `symbol` varchar(255),
  `side` integer,
  `volume` integer,
  `volume_today` integer,
  `vwap` float,
  `vwap_diluted` float,
  `market_value` float,
  `price` float,
  `fpnl` float,
  `cost` float,
  `available_now` integer,
  `created_at` timestamp,
  `updated_at` timestamp,
  `recv_at` timestamp
);

DROP TABLE IF EXISTS `execution_report`;
CREATE TABLE `execution_report` (
  `id` integer PRIMARY KEY auto_increment,
  `account_id` varchar(255),
  `sid` varchar(255),
  `scan_name` varchar(255),
  `cl_ord_id` varchar(255),
  `order_id` varchar(255),
  `exec_id` varchar(255),
  `symbol` varchar(255),
  `order_business` integer,
  `ord_rej_reason` integer,
  `ord_rej_reason_detail` varchar(255),
  `exec_type` integer,
  `price` float,
  `volume` integer,
  `side` integer,
  `position_effect` integer,
  `amount` float,
  `created_at` timestamp,
  `recv_at` timestamp
);

DROP TABLE IF EXISTS `order_status`;
CREATE TABLE `order_status` (
  `id` integer PRIMARY KEY auto_increment,
  `account_id` varchar(255),
  `sid` varchar(255),
  `scan_name` varchar(255),
  `cl_ord_id` varchar(255),
  `order_id` varchar(255),
  `symbol` varchar(255),
  `order_type` integer,
  `order_business` integer,
  `status` integer,
  `ord_rej_reason` integer,
  `ord_rej_reason_detail` varchar(255),
  `price` float,
  `volume` integer,
  `filed_volume` integer,
  `side` integer,
  `position_effect` integer,
  `position_src` integer,
  `order_duration` integer,
  `order_qualifier` integer,
  `filed_vwap` float,
  `filed_amount` float,
  `created_at` timestamp,
  `updated_at` timestamp,
  `sent_at` timestamp,
  `recv_at` timestamp
);

DROP TABLE IF EXISTS `order_status_change`;
CREATE TABLE `order_status_change` (
  `id` integer PRIMARY KEY auto_increment,
  `account_id` varchar(255),
  `sid` varchar(255),
  `scan_name` varchar(255),
  `cl_ord_id` varchar(255),
  `order_id` varchar(255),
  `symbol` varchar(255),
  `order_type` integer,
  `order_business` integer,
  `status` integer,
  `ord_rej_reason` integer,
  `ord_rej_reason_detail` varchar(255),
  `price` float,
  `volume` integer,
  `filed_volume` integer,
  `side` integer,
  `position_effect` integer,
  `position_src` integer,
  `order_duration` integer,
  `order_qualifier` integer,
  `filed_vwap` float,
  `filed_amount` float,
  `created_at` timestamp,
  `updated_at` timestamp,
  `sent_at` timestamp,
  `recv_at` timestamp
);


