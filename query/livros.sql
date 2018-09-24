CREATE SCHEMA `biblioteca` ;

USE biblioteca;

CREATE TABLE `livros` (
  `id_livro` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `autor` varchar(100) DEFAULT NULL,
  `ano` int(4) DEFAULT NULL,
  `resenha` varchar(400) DEFAULT NULL,
  `data_cadastro` date DEFAULT NULL,
  `editora` varchar(150) DEFAULT NULL,
  `genero` varchar(150) DEFAULT NULL,
  `nota` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_livro`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("IRACEMA","JOSE DE ALENCAR",1865,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");
    
INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("SENHORA","JOSE DE ALENCAR",1875,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");

INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("LUCIOLA","JOSE DE ALENCAR",1862,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");
    
INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("O GUARANI","JOSE DE ALENCAR",1857,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");

INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("DOM CASMURRO","MACHADO DE ASSSIS",1865,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");

INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("MEMORIAS POSTUMAS DE BRAS CUBAS","MACHADO DE ASSIS",1881,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");

INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("REINAÇOES DE NARIZINHO","MONTEIRO LOBATO",1931,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");
    
INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("O ALQUIMISTA","PAULO COELHO",1988,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");

INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("CARANDIRU","DRAUZIO VARELA",1999,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");

INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) 
	VALUES ("CODIGO DA VINCI","DAN BROWN",2003,10,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra. ","2018-09-23","Saraiva","Romance");