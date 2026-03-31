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
