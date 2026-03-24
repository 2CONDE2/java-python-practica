
-- ==========================================
-- PRACTICE DATABASE FOR SQL SERVER
-- Topics: GROUP BY, HAVING, CTE, JOIN
-- ==========================================

CREATE DATABASE PracticaSQL;
GO

USE PracticaSQL;
GO

CREATE TABLE Empresas (
    codEmpresa INT PRIMARY KEY,
    nomEmpresa VARCHAR(100)
);
GO

CREATE TABLE Empleados (
    idEmpleado INT PRIMARY KEY,
    nombre VARCHAR(100),
    edad INT,
    codEmpresa INT,
    FOREIGN KEY (codEmpresa) REFERENCES Empresas(codEmpresa)
);
GO

INSERT INTO Empresas VALUES
(1001,'TechNova'),
(1002,'DataSoft'),
(1003,'InnovaCorp'),
(1004,'GlobalSystems'),
(1005,'FutureTech');
GO

INSERT INTO Empleados VALUES
(1,'Juan',42,1001),
(2,'Maria',45,1001),
(3,'Pedro',52,1001),
(4,'Ana',39,1001),
(5,'Luis',41,1002),
(6,'Carla',55,1002),
(7,'Jose',48,1002),
(8,'Elena',33,1002),
(9,'Miguel',51,1003),
(10,'Lucia',44,1003),
(11,'Rosa',58,1003),
(12,'Diego',47,1004),
(13,'Pablo',29,1004),
(14,'Sandra',53,1004),
(15,'Mario',40,1005),
(16,'Laura',49,1005),
(17,'Sofia',60,1005);
GO

-- Example query using CTE
WITH edades_decada AS (
    SELECT
        e.codEmpresa,
        emp.nomEmpresa,
        edad / 10 AS decada
    FROM Empleados e
    JOIN Empresas emp
        ON e.codEmpresa = emp.codEmpresa
)

SELECT
    codEmpresa,
    nomEmpresa,
    decada,
    COUNT(*) AS cantidad
FROM edades_decada
WHERE decada IN (4,5)
GROUP BY codEmpresa, nomEmpresa, decada
ORDER BY codEmpresa;
