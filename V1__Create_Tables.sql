CREATE TABLE pessoa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL
);

CREATE TABLE lancamento_financeiro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    valor DECIMAL(15, 2) NOT NULL,
    tipo VARCHAR(10) NOT NULL,
    data_lancamento DATE NOT NULL,
    pessoa_id BIGINT NOT NULL,
    CONSTRAINT fk_pessoa FOREIGN KEY (pessoa_id) REFERENCES pessoa (id)
);
