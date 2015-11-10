
create table Cliente (
id_cliente integer,
nombre varchar(100),
apellido varchar(100),
email varchar(100),
constraint pk_id_avion primary key (id_avion));

create table vuelo (
id_avion     integer,
id_vuelo     integer,
origen    varchar(100),
destino   varchar(100),
constraint pk_id_vuelo primary key (id_vuelo),
constraint fk_id_avion foreign key (id_avion) references avion (id_avion));
