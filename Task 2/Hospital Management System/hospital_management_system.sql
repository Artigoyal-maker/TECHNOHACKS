-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2026 at 05:04 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `ambulance`
--

CREATE TABLE `ambulance` (
  `Name` varchar(20) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Car_name` varchar(20) DEFAULT NULL,
  `Available` varchar(20) DEFAULT NULL,
  `Location` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ambulance`
--

INSERT INTO `ambulance` (`Name`, `Gender`, `Car_name`, `Available`, `Location`) VALUES
('Ansh', 'Male', 'ZEN', 'Available', 'area 16'),
('Rakesh', 'Male', 'Force Traveller', 'Available', 'Gate 1'),
('Sunil', 'Male', 'Mahindra Ambulance', 'Busy', 'Emergency Block'),
('Amit', 'Male', 'Tempo Traveller', 'Available', 'Parking Area'),
('Kiran', 'Female', 'Force Ambulance', 'Busy', 'ICU Block'),
('Ravi', 'Male', 'Toyota Hiace', 'Available', 'Gate 2'),
('Priya', 'Female', 'Maruti Eeco', 'Busy', 'Emergency'),
('Sohan', 'Male', 'Force Traveller', 'Available', 'Parking'),
('Anil', 'Male', 'Tempo Ambulance', 'Busy', 'ICU'),
('Ramesh', 'Male', 'Mahindra Bolero', 'Available', 'Main Gate');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `Appointment_ID` int(11) NOT NULL,
  `Patient_Name` varchar(50) DEFAULT NULL,
  `Doctor_Name` varchar(50) DEFAULT NULL,
  `Appointment_Date` date DEFAULT NULL,
  `Appointment_Time` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`Appointment_ID`, `Patient_Name`, `Doctor_Name`, `Appointment_Date`, `Appointment_Time`, `status`) VALUES
(1, 'Avi', 'Dr. Rajesh Sharma', '2026-06-25', '10:00 AM', 'Scheduled'),
(2, 'Sanjay', 'Dr. Priya Verma', '2026-06-25', '11:00 AM', 'Completed'),
(3, 'Vansh', 'Dr. Amit Gupta', '2026-06-26', '12:00 PM', 'Scheduled'),
(4, 'Rohan', 'Dr. Neha Singh', '2026-06-26', '02:00 PM', 'Scheduled'),
(5, 'Priya', 'Dr. Rohit Mehta', '2026-06-27', '09:30 AM', 'Completed'),
(6, 'Amit', 'Dr. Vivek Kumar', '2026-06-27', '03:00 PM', 'Cancelled'),
(7, 'Sneha', 'Dr. Anjali Jain', '2026-06-28', '10:15 AM', 'Scheduled'),
(8, 'Karan', 'Dr. Arjun Kapoor', '2026-06-29', '09:00 AM', 'Scheduled'),
(9, 'Neha', 'Dr. Sneha Patel', '2026-06-29', '10:30 AM', 'Scheduled'),
(10, 'Rakesh', 'Dr. Sonal Gupta', '2026-06-29', '12:00 PM', 'Scheduled'),
(11, 'Vanshika', 'Dr. Rohit Mehta', '2026-06-29', '02:00 PM', 'Scheduled'),
(12, 'Avi', 'Dr. Rajesh Sharma', '2026-07-02', '09:30 AM', 'Scheduled'),
(13, 'Sanjay', 'Dr. Meera Joshi', '2026-07-02', '10:30 AM', 'Scheduled'),
(14, 'Priya', 'Dr. Ritu Agarwal', '2026-07-03', '11:00 AM', 'Scheduled'),
(15, 'Amit', 'Dr. Manish Verma', '2026-07-03', '01:00 PM', 'Scheduled'),
(16, 'Sneha', 'Dr. Nisha Mehta', '2026-07-03', '03:00 PM', 'Scheduled'),
(17, 'Rohan', 'Dr. Deepak Singh', '2026-07-04', '09:00 AM', 'Scheduled'),
(18, 'Vansh', 'Dr. Kavita Sharma', '2026-07-04', '11:30 AM', 'Scheduled'),
(19, 'Karan', 'Dr. Akash Jain', '2026-07-05', '04:00 PM', 'Scheduled'),
(20, 'Neha', 'Dr. Pooja Khanna', '2026-07-05', '05:00 PM', 'Scheduled'),
(21, 'Ankit', 'Dr. Rajesh Sharma', '2026-06-30', '09:00 AM', 'Scheduled'),
(22, 'Muskan', 'Dr. Priya Verma', '2026-06-30', '09:30 AM', 'Scheduled'),
(23, 'Nitin', 'Dr. Amit Gupta', '2026-06-30', '10:00 AM', 'Scheduled'),
(24, 'Sakshi', 'Dr. Neha Singh', '2026-06-30', '10:30 AM', 'Scheduled'),
(25, 'Abhishek', 'Dr. Arjun Kapoor', '2026-06-30', '11:00 AM', 'Scheduled'),
(26, 'Kajal', 'Dr. Ritu Agarwal', '2026-06-30', '11:30 AM', 'Scheduled'),
(27, 'Yash', 'Dr. Manish Verma', '2026-06-30', '12:00 PM', 'Scheduled'),
(28, 'Divya', 'Dr. Sneha Patel', '2026-06-30', '12:30 PM', 'Scheduled'),
(29, 'Harsh', 'Dr. Sonal Gupta', '2026-06-30', '01:00 PM', 'Scheduled'),
(30, 'Pallavi', 'Dr. Rohit Mehta', '2026-06-30', '01:30 PM', 'Scheduled'),
(31, 'Ankit Sharma', 'Dr. Rajesh Sharma', '2026-06-29', '09:00 AM', 'Scheduled'),
(32, 'Pooja Verma', 'Dr. Priya Verma', '2026-06-29', '09:30 AM', 'Completed'),
(33, 'Ravi Kumar', 'Dr. Amit Gupta', '2026-06-29', '10:00 AM', 'Scheduled'),
(34, 'Neha Singh', 'Dr. Neha Singh', '2026-06-29', '10:30 AM', 'Scheduled'),
(35, 'Mohit Gupta', 'Dr. Amit Gupta', '2026-06-29', '11:00 AM', 'Completed'),
(36, 'Kajal Jain', 'Dr. Rohit Mehta', '2026-06-29', '11:30 AM', 'Scheduled'),
(37, 'Sumit Arora', 'Dr. Vivek Kumar', '2026-06-29', '12:00 PM', 'Cancelled'),
(38, 'Nisha Kapoor', 'Dr. Neha Singh', '2026-06-29', '12:30 PM', 'Scheduled'),
(39, 'Rahul Mehta', 'Dr. Sneha Patel', '2026-06-29', '01:00 PM', 'Completed'),
(40, 'Simran Kaur', 'Dr. Karan Malhotra', '2026-06-29', '01:30 PM', 'Scheduled'),
(41, 'Aman Yadav', 'Dr. Sonal Gupta', '2026-06-30', '09:00 AM', 'Scheduled'),
(42, 'Ritika Sharma', 'Dr. Meera Joshi', '2026-06-30', '09:30 AM', 'Completed'),
(43, 'Deepak Verma', 'Dr. Rajesh Sharma', '2026-06-30', '10:00 AM', 'Scheduled'),
(44, 'Priyanka Gupta', 'Dr. Pooja Agarwal', '2026-06-30', '10:30 AM', 'Scheduled'),
(45, 'Sachin Kumar', 'Dr. Manish Verma', '2026-06-30', '11:00 AM', 'Completed'),
(46, 'Meena Sharma', 'Dr. Ritu Agarwal', '2026-06-30', '11:30 AM', 'Scheduled'),
(47, 'Ajay Singh', 'Dr. Akash Jain', '2026-06-30', '12:00 PM', 'Scheduled'),
(48, 'Komal Verma', 'Dr. Nisha Mehta', '2026-06-30', '12:30 PM', 'Completed'),
(49, 'Vikas Gupta', 'Dr. Arjun Kapoor', '2026-06-30', '01:00 PM', 'Scheduled'),
(50, 'Sneha Arora', 'Dr. Deepak Singh', '2026-06-30', '01:30 PM', 'Cancelled'),
(51, 'Aarav Sharma', 'Dr. Rajesh Sharma', '2026-06-30', '11:30 AM', 'Scheduled'),
(52, 'Hardik Pandey', 'Dr. Rajesh Sharma', '2026-06-30', '1:30 PM', 'Scheduled'),
(53, 'Aarav', 'Dr. Rajesh Sharma', '2026-06-30', '12:30 PM', 'Scheduled'),
(54, 'Khushi', 'Dr. Rajesh Sharma', '2026-06-30', '8:40 AM', 'Scheduled');

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `bill_id` int(11) NOT NULL,
  `patient_name` varchar(50) DEFAULT NULL,
  `room_charge` int(11) DEFAULT NULL,
  `doctor_fee` int(11) DEFAULT NULL,
  `medicine_charge` int(11) DEFAULT NULL,
  `total_amount` int(11) DEFAULT NULL,
  `bill_date` date DEFAULT NULL,
  `payment_status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`bill_id`, `patient_name`, `room_charge`, `doctor_fee`, `medicine_charge`, `total_amount`, `bill_date`, `payment_status`) VALUES
(1, 'Avi', 500, 1000, 300, 1800, '2026-06-24', 'Paid'),
(2, 'Sanjay', 500, 1500, 500, 2500, '2026-06-24', 'Pending'),
(3, 'Vansh', 3500, 2000, 700, 6200, '2026-06-24', 'Paid'),
(4, 'Rohan', 500, 800, 200, 1500, '2026-06-24', 'Paid'),
(5, 'Priya', 1500, 1200, 300, 3000, '2026-06-24', 'Pending'),
(6, 'Sneha', 500, 1200, 300, 2000, '2026-06-25', 'Paid'),
(7, 'Karan', 3500, 1500, 600, 5600, '2026-06-25', 'Pending'),
(8, 'Neha', 1500, 800, 250, 2550, '2026-06-25', 'Paid'),
(9, 'Rakesh', 1500, 800, 300, 2600, '2026-06-26', 'Paid'),
(10, 'Vanshika', 1500, 1000, 350, 2850, '2026-06-26', 'Pending'),
(11, 'Amit', 1500, 1700, 500, 3700, '2026-06-27', 'Paid'),
(12, 'Priya', 1500, 1000, 400, 2900, '2026-06-27', 'Paid'),
(13, 'Rohan', 500, 1200, 300, 2000, '2026-06-27', 'Pending'),
(14, 'Avi', 500, 1500, 450, 2450, '2026-06-28', 'Paid'),
(15, 'Sanjay', 500, 1600, 500, 2600, '2026-06-28', 'Paid'),
(16, 'Vansh', 3500, 1700, 700, 5900, '2026-06-28', 'Pending'),
(17, 'Sneha', 500, 1300, 350, 2150, '2026-06-29', 'Paid'),
(18, 'Karan', 3500, 1500, 800, 5800, '2026-06-29', 'Paid'),
(19, 'Neha', 1500, 1400, 300, 3200, '2026-06-29', 'Pending'),
(20, 'Rakesh', 1500, 1200, 400, 3100, '2026-06-29', 'Paid'),
(21, 'Ankit', 1500, 1500, 500, 3500, '2026-06-29', 'Paid'),
(22, 'Muskan', 1500, 1800, 600, 3900, '2026-06-29', 'Pending'),
(23, 'Nitin', 3500, 1700, 700, 5900, '2026-06-29', 'Paid'),
(24, 'Sakshi', 3500, 1200, 500, 5200, '2026-06-29', 'Paid'),
(25, 'Abhishek', 3500, 1500, 800, 5800, '2026-06-29', 'Pending'),
(26, 'Kajal', 3500, 1400, 500, 5400, '2026-06-29', 'Paid'),
(27, 'Yash', 3500, 1700, 600, 5800, '2026-06-29', 'Paid'),
(28, 'Divya', 3500, 800, 400, 4700, '2026-06-29', 'Pending'),
(29, 'Harsh', 3500, 800, 450, 4750, '2026-06-29', 'Paid'),
(30, 'Pallavi', 3500, 1000, 500, 5000, '2026-06-29', 'Paid'),
(31, 'Ankit Sharma', 500, 1500, 300, 2300, '2026-06-29', 'Paid'),
(32, 'Pooja Verma', 500, 1200, 400, 2100, '2026-06-29', 'Pending'),
(33, 'Ravi Kumar', 500, 1500, 500, 2500, '2026-06-29', 'Paid'),
(34, 'Neha Singh', 500, 1000, 350, 1850, '2026-06-29', 'Paid'),
(35, 'Mohit Gupta', 500, 1800, 600, 2900, '2026-06-29', 'Pending'),
(36, 'Kajal Jain', 500, 1200, 300, 2000, '2026-06-29', 'Paid'),
(37, 'Sumit Arora', 500, 900, 250, 1650, '2026-06-29', 'Paid'),
(38, 'Nisha Kapoor', 500, 1000, 450, 1950, '2026-06-29', 'Pending'),
(39, 'Rahul Mehta', 500, 1000, 350, 1850, '2026-06-29', 'Paid'),
(40, 'Simran Kaur', 500, 2000, 500, 3000, '2026-06-29', 'Paid'),
(41, 'Aman Yadav', 5000, 1500, 700, 7200, '2026-06-30', 'Paid'),
(42, 'Ritika Sharma', 5000, 1700, 600, 7300, '2026-06-30', 'Pending'),
(43, 'Deepak Verma', 5000, 1500, 550, 7050, '2026-06-30', 'Paid'),
(44, 'Priyanka Gupta', 5000, 1200, 400, 6600, '2026-06-30', 'Paid'),
(45, 'Sachin Kumar', 7000, 1800, 700, 9500, '2026-06-30', 'Pending'),
(46, 'Meena Sharma', 7000, 1600, 500, 9100, '2026-06-30', 'Paid'),
(47, 'Ajay Singh', 7000, 1000, 450, 8450, '2026-06-30', 'Paid'),
(48, 'Komal Verma', 7000, 1400, 550, 8950, '2026-06-30', 'Pending'),
(49, 'Vikas Gupta', 7000, 1800, 650, 9450, '2026-06-30', 'Paid'),
(50, 'Sneha Arora', 7000, 1200, 500, 8700, '2026-06-30', 'Paid'),
(51, 'Aarav Sharma', 9000, 1500, 1800, 12300, '2026-06-29', 'Paid'),
(52, 'Hardik Pandey', 9000, 1500, 1800, 12300, '2026-06-29', 'Paid'),
(53, 'Aarav', 9000, 1500, 1500, 12000, '2026-06-29', 'Paid'),
(54, 'Khushi', 9000, 1500, 800, 11300, '2026-06-29', 'Paid');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `Department` varchar(30) DEFAULT NULL,
  `Phone_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`Department`, `Phone_no`) VALUES
('Surgical department', '8642135701'),
('Nursing department', '1234567801'),
('Operation theater complex(OT)', '8642135701'),
('Paramedical department', '1234567801'),
('Cardiology', '9876501001'),
('Neurology', '9876501002'),
('Orthopedics', '9876501003'),
('Dermatology', '9876501004'),
('Pediatrics', '9876501005'),
('Gynecology', '9876501006'),
('ENT', '9876501007'),
('Radiology', '9876501008'),
('Emergency', '9876501009'),
('General Medicine', '9876501010'),
('Pharmacy', '9876501011'),
('Laboratory', '9876501012');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor_ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Specialization` varchar(50) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `Availability` varchar(20) DEFAULT NULL,
  `Doctor_Fee` int(11) DEFAULT 1000
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor_ID`, `Name`, `Specialization`, `Phone`, `email`, `Availability`, `Doctor_Fee`) VALUES
(1, 'Dr. Rajesh Sharma', 'Cardiologist', '9876543210', 'rajesh.sharma@gmail.com', 'Available', 1500),
(2, 'Dr. Priya Verma', 'Neurologist', '9876543211', 'priya.verma@gmail.com', 'Busy', 1800),
(3, 'Dr. Amit Gupta', 'Orthopedic Surgeon', '9876543212', 'amit.gupta@gmail.com', 'Available', 1700),
(4, 'Dr. Neha Singh', 'Dermatologist', '9876543213', 'neha.singh@gmail.com', 'Available', 1200),
(5, 'Dr. Rohit Mehta', 'Pediatrician', '9876543214', 'rohit.mehta@gmail.com', 'Available', 1000),
(6, 'Dr. Anjali Jain', 'Gynecologist', '9876543215', 'anjali.jain@gmail.com', 'Available', 1400),
(7, 'Dr. Vivek Kumar', 'ENT Specialist', '9876543216', 'vivek.kumar@gmail.com', 'Available', 1100),
(8, 'Dr. Pooja Agarwal', 'Ophthalmologist', '9876543217', 'pooja.agarwal@gmail.com', 'Available', 1300),
(9, 'Dr. Karan Malhotra', 'Psychiatrist', '9876543218', 'karan.malhotra@gmail.com', 'Available', 2000),
(10, 'Dr. Sneha Patel', 'General Physician', '9876543219', 'sneha.patel@gmail.com', 'Available', 800),
(11, 'Dr. Ritu Agarwal', 'Gynecologist', '9876543223', 'ritu.agarwal@gmail.com', 'On Leave', 1400),
(12, 'Dr. Arjun Kapoor', 'Cardiologist', '9876543220', 'arjun.kapoor@gmail.com', 'Available', 1500),
(13, 'Dr. Kavita Sharma', 'Neurologist', '9876543221', 'kavita.sharma@gmail.com', 'Busy', 1800),
(14, 'Dr. Manish Verma', 'Orthopedic Surgeon', '9876543222', 'manish.verma@gmail.com', 'Available', 1700),
(15, 'Dr. Sandeep Yadav', 'Pediatrician', '9876543224', 'sandeep.yadav@gmail.com', 'On Leave', 1000),
(16, 'Dr. Nisha Mehta', 'Dermatologist', '9876543225', 'nisha.mehta@gmail.com', 'Available', 1200),
(17, 'Dr. Akash Jain', 'ENT Specialist', '9876543226', 'akash.jain@gmail.com', 'Busy', 1100),
(18, 'Dr. Pooja Khanna', 'Ophthalmologist', '9876543227', 'pooja.khanna@gmail.com', 'Available', 1300),
(19, 'Dr. Deepak Singh', 'Psychiatrist', '9876543228', 'deepak.singh@gmail.com', 'On Leave', 2000),
(20, 'Dr. Sonal Gupta', 'General Physician', '9876543229', 'sonal.gupta@gmail.com', 'Available', 800),
(21, 'Dr. Meera Joshi', 'Endocrinologist', '9876543230', 'meera.joshi@gmail.com', 'Busy', 1600),
(22, 'Dr. Anil Sharma', 'Cardiologist', '9876543231', 'anil.sharma@gmail.com', 'Available', 1500),
(23, 'Dr. Meena Kapoor', 'Neurologist', '9876543232', 'meena.kapoor@gmail.com', 'Busy', 1800),
(24, 'Dr. Vikram Singh', 'Orthopedic Surgeon', '9876543233', 'vikram.singh@gmail.com', 'Available', 1700),
(25, 'Dr. Richa Verma', 'Dermatologist', '9876543234', 'richa.verma@gmail.com', 'Available', 1200),
(26, 'Dr. Saurabh Jain', 'Pediatrician', '9876543235', 'saurabh.jain@gmail.com', 'Available', 1000),
(27, 'Dr. Neelam Arora', 'Gynecologist', '9876543236', 'neelam.arora@gmail.com', 'Busy', 1600),
(28, 'Dr. Ajay Kumar', 'ENT Specialist', '9876543237', 'ajay.kumar@gmail.com', 'Available', 1100),
(29, 'Dr. Shweta Gupta', 'Ophthalmologist', '9876543238', 'shweta.gupta@gmail.com', 'Available', 1300),
(30, 'Dr. Nitin Malhotra', 'Psychiatrist', '9876543239', 'nitin.malhotra@gmail.com', 'On Leave', 1800),
(31, 'Dr. Bhavna Patel', 'General Physician', '9876543240', 'bhavna.patel@gmail.com', 'Available', 900),
(32, 'Dr. Kunal Sharma', 'Endocrinologist', '9876543241', 'kunal.sharma@gmail.com', 'Available', 1700),
(33, 'Dr. Pankaj Verma', 'Cardiologist', '9876543242', 'pankaj.verma@gmail.com', 'Busy', 1500),
(34, 'Dr. Rekha Mehta', 'Neurologist', '9876543243', 'rekha.mehta@gmail.com', 'Available', 1800),
(35, 'Dr. Imran Khan', 'Orthopedic Surgeon', '9876543244', 'imran.khan@gmail.com', 'Available', 1700),
(36, 'Dr. Aditi Singh', 'Dermatologist', '9876543245', 'aditi.singh@gmail.com', 'On Leave', 1200),
(37, 'Dr. Gaurav Bansal', 'Pediatrician', '9876543246', 'gaurav.bansal@gmail.com', 'Available', 1000),
(38, 'Dr. Sonam Yadav', 'Gynecologist', '9876543247', 'sonam.yadav@gmail.com', 'Available', 1600),
(39, 'Dr. Vivek Arora', 'ENT Specialist', '9876543248', 'vivek.arora@gmail.com', 'Busy', 1100),
(40, 'Dr. Arti Mishra', 'General Physician', '9876543249', 'arti.mishra@gmail.com', 'Available', 900);

-- --------------------------------------------------------

--
-- Table structure for table `emp_info`
--

CREATE TABLE `emp_info` (
  `Employee_ID` int(11) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Age` varchar(20) DEFAULT NULL,
  `Phone_Number` varchar(20) DEFAULT NULL,
  `Salary` varchar(20) DEFAULT NULL,
  `Gmail` varchar(100) DEFAULT NULL,
  `Aadhar_Number` varchar(20) DEFAULT NULL,
  `Department` varchar(50) DEFAULT NULL,
  `Joining_Date` date DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Designation` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp_info`
--

INSERT INTO `emp_info` (`Employee_ID`, `Name`, `Age`, `Phone_Number`, `Salary`, `Gmail`, `Aadhar_Number`, `Department`, `Joining_Date`, `Status`, `Designation`) VALUES
(1, 'Rahul Sharma', '28', '9876000001', '35000', 'rahul@gmail.com', '123456789101', 'Emergency', '2025-01-10', 'Active', 'Nurse'),
(2, 'Pooja Verma', '30', '9876000002', '38000', 'pooja@gmail.com', '123456789102', 'Cardiology', '2024-05-12', 'Active', 'Nurse'),
(3, 'Aman Gupta', '26', '9876000003', '25000', 'aman@gmail.com', '123456789201', 'Reception', '2025-02-15', 'Active', 'Receptionist'),
(4, 'Riya Singh', '32', '9876000004', '45000', 'riya@gmail.com', '123456789202', 'Laboratory', '2023-08-20', 'Active', 'Lab Technician'),
(5, 'Mohit Jain', '29', '9876000005', '28000', 'mohit@gmail.com', '111122223337', 'Pharmacy', '2025-01-05', 'Active', 'Pharmacist'),
(6, 'Kavita Sharma', '35', '9876000006', '50000', 'kavita@gmail.com', '111122223338', 'HR', '2022-06-14', 'Active', 'HR Manager'),
(7, 'Suresh Kumar', '40', '9876000007', '30000', 'suresh@gmail.com', '111122223339', 'Ward', '2024-02-18', 'Active', 'Ward Boy'),
(8, 'Nidhi Patel', '27', '9876000008', '38000', 'nidhi@gmail.com', '111122223340', 'Neurology', '2025-04-11', 'On Leave', 'Nurse'),
(9, 'Deepak Arora', '31', '9876000009', '42000', 'deepak@gmail.com', '111122223341', 'Radiology', '2024-09-01', 'Active', 'Technician'),
(10, 'Simran Kaur', '29', '9876000010', '27000', 'simran@gmail.com', '111122223342', 'Reception', '2025-02-01', 'Active', 'Receptionist'),
(11, 'Arun Mishra', '34', '9876000011', '32000', 'arun@gmail.com', '111122223343', 'Emergency', '2024-05-15', 'Active', 'Nurse'),
(12, 'Meena Sharma', '29', '9876000012', '36000', 'meena@gmail.com', '111122223344', 'ICU', '2024-07-20', 'Active', 'Staff Nurse'),
(13, 'Ajay Kumar', '38', '9876000013', '45000', 'ajay@gmail.com', '111122223345', 'Accounts', '2023-11-12', 'Active', 'Accountant'),
(14, 'Pankaj Singh', '41', '9876000014', '30000', 'pankaj@gmail.com', '111122223346', 'Security', '2022-10-05', 'Active', 'Security Guard'),
(15, 'Shweta Jain', '27', '9876000015', '34000', 'shweta@gmail.com', '111122223347', 'Pharmacy', '2025-01-18', 'Active', 'Pharmacist'),
(16, 'Vikas Arora', '36', '9876000016', '37000', 'vikas@gmail.com', '111122223348', 'Radiology', '2024-06-09', 'Active', 'Technician'),
(17, 'Anita Verma', '33', '9876000017', '42000', 'anita@gmail.com', '111122223349', 'Administration', '2023-03-14', 'Active', 'Administrator'),
(18, 'Rohit Saxena', '30', '9876000018', '31000', 'rohit@gmail.com', '111122223350', 'Ward', '2025-02-11', 'Active', 'Ward Boy'),
(19, 'Komal Gupta', '28', '9876000019', '35000', 'komal@gmail.com', '111122223351', 'Laboratory', '2024-04-17', 'Active', 'Lab Assistant'),
(20, 'Tarun Kapoor', '39', '9876000020', '50000', 'tarun@gmail.com', '111122223352', 'HR', '2022-09-08', 'Active', 'HR Manager'),
(21, 'Rohit Verma', '27', '9876000021', '32000', 'rohit.verma@gmail.com', '111122223343', 'Emergency', '2025-03-12', 'Active', 'Nurse'),
(22, 'Sneha Sharma', '30', '9876000022', '36000', 'sneha.sharma@gmail.com', '111122223344', 'Cardiology', '2024-08-14', 'Active', 'Nurse'),
(23, 'Vikas Singh', '33', '9876000023', '28000', 'vikas.singh@gmail.com', '111122223345', 'Pharmacy', '2023-12-01', 'Active', 'Pharmacist'),
(24, 'Anjali Gupta', '26', '9876000024', '27000', 'anjali.gupta@gmail.com', '111122223346', 'Reception', '2025-01-20', 'Active', 'Receptionist'),
(25, 'Harsh Mehta', '31', '9876000025', '45000', 'harsh.mehta@gmail.com', '111122223347', 'Radiology', '2024-06-18', 'Active', 'Technician'),
(26, 'Priya Kapoor', '29', '9876000026', '39000', 'priya.kapoor@gmail.com', '111122223348', 'Neurology', '2025-02-22', 'Active', 'Nurse'),
(27, 'Amit Sharma', '35', '9876000027', '50000', 'amit.sharma@gmail.com', '111122223349', 'Laboratory', '2023-10-15', 'Active', 'Lab Technician'),
(28, 'Komal Arora', '28', '9876000028', '34000', 'komal.arora@gmail.com', '111122223350', 'Ward', '2025-04-10', 'Active', 'Ward Boy'),
(29, 'Deepika Jain', '32', '9876000029', '52000', 'deepika.jain@gmail.com', '111122223351', 'HR', '2022-11-05', 'Active', 'HR Manager'),
(30, 'Yash Malhotra', '27', '9876000030', '30000', 'yash.malhotra@gmail.com', '111122223352', 'Emergency', '2025-05-11', 'Active', 'Nurse'),
(31, 'Ritika Verma', '30', '9876000031', '41000', 'ritika.verma@gmail.com', '111122223353', 'Dermatology', '2024-04-20', 'Active', 'Assistant'),
(32, 'Abhay Kumar', '34', '9876000032', '46000', 'abhay.kumar@gmail.com', '111122223354', 'Orthopedics', '2023-09-17', 'Active', 'Technician'),
(33, 'Sonal Mehta', '29', '9876000033', '35000', 'sonal.mehta@gmail.com', '111122223355', 'Gynecology', '2025-01-09', 'Active', 'Nurse'),
(34, 'Karan Arora', '31', '9876000034', '33000', 'karan.arora@gmail.com', '111122223356', 'ENT', '2024-07-07', 'On Leave', 'Assistant'),
(35, 'Pallavi Singh', '28', '9876000035', '29000', 'pallavi.singh@gmail.com', '111122223357', 'Reception', '2025-03-03', 'Active', 'Receptionist'),
(36, 'Nikhil Gupta', '36', '9876000036', '55000', 'nikhil.gupta@gmail.com', '111122223358', 'Administration', '2022-05-01', 'Active', 'Administrator'),
(37, 'Meena Yadav', '33', '9876000037', '42000', 'meena.yadav@gmail.com', '111122223359', 'ICU', '2024-02-28', 'Active', 'Senior Nurse'),
(38, 'Akash Sharma', '26', '9876000038', '27000', 'akash.sharma@gmail.com', '111122223360', 'Pharmacy', '2025-06-10', 'Active', 'Pharmacist'),
(39, 'Pooja Mehra', '29', '9876000039', '36000', 'pooja.mehra@gmail.com', '111122223361', 'Laboratory', '2024-10-01', 'Active', 'Lab Technician'),
(40, 'Manoj Kumar', '38', '9876000040', '48000', 'manoj.kumar@gmail.com', '111122223362', 'Administration', '2023-01-12', 'Active', 'Office Manager');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` varchar(20) DEFAULT NULL,
  `PW` varchar(20) DEFAULT NULL,
  `ROLE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `PW`, `ROLE`) VALUES
('techcoder', 'tech1234', 'Admin'),
('arti', 'arti1234', 'Doctor'),
('patient1', '123', 'Patient');

-- --------------------------------------------------------

--
-- Table structure for table `patient_info`
--

CREATE TABLE `patient_info` (
  `ID` varchar(20) DEFAULT NULL,
  `Number` varchar(40) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Patient_Disease` varchar(20) DEFAULT NULL,
  `Room_Number` varchar(20) DEFAULT NULL,
  `Time` varchar(100) DEFAULT NULL,
  `Deposite` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient_info`
--

INSERT INTO `patient_info` (`ID`, `Number`, `Name`, `Gender`, `Patient_Disease`, `Room_Number`, `Time`, `Deposite`) VALUES
('Aadhar Card', '123456789021', 'Avi', 'Male', 'Viral Fever', '101', 'Wed Mar 11 16:44:13 IST 2026', '500'),
('Aadhar Card', '123456789012', 'Sanjay', 'Male', 'Diabetes', '104', 'Mon Apr 20 11:43:48 IST 2026', '200'),
('Voter Id', '121515454', 'Vansh', 'Male', 'High BP', '302', 'Mon Jun 08 15:53:48 IST 2026', '1000'),
('Aadhar Card', '123456789111', 'Rohan', 'Male', 'Fever', '100', '2026-06-24 18:42:37', '500'),
('Aadhar Card', '123456789112', 'Priya', 'Female', 'Migraine', '200', '2026-06-24 18:42:37', '1500'),
('Voter Id', '123456789113', 'Amit', 'Male', 'Fracture', '201', '2026-06-24 18:42:37', '1500'),
('Passport', '123456789114', 'Sneha', 'Female', 'Skin Allergy', '102', '2026-06-24 18:42:37', '500'),
('Aadhar Card', '123456789115', 'Karan', 'Male', 'Heart Problem', '300', '2026-06-24 18:42:37', '3500'),
('Aadhar Card', '123456789116', 'Neha', 'Female', 'Diabetes', '202', '2026-06-24 18:42:37', '1500'),
('Voter Id', '123456789117', 'Rakesh', 'Male', 'High BP', '203', '2026-06-24 18:42:37', '1500'),
('Aadhar Card', '123456789259', 'Vanshika', 'Female', 'High Fever', '204', 'Sun Jun 28 17:50:33 IST 2026', '300'),
('Aadhar Card', '123456789118', 'Ankit', 'Male', 'Asthma', '205', '2026-06-29 09:00:00', '1500'),
('Passport', '123456789119', 'Muskan', 'Female', 'Typhoid', '206', '2026-06-29 09:20:00', '1500'),
('Voter Id', '123456789120', 'Nitin', 'Male', 'Kidney Stone', '301', '2026-06-29 10:00:00', '3500'),
('Aadhar Card', '123456789121', 'Sakshi', 'Female', 'Pneumonia', '303', '2026-06-29 10:20:00', '3500'),
('Passport', '123456789122', 'Abhishek', 'Male', 'Heart Attack', '304', '2026-06-29 11:00:00', '3500'),
('Aadhar Card', '123456789123', 'Kajal', 'Female', 'Pregnancy', '305', '2026-06-29 11:30:00', '3500'),
('Voter Id', '123456789124', 'Yash', 'Male', 'Fracture', '306', '2026-06-29 12:00:00', '3500'),
('Aadhar Card', '123456789125', 'Divya', 'Female', 'Migraine', '307', '2026-06-29 12:30:00', '3500'),
('Passport', '123456789126', 'Harsh', 'Male', 'Diabetes', '308', '2026-06-29 01:00:00', '3500'),
('Aadhar Card', '123456789127', 'Pallavi', 'Female', 'High Fever', '309', '2026-06-29 01:30:00', '3500'),
('Voter Id', '123456789231', 'Pooja Verma', 'Female', 'Diabetes', '106', '2026-06-28 09:10:00', '500'),
('Passport', '123456789232', 'Ravi Kumar', 'Male', 'Heart Disease', '107', '2026-06-28 09:20:00', '500'),
('Aadhar Card', '123456789234', 'Mohit Gupta', 'Male', 'Fracture', '109', '2026-06-28 09:40:00', '500'),
('Passport', '123456789235', 'Kajal Jain', 'Female', 'Asthma', '110', '2026-06-28 09:50:00', '500'),
('Voter Id', '123456789236', 'Sumit Arora', 'Male', 'Typhoid', '111', '2026-06-28 10:00:00', '500'),
('Aadhar Card', '123456789237', 'Nisha Kapoor', 'Female', 'Skin Allergy', '112', '2026-06-28 10:10:00', '500'),
('Driving License', '123456789238', 'Rahul Mehta', 'Male', 'High BP', '113', '2026-06-28 10:20:00', '500'),
('Passport', '123456789239', 'Simran Kaur', 'Female', 'Covid', '114', '2026-06-28 10:30:00', '500'),
('Aadhar Card', '123456789240', 'Aman Yadav', 'Male', 'Pneumonia', '400', '2026-06-28 10:40:00', '5000'),
('Voter Id', '123456789241', 'Ritika Sharma', 'Female', 'Kidney Stone', '401', '2026-06-28 10:50:00', '5000'),
('Passport', '123456789242', 'Deepak Verma', 'Male', 'Malaria', '402', '2026-06-28 11:00:00', '5000'),
('Driving License', '123456789243', 'Priyanka Gupta', 'Female', 'Eye Infection', '403', '2026-06-28 11:10:00', '5000'),
('Aadhar Card', '123456789244', 'Sachin Kumar', 'Male', 'Back Pain', '500', '2026-06-28 11:20:00', '7000'),
('Passport', '123456789245', 'Meena Sharma', 'Female', 'Arthritis', '501', '2026-06-28 11:30:00', '7000'),
('Voter Id', '123456789246', 'Ajay Singh', 'Male', 'Ulcer', '502', '2026-06-28 11:40:00', '7000'),
('Driving License', '123456789247', 'Komal Verma', 'Female', 'Jaundice', '503', '2026-06-28 11:50:00', '7000'),
('Aadhar Card', '123456789248', 'Vikas Gupta', 'Male', 'Appendicitis', '504', '2026-06-28 12:00:00', '7000'),
('Passport', '123456789249', 'Sneha Arora', 'Female', 'Thyroid', '505', '2026-06-28 12:10:00', '7000'),
('Voter Id', '123456789250', 'Rohit Sharma', 'Male', 'Dengue', '506', '2026-06-28 12:20:00', '7000'),
('Driving License', '123456789251', 'Anjali Kapoor', 'Female', 'Anemia', '507', '2026-06-28 12:30:00', '7000'),
('Aadhar Card', '123456789252', 'Karan Malhotra', 'Male', 'Chest Pain', '508', '2026-06-28 12:40:00', '7000'),
('Passport', '123456789253', 'Shreya Jain', 'Female', 'Sinus', '509', '2026-06-28 12:50:00', '7000'),
('Voter Id', '123456789254', 'Nitin Sharma', 'Male', 'Food Poisoning', '510', '2026-06-28 01:00:00', '7000'),
('Driving License', '123456789255', 'Isha Verma', 'Female', 'Fever', '511', '2026-06-28 01:10:00', '7000'),
('Aadhar Card', '123456789256', 'Abhishek Gupta', 'Male', 'Diabetes', '512', '2026-06-28 01:20:00', '7000'),
('Passport', '123456789257', 'Pallavi Singh', 'Female', 'Heart Disease', '513', '2026-06-28 01:30:00', '7000'),
('Voter Id', '123456789258', 'Manish Kumar', 'Male', 'Asthma', '514', '2026-06-28 01:40:00', '7000'),
('Aadhar Card', '987654321987', 'Aarav Sharma', 'Male', 'Dengue', '603', 'Mon Jun 29 22:10:06 IST 2026', '9000'),
('Aadhar Card', '987654253789', 'Hardik Pandey', 'Male', 'Dengue', '601', 'Mon Jun 29 23:07:41 IST 2026', '9000'),
('Aadhar Card', '256325486975', 'Aarav', 'Male', 'Dengue', '602', 'Mon Jun 29 23:22:14 IST 2026', '9000'),
('Aadhar Card', '123564789213', 'Khushi', 'Female', 'High Fever', '600', 'Mon Jun 29 23:29:24 IST 2026', '9000');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_no` varchar(20) NOT NULL,
  `Availability` varchar(20) DEFAULT NULL,
  `Price` varchar(20) DEFAULT NULL,
  `room_type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_no`, `Availability`, `Price`, `room_type`) VALUES
('100', 'Occupied', '500', 'G BAD 1'),
('101', 'Occupied', '500', 'G BAD 2'),
('102', 'Occupied', '500', 'G BAD 3'),
('103', 'Available', '500', 'G BAD 4'),
('104', 'Occupied', '500', 'G BAD 5'),
('105', 'Available', '500', 'General Bed 6'),
('106', 'Occupied', '500', 'General Bed 7'),
('107', 'Occupied', '500', 'General Bed 8'),
('108', 'Available', '500', 'General Bed 9'),
('109', 'Occupied', '500', 'General Bed 10'),
('110', 'Occupied', '500', 'General Bed 11'),
('111', 'Occupied', '500', 'General Bed 12'),
('112', 'Occupied', '500', 'General Bed 13'),
('113', 'Occupied', '500', 'General Bed 14'),
('114', 'Occupied', '500', 'General Bed 15'),
('200', 'Occupied', '1500', 'Private Room'),
('201', 'Occupied', '1500', 'Private Room'),
('202', 'Occupied', '1500', 'Private Room'),
('203', 'Occupied', '1500', 'Private Room'),
('204', 'Occupied', '1500', 'Private Room'),
('205', 'Occupied', '1500', 'Private Room'),
('206', 'Occupied', '1500', 'Private Room'),
('300', 'Occupied', '3500', 'ICU BAD 1'),
('301', 'Occupied', '3500', 'ICU BAD 2'),
('302', 'Occupied', '3500', 'ICU BAD 3'),
('303', 'Occupied', '3500', 'ICU BAD 4'),
('304', 'Occupied', '3500', 'ICU BAD 5'),
('305', 'Occupied', '3500', 'ICU BAD 6'),
('306', 'Occupied', '3500', 'ICU BED 7'),
('307', 'Occupied', '3500', 'ICU BED 8'),
('308', 'Occupied', '3500', 'ICU BED 9'),
('309', 'Occupied', '3500', 'ICU BED 10'),
('400', 'Occupied', '5000', 'Deluxe Room'),
('401', 'Occupied', '5000', 'Deluxe Room'),
('402', 'Occupied', '5000', 'Deluxe Room'),
('403', 'Occupied', '5000', 'Deluxe Room'),
('500', 'Occupied', '7000', 'VIP Suite'),
('501', 'Occupied', '7000', 'VIP Suite'),
('502', 'Occupied', '7000', 'VIP Suite'),
('503', 'Occupied', '7000', 'VIP Suite'),
('504', 'Occupied', '7000', 'VIP Suite'),
('505', 'Occupied', '7000', 'VIP Suite'),
('506', 'Occupied', '7000', 'VIP Suite'),
('507', 'Occupied', '7000', 'VIP Suite'),
('508', 'Occupied', '7000', 'VIP Suite'),
('509', 'Occupied', '7000', 'VIP Suite'),
('510', 'Occupied', '7000', 'VIP Suite'),
('511', 'Occupied', '7000', 'VIP Suite'),
('512', 'Occupied', '7000', 'VIP Suite'),
('513', 'Available', '7000', 'VIP Suite'),
('514', 'Available', '7000', 'VIP Suite'),
('600', 'Occupied', '9000', 'Presidential Suite'),
('601', 'Occupied', '9000', 'Presidential Suite'),
('602', 'Occupied', '9000', 'Presidential Suite'),
('603', 'Occupied', '9000', 'Presidential Suite'),
('604', 'Available', '9000', 'Presidential Suite'),
('605', 'Available', '9000', 'Presidential Suite'),
('606', 'Available', '9000', 'Presidential Suite'),
('607', 'Available', '9000', 'Presidential Suite'),
('608', 'Available', '9000', 'Presidential Suite'),
('609', 'Available', '9000', 'Presidential Suite');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`Appointment_ID`);

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`bill_id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor_ID`);

--
-- Indexes for table `emp_info`
--
ALTER TABLE `emp_info`
  ADD PRIMARY KEY (`Employee_ID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `Appointment_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `bill_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `Doctor_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `emp_info`
--
ALTER TABLE `emp_info`
  MODIFY `Employee_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
