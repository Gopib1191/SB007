show databases;

Create database sb007;

USE sb007;



CREATE TABLE Employees(
     	id int NOT NULL PRIMARY KEY,
     	age int NOT NULL,
    	firstName varchar (255),
     	lastName varchar (255)
     );
     
     
           
SELECT * FROM Employees;


INSERT INTO Employees VALUES (100, 21, 'JACK', 'EDITION');
INSERT INTO Employees VALUES (101, 22, 'RUSTY', 'COLTONS');
INSERT INTO Employees VALUES (102, 23, 'MOHAN', 'P');
INSERT INTO Employees VALUES (103, 24, 'PALANI', 'K');
INSERT INTO Employees VALUES (104, 25, 'SHRI', 'KANTA');
INSERT INTO Employees VALUES (105, 26, 'WILMAN', 'KALA');
INSERT INTO Employees VALUES (106, 69, 'anil', 'rawat');