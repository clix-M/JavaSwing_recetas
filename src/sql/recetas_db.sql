CREATE TABLE Receta (
  id_receta INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255),
  descripcion TEXT,
  tiempo_de_preparacion INT,
  instruccion_de_preparacion TEXT,
  dificultad INT,
  id_categoria INT
);

CREATE TABLE Categoria (
  id_categoria INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255)
);

CREATE TABLE Ingrediente (
  id_ingrediente INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255),
  medida VARCHAR(255)
);

CREATE TABLE Ingrediente_receta (
  id_ingrediente_receta INT PRIMARY KEY AUTO_INCREMENT,
  id_receta INT,
  id_ingrediente INT,
  cantidad INT
);

CREATE TABLE Comentarios (
  id_comentarios INT PRIMARY KEY AUTO_INCREMENT,
  id_receta INT,
  nombre_autor VARCHAR(255),
  fecha DATE
);

CREATE TABLE Usuario (
  id_usuario INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255),
  contrasena VARCHAR(255),
  correo_electronico VARCHAR(255)
);

CREATE TABLE Favorito (
  id_favorito INT PRIMARY KEY AUTO_INCREMENT,
  id_usuario INT,
  id_receta INT
);

-- relacionando las tablas -- 
ALTER TABLE Receta
ADD FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria);

ALTER TABLE Ingrediente_receta
ADD FOREIGN KEY (id_receta) REFERENCES Receta(id_receta);

ALTER TABLE Ingrediente_receta
ADD FOREIGN KEY (id_ingrediente) REFERENCES Ingrediente(id_ingrediente);

ALTER TABLE Comentarios
ADD FOREIGN KEY (id_receta) REFERENCES Receta(id_receta);

ALTER TABLE Favorito
ADD FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario);

ALTER TABLE Favorito
ADD FOREIGN KEY (id_receta) REFERENCES Receta(id_receta);