CREATE DATABASE IF NOT EXISTS controle_estoque;
USE controle_estoque;

CREATE TABLE IF NOT EXISTS produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    quantidade INT DEFAULT 0,
    preco DECIMAL(10,2)
);

INSERT INTO produto (nome, categoria, quantidade, preco) VALUES
('Arroz', 'Alimento', 10, 25.90),
('Sabão em pó', 'Limpeza', 5, 12.50),
('Leite', 'Bebida', 20, 4.99);