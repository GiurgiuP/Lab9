
DROP TABLE IF EXISTS masini;

CREATE TABLE masini
(
numar_inmatriculare VARCHAR(15) NOT NULL PRIMARY KEY,
marca VARCHAR(50) NOT NULL,
an_fabricatie INT NOT NULL,
culoare VARCHAR(30) NOT NULL,
kilometri INT NOT NULL
);

INSERT INTO masini (numar_inmatriculare, marca, an_fabricatie, culoare, kilometri) VALUES
('B123XYZ', 'Dacia', 2020, 'Alb', 50000),
('B456XYZ', 'Renault', 2019, 'Negru', 70000),
('B789XYZ', 'Toyota', 2021, 'Rosu', 30000),
('B321XYZ', 'Ford', 2018, 'Albastru', 120000),
('B654XYZ', 'Volkswagen', 2017, 'Verde', 90000);