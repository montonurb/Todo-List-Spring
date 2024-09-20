<h1 align="center">
  TODO List
</h1>

API para gerenciamento de Todos List. Esse projeto tem como objetivo principal o treinamento de algumas ferramentas, mas principalmente o framework Spring Boot.

Esse projeto foi baseado no desafio da Simplify, para programadores Juniors.
Link: https://github.com/simplify-tec/desafio-junior-backend-simplify


## Tecnologias
 
- [Spring Boot]
- [Spring Boot MVC]
- [Spring Data JPA]
- [SpringDoc OpenAPI 3]
- [Postgresql]

## Práticas adotadas

- SOLID
- API REST
- Injeção de Dependências
- Testes
- Documentação com Swagger

## Endpoints


- Criar Tarefa (localhost:8080/todos) => GET
```
{
    "title": "Estudar"
    "description": "Estudar Spring Boot",
    "priority": 1,
    "completed": false
}
```

- Listar Tarefas (localhost:8080/todos) => POST

- Atualizar Tarefa (localhost:8080/todos) => PUT
```
{
    "title": "Estudar"
    "description": "Estudar Spring Boot Atualizado",
    "priority": 1,
    "completed": false
}
```

- Deletar Tarefa (localhost:8080/todos/1) => DELETE