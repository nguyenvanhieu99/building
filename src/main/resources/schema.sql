drop database if exists building;
create database building;

use building;

create table company(
	id					int not null auto_increment,
    name				varchar(255) not null,
    tax_number			varchar(255) not null,
    budget				double not null,
    field				varchar(255) not null,
    employee_quantity	int not null,
    address				varchar(255) not null,
    phone				varchar(255) not null,
    area				double not null,
    primary key(id)
);

CREATE TABLE company_employee(
	id					int not null auto_increment,
    id_card				varchar(255) not null,
    name				varchar(255) not null,
    date_of_birth		date not null,
    phone				varchar(255) not null,
	company_id			int not null,
    primary key(id)
);

CREATE TABLE service(
	id					int not null auto_increment,
    name				varchar(255) not null,
    type				varchar(255) not null,
    price				double not null,
    primary key(id)
);

CREATE TABLE building_employee(
	id					int not null auto_increment,
    name				varchar(255) not null,
    date_of_birth		date not null,
    address				varchar(255) not null,
    phone				varchar(255) not null,
    ranking				varchar(255) not null,
    position			varchar(255) not null,
	service_id			int not null,
    primary key(id)
);

