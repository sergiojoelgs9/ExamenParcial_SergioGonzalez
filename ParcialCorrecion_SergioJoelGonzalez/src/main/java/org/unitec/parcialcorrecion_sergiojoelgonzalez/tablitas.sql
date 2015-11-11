create table cliente(
id_cliente integer, 
nombre varchar(120), 
apellido_paterno varchar(120),
email varchar(120),
constraint pk_id_cliente primary key (id_cliente));

create table destino(
id_destino integer,
id_cliente integer,
ciudad varchar(120),
hotel varchar(120),
num_personas int,
constraint pk_id_destino primary key (id_destino),
constraint fk_id_cliente foreign key (id_cliente) references cliente(id_cliente));

create table tarjeta(
id_tarjeta integer,
id_cliente integer,
nombre_tarjeta varchar (120),
saldo float,
numero_tarjeta integer,
constraint pk_id_tarjeta primary key (id_tarjeta),
constraint fk_id_cliente foreign key (id_cliente) references cliente(id_cliente));

select*from cliente;