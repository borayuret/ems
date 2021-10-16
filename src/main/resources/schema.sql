DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id INT NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    email varchar(100),
    CONSTRAINT employee_pk PRIMARY KEY (id)
);