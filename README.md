# Persistência de Dados em um RPG

## 1. Descrição do projeto

Esta atividade demonstra o uso de persistência de dados em Java por meio do SQLite e da biblioteca ORMLite. A aplicação utiliza um exemplo de RPG para cadastrar e consultar personagens, armazenando suas informações em um banco de dados local.

A atividade foi desenvolvido no BlueJ e utiliza o padrão Repository para separar as operações de acesso aos dados das classes que representam os personagens.

## 2. Tecnologias utilizadas

- Java
- BlueJ
- SQLite
- ORMLite
- JDBC
- SLF4J

## 3. Estrutura do projeto

- `Database.java`: gerencia a conexão com o banco de dados SQLite.
- `Personagem.java`: representa um personagem do RPG, com identificador, nome, nível e vida.
- `PersonagemRepository.java`: implementa operações de persistência, como salvar, listar, buscar por ID e remover personagens.
- `Main.java`: executa a aplicação e demonstra a consulta dos personagens armazenados.
- `rpg.db`: arquivo do banco de dados local, criado durante a execução.

## 4. Bibliotecas utilizadas

- `sqlite-jdbc`: permite a conexão entre Java e SQLite.
- `ormlite-core`: fornece os recursos principais do ORMLite.
- `ormlite-jdbc`: integra o ORMLite ao JDBC.
- `slf4j-api`: fornece a API de registro de mensagens.
- `slf4j-simple`: fornece uma implementação simples de registro de mensagens.

## 5. Como executar

1. Abra o projeto no BlueJ.
2. Certifique-se de que as bibliotecas necessárias estejam configuradas.
3. Compile as classes do projeto.
4. Execute o método `main` da classe `Main`.
5. Consulte o terminal para visualizar os personagens armazenados no banco de dados.

O banco de dados é armazenado localmente no arquivo `rpg.db`. Os registros permanecem disponíveis entre execuções, desde que esse arquivo seja mantido.

## 6. Funcionalidades implementadas

- Abertura e fechamento da conexão com o banco de dados.
- Criação automática da tabela de personagens, caso ela não exista.
- Cadastro e atualização de personagens.
- Listagem de personagens.
- Busca de personagens por identificador.
- Remoção de personagens por identificador.

## 7. Testes realizados

Foram realizados testes de cadastro, listagem, busca por identificador e remoção de personagens. Também foi verificada a permanência dos registros após encerrar e executar novamente o programa.

## 8. Evidências

### Estrutura do projeto

![Estrutura do projeto no BlueJ](prints/estrutura.png)

### Execução da aplicação

![Personagens listados no banco de dados](prints/execucao.png)




