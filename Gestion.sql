CREATE DATABASE Gestion;

CREATE TABLE Client (
	CodeClient VARCHAR(50) PRIMARY KEY,
	Rs VARCHAR(100),
	Adresse VARCHAR(200),
	Telephone VARCHAR(15)
);

CREATE TABLE Commande (
	NumCmd VARCHAR(50) PRIMARY KEY,
	DateCmd DATE,
	TotalHT DOUBLE PRECISION,
	TotalTTC DOUBLE PRECISION,
	CodeClient VARCHAR(50),
	FOREIGN KEY (CodeClient) REFERENCES Client(CodeClient)
);

CREATE TABLE Article (
	CodeArticle VARCHAR(50) PRIMARY KEY,
	Libelle VARCHAR(100),
	Qte INT,
	PrixHT DOUBLE PRECISION
);

CREATE TABLE Commande_Article (
	NumCmd VARCHAR(50),
	CodeArticle VARCHAR(50),
	QteCommande INT,
	PRIMARY KEY (NumCmd, CodeArticle),
	FOREIGN KEY (NumCmd) REFERENCES Commande(NumCmd),
	FOREIGN KEY (CodeArticle) REFERENCES Article(CodeArticle)
);

