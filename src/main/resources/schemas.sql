CREATE TABLE cliente (
clienteid int NOT NULL AUTO_INCREMENT,
dni int NOT NULL,
nombre varchar(255) NOT NULL,
apellido varchar(255),
PRIMARY KEY (clienteid)
);

CREATE TABLE producto (
productoid int NOT NULL AUTO_INCREMENT,
codigo int NOT NULL,
descripcion varchar NOT NULL,
cantidad int,
precio FLOAT,
PRIMARY KEY (productoid)
);

CREATE TABLE comprobante (
comprobanteid int NOT NULL AUTO_INCREMENT,
fecha datetime,
cantidad int,
total FLOAT,
clienteid int,
PRIMARY KEY,
CONSTRAINT FK_cliente FOREIGN KEY (clienteid)
REFERENCES cliente(clienteid)
);