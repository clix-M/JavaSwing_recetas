CREATE TABLE `usuarios` (
  `id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `nombre` VARCHAR(255),
  `correo_electronico` VARCHAR(255),
  `contrasena` VARCHAR(255)
);

INSERT INTO `usuarios` (`id`, `nombre`, `correo_electronico`, `contrasena`)
VALUES (1, 'clinton', 'clinton@example.com', '2023elp');


CREATE TABLE `recetas` (
  `id` INT PRIMARY KEY,
  `titulo` VARCHAR(255),
  `descripcion` TEXT,
  `tiempo_preparacion` INT,
  `tiempo_coccion` INT,
  `porciones` INT,
  `dificultad` VARCHAR(255),
  `imagen` VARCHAR(255),
  `usuario_id` INT
);

CREATE TABLE `ingredientes` (
  `id` INT PRIMARY KEY,
  `nombre` VARCHAR(255),
  `cantidad` VARCHAR(255)
);

CREATE TABLE `recetas_ingredientes` (
  `id` INT PRIMARY KEY,
  `receta_id` INT,
  `ingrediente_id` INT
);

CREATE TABLE `pasos` (
  `id` INT PRIMARY KEY,
  `descripcion` TEXT,
  `orden` INT,
  `receta_id` INT
);

ALTER TABLE `recetas` ADD FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`);

ALTER TABLE `recetas_ingredientes` ADD FOREIGN KEY (`receta_id`) REFERENCES `recetas` (`id`);

ALTER TABLE `recetas_ingredientes` ADD FOREIGN KEY (`ingrediente_id`) REFERENCES `ingredientes` (`id`);

ALTER TABLE `pasos` ADD FOREIGN KEY (`receta_id`) REFERENCES `recetas` (`id`);
