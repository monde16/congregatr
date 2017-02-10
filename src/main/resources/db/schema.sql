create schema IF NOT EXISTS congregatrdb;
grant all on congregatrdb.* to 'maria'@'localhost';
use congregatrdb;

CREATE TABLE if not exists publishers (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(32),
    middleName VARCHAR(128),
    surname VARCHAR(32),
    address VARCHAR(128),
    dob DATE,
    baptism DATE,
    active BOOL,
    comments varchar(128)
);

CREATE TABLE if not exists publishers_legacy (
    id INT PRIMARY KEY NOT NULL,
    surname VARCHAR(32),
    names VARCHAR(128),
    address VARCHAR(128),
    dob DATE,
    baptism DATE,
    phone1 varchar(16),
    phone2 varchar(16),
    comments varchar(128)
);


-- select * from publishers_legacy;
load data local infile '~/code/java/projects/congregatr/src/main/resources/db/publishers-legacy.csv' into table publishers_legacy;
