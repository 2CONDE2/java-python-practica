Consultas básicas (SELECT)

cuando ponemos * estamos diciendo que seleccione todo mejor dicho toda la tabala

SELECT * 
FROM Empleados;

SELECT nombre, edad
FROM Empleados;

SELECT * 
FROM Empresas;

Consultas con condiciones (WHERE)

where es como poner una condicion en este caso solo mostrara los mayores de 50 

SELECT nombre, edad
FROM Empleados
WHERE edad > 50;

SELECT nombre, edad
FROM Empleados
WHERE edad < 40;

SELECT nombre, edad
FROM Empleados
WHERE codEmpresa = 1001;

Consultas con JOIN

une las dos tablas a trevez de condicioines que tu pones pero mas claro 
seria que decir que se une por la llave foranea

e y emp son alias de las tablas es para agilizar el trabaja pero no 
es obligatiorio usarlo pero es una buena practica

ON estamos diciendo que una las filas donde la condicion sea igual

SELECT 
    e.nombre,
    e.edad,
    emp.nomEmpresa
FROM Empleados e
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa;

SELECT 
    e.nombre,
    e.edad,
    emp.nomEmpresa
FROM Empleados e
JOIN Empresas emp
ON e.codEmpresa = emp.codEmpresa
WHERE e.edad > 45;

Consultas con GROUP BY

agrupa filas que tiene el mismo valor en una columna

count es una funcion de agregacion que cuenta FILESTREAM

avg calcula el promedio

SELECT codEmpresa
FROM Empleados
GROUP BY codEmpresa;

SELECT 
    codEmpresa,
    COUNT(*)
FROM Empleados
GROUP BY codEmpresa;

SELECT 
    codEmpresa,
    AVG(edad)
FROM Empleados
GROUP BY codEmpresa;

SELECT 
    codEmpresa,
    COUNT(*) AS cantidad_empleados
FROM Empleados
GROUP BY codEmpresa;
