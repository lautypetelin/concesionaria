-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2024 a las 01:37:17
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `concesionaria`
--
CREATE DATABASE IF NOT EXISTS `concesionaria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE `concesionaria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `automovil`
--

CREATE TABLE `automovil` (
  `ID` int(11) NOT NULL,
  `CANTIDADPUERTAS` int(11) DEFAULT NULL,
  `COLOR` varchar(255) DEFAULT NULL,
  `MARCA` varchar(255) DEFAULT NULL,
  `MODELO` varchar(255) DEFAULT NULL,
  `MOTOR` varchar(255) DEFAULT NULL,
  `PATENTE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `automovil`
--

INSERT INTO `automovil` (`ID`, `CANTIDADPUERTAS`, `COLOR`, `MARCA`, `MODELO`, `MOTOR`, `PATENTE`) VALUES
(1, 4, 'Rojo', 'Renault', 'Oroch', '2.0', 'AA123BI'),
(2, 5, 'Gris', 'Volkswagen', 'Gol', '1.6', 'AA596GC'),
(3, 4, 'Azul', 'Chevrolet', 'Cruze', '1.4 Turbo', 'AB987CC'),
(7, 5, 'Rojo', 'Peugeot', '408', '2.0', 'PE422EW'),
(8, 4, 'Azul', 'Fiat', 'Duna', '1.7', 'AEO 914'),
(9, 3, 'Verde', 'Chevrolet', 'Corsa', '2.4', 'AE123XQ');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `automovil`
--
ALTER TABLE `automovil`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `automovil`
--
ALTER TABLE `automovil`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
