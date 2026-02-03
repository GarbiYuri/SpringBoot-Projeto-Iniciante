 API - Spring Boot & JWT 🛡️

Este projeto é uma API REST para um sistema, desenvolvida para estudos de segurança com Spring Security 6 e JSON Web Token (JWT).
🚀 Evolução e Aprendizado

Diferente das versões anteriores do Spring Security demonstradas em tutoriais de 2024/2025, este projeto implementa o AuthenticationManager de forma explícita.
💡 Ajuste de Configuração (Diferencial)

Durante o desenvolvimento, identifiquei que o DaoAuthenticationProvider agora exige explicitamente o UserDetailsService como parâmetro para funcionar corretamente, evitando erros de injeção de dependência:
Java


🛠️ Tecnologias Utilizadas

    Java 25

    Spring Boot 4.0.2

    Spring Security 6 (Autenticação Stateless com JWT)

    PostgreSQL (Banco de dados relacional)

    JJWT (Java JWT) (Versão 0.11.5)

🔑 Funcionalidades

    [x] Registro de Usuários: Cadastro seguro com senha criptografada (BCrypt).

    [x] Login: Geração de token JWS assinado para acesso às rotas protegidas.

    [x] Segurança por Token: Implementação de OncePerRequestFilter para validar o cabeçalho Authorization: Bearer <token>.

📦 Como rodar o projeto

    Clone o repositório.

    Configure o seu banco de dados PostgreSQL no arquivo application.properties.

    Execute o comando no terminal:
    Bash

    ./mvnw spring-boot:run

    Utilize o Postman ou Insomnia para realizar o login e acessar /api/produtos/1.
