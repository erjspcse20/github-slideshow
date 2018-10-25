-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2018 at 02:48 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 5.6.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online`
--

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `uuid` varchar(50) NOT NULL,
  `state_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `created_at` varchar(50) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `is_deleted` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

INSERT INTO `city` (`id`, `uuid`, `state_id`, `name`, `description`, `created_by`, `created_at`, `is_active`, `is_deleted`) VALUES
(1, 'ab7fd781-ce02-4306-a5e4-03bb15c5e564', 'c89258b4-7c5c-4377-8435-1b9fb88565c2', 'sasaram', 'My sasaram Is Great', 'b2666191-d835-11e8-afb4-705a0f3cbc10', '2018-10-25 18:17:41', b'1', b'0');

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `id` int(11) NOT NULL,
  `uuid` varchar(50) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `is_deleted` bit(1) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `created_by` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`id`, `uuid`, `name`, `description`, `created_at`, `is_deleted`, `is_active`, `created_by`) VALUES
(1, '88e02943-b3db-4853-9f77-f7d24154070a', 'India', 'My India Is Great', '2018-10-25 15:00:30', b'0', b'1', 'b2666191-d835-11e8-afb4-705a0f3cbc10');

-- --------------------------------------------------------

--
-- Table structure for table `country_datas`
--

CREATE TABLE `country_datas` (
  `id` int(11) NOT NULL,
  `uuid` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `created_at` datetime NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `updated_by` varchar(50) NOT NULL,
  `updated_at` datetime NOT NULL,
  `is_deleted` bit(1) NOT NULL,
  `ftype` tinyint(4) NOT NULL,
  `under_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `headers`
--

CREATE TABLE `headers` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `headers`
--

INSERT INTO `headers` (`id`, `name`, `type`) VALUES
(1, 'country', 1),
(2, 'state', 2),
(3, 'city', 3);

-- --------------------------------------------------------

--
-- Table structure for table `state`
--

CREATE TABLE `state` (
  `id` int(11) NOT NULL,
  `uuid` varchar(50) NOT NULL,
  `country_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `is_deleted` bit(1) NOT NULL,
  `is_active` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `state`
--

INSERT INTO `state` (`id`, `uuid`, `country_id`, `name`, `description`, `created_at`, `created_by`, `is_deleted`, `is_active`) VALUES
(1, 'c89258b4-7c5c-4377-8435-1b9fb88565c2', '88e02943-b3db-4853-9f77-f7d24154070a', 'Bihar', 'My Bihar Is Great', '2018-10-25 17:51:03', 'b2666191-d835-11e8-afb4-705a0f3cbc10', b'0', b'1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`uuid`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `country_datas`
--
ALTER TABLE `country_datas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `headers`
--
ALTER TABLE `headers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `city`
--
ALTER TABLE `city`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `country`
--
ALTER TABLE `country`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `country_datas`
--
ALTER TABLE `country_datas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `headers`
--
ALTER TABLE `headers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `state`
--
ALTER TABLE `state`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
