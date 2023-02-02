# Exercício 2 -- REST


<br>
<br>


# Informações


* A porta do servidor é :8080

* A Database utilizada tem o nome pessoa_db

## Pessoa

* O modelo pessoa possui essas rotas:

- **GET** http://localhost:8080/pessoa/findAll -> Retorna uma lista com todos as pessoas cadastrados
- **GET** http://localhost:8080/pessoa/findById/{id} -> Retorna a pessoa pelo Id // {id} -> inserir o id da pessoa desejada
- **POST** http://localhost:8080/pessoa/save -> Adiciona uma pessoa ao banco, é necessário passar o Body seguindo padrão:
```json
{
    "nome": "Nome da pessoa",
    "cpf": "CPF da pessoa",
    "rg": "RG da pessoa",
    "dataNascimento": "Data de nascimento da pessoa",
    "estadoCivil": "Estado civil da pessoa",
    "telefone": "(xx) xxxxx-xxxx",
    "email": "exemplo@email.com"
}

```

- **PUT** http://localhost:8080/pessoa/update -> Atualiza uma pessoa ao banco, é necessário passar o Body seguindo padrão:
```json
{
    "id": 0,
    "nome": "Nome da pessoa",
    "cpf": "CPF da pessoa",
    "rg": "RG da pessoa",
    "dataNascimento": "Data de nascimento da pessoa",
    "estadoCivil": "Estado civil da pessoa",
    "telefone": "(xx) xxxxx-xxxx",
    "email": "exemplo@email.com"
}
```

<br/>

- **DELETE** para http://localhost:8080/pessoa/delete/id -> Remove uma pessoa do banco // {id} -> inserir o id da pessoa desejada


<br>
