Nivel 1 — SELECT básico

1️⃣ Mostrar todos los empleados.

SELECT *
FROM Empleados

2️⃣ Mostrar solo nombre y edad de los empleados.

SELECT Nombre, Edad 
FROM Empleados

3️⃣ Mostrar todas las empresas.

SELECT *
FROM Empresas

4️⃣ Mostrar nombre y edad de los empleados mayores de 50 años.

SELECT Nombre, Edad 
FROM Empleados
WHERE Edad > 50

5️⃣ Mostrar empleados menores de 40 años.

SELECT *
FROM Empleados
WHERE Edad < 40

Nivel 2 — WHERE

6️⃣ Mostrar los empleados que trabajan en la empresa 1001.

SELECT *
FROM Empleados
WHERE codEmpresa = 1001

7️⃣ Mostrar los empleados que tienen entre 40 y 50 años.

SELECT *
FROM Empleados
WHERE Edad > 40 AND Edad < 50

8️⃣ Mostrar los empleados mayores de 45 años.

SELECT * 
FROM Empleados
WHERE Edad > 45

9️⃣ Mostrar nombre y edad de los empleados de la empresa 1002.

SELECT Nombre, Edad 
FROM Empleados
WHERE codEmpresa = 1002

10️⃣ Mostrar los empleados cuyo nombre sea "Maria".

SELECT *
FROM Empleados
WHERE Nombre = 'Maria'

Nivel 3 — JOIN

11️⃣ Mostrar nombre del empleado y nombre de la empresa donde trabaja.

SELECT 
       e.nombre,
       emp.nomEmpresa
FROM Empleados e 
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa

12️⃣ Mostrar nombre, edad y empresa de cada empleado.

SELECT  
      e.Nombre,
      e.Edad,
      emp.nomEmpresa
FROM Empleados e
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa

13️⃣ Mostrar los empleados mayores de 50 años junto con su empresa.

SELECT  
      e.Nombre,
      e.Edad,
      emp.nomEmpresa
FROM Empleados e
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa
WHERE e.Edad > 50

14️⃣ Mostrar empleados que trabajan en TechNova.
SELECT  
      e.Nombre,
      e.Edad,
      emp.nomEmpresa
FROM Empleados e
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa
WHERE emp.nomEmpresa = 'TechNova'


15️⃣ Mostrar nombre del empleado y su empresa ordenados por empresa

SELECT  
      e.Nombre,
      e.Edad,
      emp.nomEmpresa
FROM Empleados e
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa
ORDER BY emp.nomEmpresa;

