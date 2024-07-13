### Este projeto fornece uma API para gerenciar usuários, contas e ações associadas a essas contas. Ele é desenvolvido usando Spring Boot.

# Estrutura do Projeto
### Controladores
AccountController: Gerencia operações relacionadas a contas.

### Serviços
AccountService: Lida com a lógica de negócios para contas.<br>
StockService: Lida com a lógica de negócios para ações.<br>
UserService: Lida com a lógica de negócios para usuários.

### Entidades
Account: Representa uma conta de usuário.<br>
AccountStock: Representa a relação entre contas e ações.<br>
BillingAddress: Representa o endereço de cobrança de uma conta.<br>
Stock: Representa uma ação.

### Endpoints:
POST /v1/accounts/{accountId}/stocks: Associa uma ação a uma conta.<br>
GET /v1/accounts/{accountId}/stocks: Lista as ações associadas a uma conta.<br>
StockController: Gerencia operações relacionadas a ações.<br>
<br>
POST /v1/stocks: Cria uma nova ação.<br>
UserController: Gerencia operações relacionadas a usuários.<br>
<br>
POST /v1/users: Cria um novo usuário.<br>
GET /v1/users/{userId}: Obtém informações de um usuário por ID.<br>
GET /v1/users: Lista todos os usuários.<br>
PUT /v1/users/{userId}: Atualiza informações de um usuário por ID.<br>
DELETE /v1/users/{userId}: Deleta um usuário por ID.<br>
POST /v1/users/{userId}/accounts: Cria uma nova conta para um usuário.<br>
GET /v1/users/{userId}/accounts: Lista todas as contas de um usuário.<br>
User: Representa um usuário do sistema.<br>

## Tecnologias Utilizadas
**Java**<br>
**Spring Boot**<br>
**Hibernate**<br>
**JPA**
# Como Executar o Projeto

### Instalar o JDK
Baixe e instale a versão recomendada do JDK a partir do site oficial da Oracle.
Verifique a instalação executando `java -version` no terminal.

### Instalar o Maven
Baixe e instale o Maven a partir do site oficial.
Verifique a instalação executando `mvn -version` no terminal.

### Configurar o Banco de Dados
Qualquer banco de dados compatível com JPA/Hibernate (PostgreSQL, MySQL)<br>
Configure as credenciais e a URL do banco de dados no arquivo `application.properties`.
### Clone o repositório:
```
git clone https://github.com/seu-usuario/lfr-investments.git
```
### Navegue até o diretório do projeto
```
cd Java-Spring-Boot
```
### Compile e execute o projeto:
```
./mvnw spring-boot:run
```
