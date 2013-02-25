-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 25, 2013 at 07:02 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `p3`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenisproduk`
--

CREATE TABLE IF NOT EXISTS `jenisproduk` (
  `Kode_jenis` varchar(10) NOT NULL,
  `Nama_jenis` varchar(10) NOT NULL,
  PRIMARY KEY (`Kode_jenis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenisproduk`
--

INSERT INTO `jenisproduk` (`Kode_jenis`, `Nama_jenis`) VALUES
('001', 'ASUS'),
('002', 'AXIOO');

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE IF NOT EXISTS `produk` (
  `Kode_produk` varchar(10) NOT NULL,
  `Nama_produk` varchar(10) NOT NULL,
  `Kode_jenis` varchar(10) NOT NULL,
  `Harga_Produk` varchar(10) NOT NULL,
  PRIMARY KEY (`Kode_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`Kode_produk`, `Nama_produk`, `Kode_jenis`, `Harga_Produk`) VALUES
('01', 'MAC', '001', '10.000.000'),
('02', 'ASUS', '001', '4373672');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
