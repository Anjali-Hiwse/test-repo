create table Student (
id int not null,
name varchar(50) ,
email varchar(100),
phone varchar(20),
course_id int);

create table Course (
id int not null,
course_name varchar(50) ,
description varchar(200),
professor  varchar(50));
