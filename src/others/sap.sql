

CREATE TABLE adelanto (
  idAdelanto int(11) NOT NULL,
  fechaEntrnateAdelanto varchar(300) NOT NULL,
  fechaSaleinteAdelanto varchar(300) NOT NULL,
  montoAdelanto float NOT NULL,
  idPrestamoAdelanto int(11) NOT NULL
);



CREATE TABLE catalogostatus (
  idStatus int(11) NOT NULL,
  descripcionStatus varchar(250) NOT NULL
);

--
-- Volcado de datos para la tabla catalogostatus
--

INSERT INTO catalogostatus (idStatus, descripcionStatus) VALUES
(1, 'Activo'),
(2, 'Inactivo');



CREATE TABLE cliente (
  idCliente int(11) NOT NULL,
  nombreCliente varchar(250) NOT NULL,
  direccionCliente varchar(250) NOT NULL,
  idMunicipioCliente int(11) NOT NULL,
  nombreAval1Cliente varchar(250) NOT NULL,
  direccionAval1Cliente varchar(250) NOT NULL,
  idMunicipioAval1Cliente int(11) NOT NULL,
  nombreAval2Cliente varchar(250) NOT NULL,
  direccionAval2Cliente varchar(250) NOT NULL,
  idMunicipioAval2Cliente int(11) NOT NULL,
  idStatus int(11) NOT NULL
);



INSERT INTO cliente (idCliente, nombreCliente, direccionCliente, idMunicipioCliente, nombreAval1Cliente, direccionAval1Cliente, idMunicipioAval1Cliente, nombreAval2Cliente, direccionAval2Cliente, idMunicipioAval2Cliente, idStatus) VALUES
(1, 'Gabriel Mostalac', 'Fundadores', 1, 'Cesar Herndez', 'Del sol', 1, 'Cielo Isassi', 'La loma', 1, 1),
(4, 'Soldier', 'El sol', 1, 'La Rots', 'Tambien en EL Sol', 1, 'La marrana', 'NPI', 1, 1),
(8, 'Tristan', 'Cagada', 1, 'Su tutor', 'Cagada igual', 1, 'Su tio', 'Mas cagada', 1, 2),
(9, 'Betancola', 'No c carnal', 1, 'El thortas', 'CC', 1, 'El tocinon', 'Carrillo', 1, 1);



CREATE TABLE ejecutivo (
  idEjecutivo int(11) NOT NULL,
  nombreEjecutivo varchar(300) NOT NULL,
  telefonoEjecutivo varchar(300) NOT NULL,
  direccionEjecutivo varchar(300) NOT NULL,
  idMunicipioEjecutivo int(11) NOT NULL,
  plazaEjecutivo varchar(300) NOT NULL,
  semanasEjecutivo varchar(300) NOT NULL,
  montoEjecutivo float NOT NULL,
  montoEspecialEjecutivo float NOT NULL
);


INSERT INTO ejecutivo (idEjecutivo, nombreEjecutivo, telefonoEjecutivo, direccionEjecutivo, idMunicipioEjecutivo, plazaEjecutivo, semanasEjecutivo, montoEjecutivo, montoEspecialEjecutivo) VALUES
(1, 'JuanpaGamer', 'asdasd', 'asdasd', 0, 'asdasd', '12', 123124, 123);



CREATE TABLE encargado (
  idEncargado int(11) NOT NULL,
  nombreEncargado varchar(300) NOT NULL,
  telefonoEncargado varchar(300) NOT NULL,
  direccionEncargado varchar(300) NOT NULL,
  idMunicipioEncargado int(11) NOT NULL,
  idSupervisorEncargado int(11) NOT NULL
);



CREATE TABLE falla (
  idFalla int(11) NOT NULL,
  fechaFalla varchar(100) NOT NULL,
  montoFalla float NOT NULL,
  idPrestamoFalla int(11) NOT NULL
);


CREATE TABLE fondo (
  idFondo int(11) NOT NULL,
  fechaFondo varchar(100) NOT NULL,
  idEjecutivo int(11) NOT NULL
);


CREATE TABLE municipio (
  idMunicipio int(11) NOT NULL,
  nombreMunicipio varchar(250) NOT NULL
);


INSERT INTO municipio (idMunicipio, nombreMunicipio) VALUES
(1, 'Queretaro'),
(2, 'Municipio2');


CREATE TABLE prestamo (
  idPrestamo int(11) NOT NULL,
  fechaInicioPrestamo varchar(100) NOT NULL,
  fechaFinPrestamo varchar(100) NOT NULL,
  montoPrestamo float NOT NULL,
  especial varchar(11) NOT NULL,
  idClientePrestamo int(11) NOT NULL,
  idEjecutivoPrestamo int(150) DEFAULT NULL
);



INSERT INTO prestamo (idPrestamo, fechaInicioPrestamo, fechaFinPrestamo, montoPrestamo, especial, idClientePrestamo, idEjecutivoPrestamo) VALUES
(1, '10/01/2022', '15/04/2022', 10000, 'Si', 4, 1),
(2, '10/01/2022', '15/04/2022', 10000, 'Si', 1, 1),
(3, '1/01/2022', '28/02/2022', 5000, 'No', 8, 1),
(4, '1/01/2022', '1/06/2022', 20000, 'Si', 9, 1);

CREATE TABLE recuperado (
  idRecuperado int(11) NOT NULL,
  fechaRecuperado varchar(300) NOT NULL,
  montoRecuperado float NOT NULL,
  idPrestamoRecuperado int(11) NOT NULL
);



CREATE TABLE supervisor (
  idSupervisor int(11) NOT NULL,
  nombreSupervisor varchar(300) NOT NULL,
  telefonoSupervisor varchar(300) NOT NULL,
  direccionSupervisor varchar(300) NOT NULL,
  idMunicipioSupervisor int(11) NOT NULL,
  idEjecutivoSupervisor int(11) NOT NULL
);



CREATE TABLE trece (
  idTrece int(11) NOT NULL,
  fechaTrece varchar(300) NOT NULL,
  montoTrece float NOT NULL,
  idPrestamoTrece int(11) NOT NULL
);


ALTER TABLE adelanto
  ADD PRIMARY KEY (idAdelanto);


ALTER TABLE catalogostatus
  ADD PRIMARY KEY (idStatus);


ALTER TABLE cliente
  ADD PRIMARY KEY (idCliente);


ALTER TABLE ejecutivo
  ADD PRIMARY KEY (idEjecutivo);


ALTER TABLE encargado
  ADD PRIMARY KEY (idEncargado);


ALTER TABLE falla
  ADD PRIMARY KEY (idFalla);


ALTER TABLE fondo
  ADD PRIMARY KEY (idFondo);


ALTER TABLE municipio
  ADD PRIMARY KEY (idMunicipio);


ALTER TABLE prestamo
  ADD PRIMARY KEY (idPrestamo);


ALTER TABLE recuperado
  ADD PRIMARY KEY (idRecuperado);


ALTER TABLE supervisor
  ADD PRIMARY KEY (idSupervisor);


ALTER TABLE trece
  ADD PRIMARY KEY (idTrece);


ALTER TABLE adelanto
  MODIFY idAdelanto int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE catalogostatus
  MODIFY idStatus int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE cliente
  MODIFY idCliente int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;


ALTER TABLE ejecutivo
  MODIFY idEjecutivo int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;


ALTER TABLE encargado
  MODIFY idEncargado int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE falla
  MODIFY idFalla int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE fondo
  MODIFY idFondo int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE municipio
  MODIFY idMunicipio int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;


ALTER TABLE prestamo
  MODIFY idPrestamo int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;


ALTER TABLE recuperado
  MODIFY idRecuperado int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE supervisor
  MODIFY idSupervisor int(11) NOT NULL AUTO_INCREMENT;


ALTER TABLE trece
  MODIFY idTrece int(11) NOT NULL AUTO_INCREMENT;
COMMIT;
