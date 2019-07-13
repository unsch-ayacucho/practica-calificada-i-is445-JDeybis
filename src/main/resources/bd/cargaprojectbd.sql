create database cargaprojectbd;

use cargaprojectbd;

create table docente (
	id_docente int primary key,
    nombre varchar(50) not null,
    direccion varchar(50) null    
);

create table curso (
	id_curso int primary key,
    nombre varchar(50) not null,
    h_semanales int not null    
);

create table carga_academica (
	id_carga_academica int primary key,
    id_docente int not null,
    id_curso int not null,
    semestre varchar(50) null
);

alter table carga_academica
add constraint fk_cargaAcademica_docente
foreign key (id_docente) references docente(id_docente);

alter table carga_academica
add constraint fk_cargaAcademica_curso
foreign key (id_curso) references curso(id_curso);

INSERT INTO `cargaprojectbd`.`docente` (`id_docente`, `nombre`, `direccion`) VALUES ('1', 'Carlos Vila', 'Bellido');
INSERT INTO `cargaprojectbd`.`docente` (`id_docente`, `nombre`, `direccion`) VALUES ('2', 'Fredy Barrientos', 'Nazarenas');
INSERT INTO `cargaprojectbd`.`docente` (`id_docente`, `nombre`, `direccion`) VALUES ('3', 'Christian Lezama', 'Enace');
INSERT INTO `cargaprojectbd`.`docente` (`id_docente`, `nombre`, `direccion`) VALUES ('4', 'Manuel Lagos', 'San juan');
INSERT INTO `cargaprojectbd`.`docente` (`id_docente`, `nombre`, `direccion`) VALUES ('5', 'Mercedes Ccesa', 'Mecanicos');
INSERT INTO `cargaprojectbd`.`docente` (`id_docente`, `nombre`, `direccion`) VALUES ('6', 'Efrain Porras', 'Bellido');

INSERT INTO `cargaprojectbd`.`curso` (`id_curso`, `nombre`, `h_semanales`) VALUES ('1', 'Sistemas Expertos', '3');
INSERT INTO `cargaprojectbd`.`curso` (`id_curso`, `nombre`, `h_semanales`) VALUES ('2', 'Automatizacion', '4');
INSERT INTO `cargaprojectbd`.`curso` (`id_curso`, `nombre`, `h_semanales`) VALUES ('3', 'Algoritmos', '5');
INSERT INTO `cargaprojectbd`.`curso` (`id_curso`, `nombre`, `h_semanales`) VALUES ('4', 'Sistemas de Informacion 2', '4');
INSERT INTO `cargaprojectbd`.`curso` (`id_curso`, `nombre`, `h_semanales`) VALUES ('5', 'Seguridad Informatica', '2');
INSERT INTO `cargaprojectbd`.`curso` (`id_curso`, `nombre`, `h_semanales`) VALUES ('6', 'Estructura de Datos', '4');

INSERT INTO `cargaprojectbd`.`carga_academica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre`) VALUES ('1', '1', '1', '2019');
INSERT INTO `cargaprojectbd`.`carga_academica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre`) VALUES ('2', '1', '2', '2019');
INSERT INTO `cargaprojectbd`.`carga_academica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre`) VALUES ('3', '2', '3', '2019');
INSERT INTO `cargaprojectbd`.`carga_academica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre`) VALUES ('4', '2', '4', '2019');
INSERT INTO `cargaprojectbd`.`carga_academica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre`) VALUES ('5', '3', '5', '2019');
INSERT INTO `cargaprojectbd`.`carga_academica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre`) VALUES ('6', '3', '6', '2019');




