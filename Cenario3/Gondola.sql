create database FerrisWheel;

create table adult(
id INT PRIMARY KEY NOT NULL auto_increment,
name VARCHAR(60),
age INT
);

create table child(
id INT PRIMARY KEY NOT NULL auto_increment,
name VARCHAR(60),
age INT,
id_responsible INT,
FOREIGN KEY (id_responsible) REFERENCES adult(id)
);

create table gondola(
seat INT PRIMARY KEY,
id_adult INT,
id_childx INT,
id_childy INT,
adult_name VARCHAR(60),
childx_name VARCHAR(60),
childy_name VARCHAR(60),
FOREIGN KEY (id_adult) REFERENCES adult(id),
FOREIGN KEY (id_childx) REFERENCES child(id),
FOREIGN KEY (id_childy) REFERENCES child(id)
);

INSERT INTO adult (name, age) VALUES ('Paul', 54);

INSERT INTO child (name, age, id_responsible) VALUES 
('João', 5, 1),
('Maria', 12, 1);

INSERT INTO child (name, age) VALUES
('Pedro', 13),
('Henrique', 10);

INSERT INTO gondola(seat, id_adult, id_childx, id_childy) VALUES 
(2, 1, 2, 3),
(3, 1, NULL, 2),
(13, NULL, NULL, 3),
(16, NULL, NULL, 4);

UPDATE gondola AS g
JOIN adult AS a ON g.id_adult = a.id
SET g.adult_name = a.name;

UPDATE gondola AS g
LEFT JOIN child AS cx ON g.id_childx = cx.id
LEFT JOIN child AS cy ON g.id_childy = cy.id
SET g.childx_name = cx.name,
    g.childy_name = cy.name;

