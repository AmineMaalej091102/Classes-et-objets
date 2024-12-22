create table Client (
	CodeClient varchar(20),
	Rs varchar(20),
	Adresse varchar(20),
	telephone varchar(20)
);
create table Commande (
	NumCmd varchar(20),
	DateCmd date,
	TotalHT integer,
	TotalTTC integer
);
create table Article (
	CodeArticle varchar(20),
	Libelle varchar(20),
	Qte integer,
	PrixHT integer
);
