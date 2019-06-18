create database jdbc;
use jdbc;

create table emp(
	id int auto_increment primary key,
    name nvarchar(40),
    age int
);