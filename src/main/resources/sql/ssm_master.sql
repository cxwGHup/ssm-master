/* 创建数据库ssm_master */
drop database if EXISTS ssm_master;
create database ssm_master CHARACTER SET utf8 COLLATE utf8_general_ci;

/* 创建表 */
use ssm_master;

create table tbl_dept (
  dept_id int(11) primary key AUTO_INCREMENT not null,
  dept_name varchar(255) not null
);


create table tbl_emp(
  emp_id int(11) primary key AUTO_INCREMENT not null,
  emp_name varchar(255) not null,
  gender char(1),
  email varchar(255),
  d_id int(11),
  foreign key(d_id) references tbl_dept(dept_id)
);


