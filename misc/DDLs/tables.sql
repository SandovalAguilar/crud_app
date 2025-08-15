CREATE DATABASE inventario_db;

USE inventario_db;

-- Esquema para las operaciones de inventario
CREATE TABLE inventario_salidas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    departamento VARCHAR(100),
    cantidad INT,
    descripcion VARCHAR(255),
    fecha DATE,
    entregado ENUM('si', 'no') DEFAULT 'no',
    recibio VARCHAR(100)
);

CREATE TABLE inventario_entradas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    nombre_proveedor VARCHAR(100),
    descripcion_material VARCHAR(255),
    cantidad INT,
    nota TEXT
);

-- Esquema para el control de inventario
CREATE TABLE control_inventario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    material_oficina VARCHAR(255),
    descripcion_oficina VARCHAR(255),
    cantidad_oficina INT,
    material_intendencia VARCHAR(255),
    descripcion_intendencia VARCHAR(255),
    cantidad_intendencia INT,
    consumibles VARCHAR(255),
    descripcion_consumibles VARCHAR(255),
    cantidad_consumibles INT,
    material_mtto VARCHAR(255),
    descripcion_mtto VARCHAR(255),
    cantidad_mtto INT
);

-- Esquema para los pedidos
CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    descripcion_material_oficina VARCHAR(255),
    cantidad_material_oficina INT,
    descripcion_material_intendencia VARCHAR(255),
    cantidad_material_intendencia INT
);
