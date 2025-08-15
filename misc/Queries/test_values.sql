INSERT INTO inventario_db.inventario_salidas(departamento, cantidad, descripcion, fecha, entregado, recibio)
VALUES 
('Ventas', 10, 'Producto A', '2025-08-14', 'si', 'Juan Perez'),
('Logística', 15, 'Producto B', '2025-08-13', 'no', 'Maria Garcia'),
('Marketing', 8, 'Producto C', '2025-08-12', 'si', 'Carlos Fernandez'),
('Compras', 5, 'Producto D', '2025-08-11', 'no', 'Ana Lopez'),
('Soporte', 12, 'Producto E', '2025-08-10', 'si', 'Luis Martinez'),
('Ventas', 20, 'Producto F', '2025-08-09', 'no', 'Pedro Sanchez'),
('Logística', 7, 'Producto G', '2025-08-08', 'si', 'Laura Torres'),
('Marketing', 25, 'Producto H', '2025-08-07', 'no', 'Juan Carlos Ramirez'),
('Compras', 18, 'Producto I', '2025-08-06', 'si', 'Eva Ruiz'),
('Soporte', 10, 'Producto J', '2025-08-05', 'no', 'Fernando Gonzalez');

INSERT INTO inventario_entradas (fecha, nombre_proveedor, descripcion_material, cantidad, nota)
VALUES
('2025-08-14', 'Proveedor A', 'Material de construcción', 100, 'Entrega programada para la próxima semana'),
('2025-08-13', 'Proveedor B', 'Pintura industrial', 50, 'Entrega urgente por alta demanda'),
('2025-08-12', 'Proveedor C', 'Cables eléctricos', 200, 'Material recibido con retraso'),
('2025-08-11', 'Proveedor D', 'Lentes de seguridad', 150, 'Pedido completo, en perfecto estado'),
('2025-08-10', 'Proveedor E', 'Herramientas manuales', 75, 'Entrega programada para mañana'),
('2025-08-09', 'Proveedor F', 'Aceite lubricante', 300, 'Material usado en mantenimiento de equipos'),
('2025-08-08', 'Proveedor G', 'Tornillos y clavos', 500, 'Entrega parcial, falta un lote'),
('2025-08-07', 'Proveedor H', 'Material de oficina', 30, 'Producto de reposición para oficina'),
('2025-08-06', 'Proveedor I', 'Placas metálicas', 120, 'Pedido entregado a tiempo'),
('2025-08-05', 'Proveedor J', 'Cemento y concreto', 250, 'Material entregado para proyecto de construcción');
