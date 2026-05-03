# Spring Web Fundamentals

Este projeto é uma aplicação de demonstração e estudo focada na construção de APIs RESTful utilizando o ecossistema Spring Boot. Ele serve como base para entender como o Spring gerencia requisições HTTP, injeção de dependências e a arquitetura de camadas.

## 🏗️ Arquitetura e Organização das Classes

O projeto segue o padrão de camadas recomendado para aplicações Spring, garantindo a separação de responsabilidades:

### 1. Camada de Controladores (Controllers)
Localizada no pacote `com.projeto.controllers` (ou similar).
- **Responsabilidade:** Gerenciar as rotas HTTP e receber as requisições dos usuários.
- **Classes Principais:**
    - `UserController`: Gerencia as operações de CRUD para usuários.
    - `ProductController`: (Se aplicável) Gerencia o catálogo de produtos.
- **Anotações Chave:** `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`.

### 2. Camada de Entidades (Entities / Domain)
Localizada no pacote `com.projeto.entities`.
- **Responsabilidade:** Representar o modelo de dados da aplicação.
- **Classes Principais:**
    - `User`: Classe POJO que define os atributos do usuário (ID, nome, email).
    - `Product`: Define os atributos do produto.
- **Anotações Chave:** `@Entity`, `@Id`, `@GeneratedValue`.

### 3. Camada de Serviços (Services)
Localizada no pacote `com.projeto.services`.
- **Responsabilidade:** Conter a lógica de negócio da aplicação. É a ponte entre o Controller e o Repositório.
- **Classes Principais:**
    - `UserService`: Contém métodos como `findAll()`, `findById()`, e validações de negócio.
- **Anotações Chave:** `@Service`.

### 4. Camada de Acesso a Dados (Repositories)
Localizada no pacote `com.projeto.repositories`.
- **Responsabilidade:** Interface responsável pela comunicação com a fonte de dados.
- **Classes Principais:**
    - `UserRepository`: Interface que estende `JpaRepository`.
- **Anotações Chave:** `@Repository`.

### 5. Configuração e Exceções
- **ResourceExceptionHandler:** Captura erros na camada de recursos e retorna mensagens amigáveis em JSON.
- **TestConfig:** Classe de configuração para perfil de teste (Database seeding).

## 🛠️ Tecnologias
- **Java 17+**
- **Spring Boot 3**
- **Maven** (Gerenciador de dependências)
- **H2 Database** (Banco de dados em memória para testes)
