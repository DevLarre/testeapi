# 🛠️ PROJETO TESTE API BACK-END 🛠️

Este projeto é um **Back-end** desenvolvido em **Java** utilizando o **Spring Boot**, com objetivo de consumir a API externa **RandomUser API** e salvar os dados de usuários no banco de dados **PostgreSQL**. O projeto também conta com tratamentos de exceções globais e está integrado ao banco de dados na **Render.com**.

## 🚀 FUNCIONALIDADES

- **GET USER**: Consome a API **RandomUser** para obter dados de um usuário aleatório.
- **SALVAR USUÁRIO**: Persiste os dados do usuário no banco **PostgreSQL**.
- **TRATAMENTO DE ERROS**: Implementa tratamento de exceções de recursos não encontrados e erros genéricos.
  
## 🛠️ TECNOLOGIAS UTILIZADAS

- **Java 17** ☕
- **Spring Boot** 🚀
- **PostgreSQL** 🐘
- **JSON** 🌐 (Para consumir APIs externas)
- **Maven** 🛠️ (Para gerenciamento de dependências)

## 🏗️ ESTRUTURA DO PROJETO

- **Controller**: `UserController.java` – Responsável por expor a rota para consumir a API externa e salvar o usuário no banco de dados.
- **Service**: `UserTestApiService.java` – Responsável pela lógica de negócio, como salvar os dados do usuário.
- **Repository**: `UserRepositoryTestApi.java` – Interface que extende o `JpaRepository` para realizar operações no banco de dados.
- **Model**: `TesteApiUser.java` – Representa o modelo de usuário com todos os campos retornados pela **RandomUser API**.
- **Global Exception Handler**: `GlobalExceptionHandler.java` – Gerencia globalmente as exceções que podem ocorrer durante as operações.

## 🔧 CONFIGURAÇÕES

### Banco de Dados (PostgreSQL) online.

- **HOST**: `dpg-crg8a8t6l47c73dtasjg-a.oregon-postgres.render.com`
- **PORTA**: `5432`
- **NOME DO BANCO**: `apitestconsumo`

### Arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:coloque sua chave postgress online
spring.datasource.username=apitestconsumo_user
spring.datasource.password=coloque sua chave postgress online
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
server.port=8081
```


## 🚀 COMO RODAR O PROJETO
1. Clone o repositório:
```
git clone https://github.com/seu-usuario/teste-api-backend.git
```

2. Entre na pasta do projeto:
```
cd teste-api-backend
```

3. Instale as dependências:
```
mvn clean install
```

4. Configure o banco de dados: Verifique as configurações do banco de dados no arquivo application.properties conforme mostrado acima.

5. Execute o projeto:

```
mvn spring-boot:run
``` 

6. Acesse a API:

```
GET http://localhost:8081/get-user/randomuser
```

## ⚠️ TRATAMENTO DE EXCEÇÕES
O projeto implementa tratamento de exceções com um GlobalExceptionHandler que lida com os seguintes erros:

ResourceNotFoundException: Retorna 404 Not Found caso o recurso não seja encontrado.
Exception: Retorna 500 Internal Server Error para erros genéricos.

## 🌐 DEPLOY NA RENDER.COM
O projeto está configurado para rodar no banco de dados PostgreSQL hospedado no Render.com. Certifique-se de que as variáveis de ambiente e as configurações do banco de dados estejam corretas para o deploy.

## 🛡️ LICENÇA
Este projeto está licenciado sob a MIT License.

### Conecte-se comigo

[![Linkdln](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/douglas-rodrigues-larré-a59637231/)
[![Outlook](https://img.shields.io/badge/Microsoft_Outlook-0078D4?style=for-the-badge&logo=microsoft-outlook&logoColor=white)](dev.larre@outlook.com)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/dev_larre)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/DevLarre)

Vamos codar! 🚀

## © Desenvolvido por Dev Larré, 2024
