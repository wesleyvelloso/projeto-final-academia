## [Projeto Base](https://github.com/cami-la/academia-digital) Disponibilizado por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").
## [Clique aqui para acessar pelo Heroku!](https://academia-digital-wes.herokuapp.com/swagger-ui/index.html#/) 🚀

## Para acessar localmente:
1. Clone este repositório;
2. Na sua IDE, carregue as dependências com o Maven;
3. Execute a aplicação (certifique-se de que nenhum outro processo esteja rodando na porta 8080);
4. Abra no navegador: http://localhost:8080/swagger-ui/index.html#/

## Modificações 📝
- Adicionei a dependência do **swagger-ui**, para documentar e acessar as operações CRUD. Assim não é necessário utilizar o Postman, já que o swagger será carregado no navegador.

- Implementei para a entidade **Aluno**:
  - **Método get** - Retorna os dados de um aluno específico através do id.
  - **Método update** - Atualiza os dados de um aluno específico através do id.
  - **Método delete** - Deleta um aluno através do Id.

- Implementei para a entidade **AvaliacaoFisica**:
  - **Método get** - Retorna os dados de uma avaliação específica através do id.
  - **Método update** - Atualiza os dados de uma avaliação específica através do id.
  - **Método delete** - Deleta uma avaliação através do Id. Consequentemente todas suas avaliações também são deletadas.

- Implementei para a entidade **Matricula**:
  - **Método getAll** - Retorna dados de todas matrículas.

Ao implementar métodos 'delete', percebi que ao excluir uma avaliação física, o Aluno correspondente também era excluído.
Apaguei o elemento 'cascade= CascadeType.ALL' da entidade AvaliacaoFisica.  
Adicionei o elemento 'cascade= CascadeType.REMOVE' na entidade Aluno.
Então, sempre que um aluno é excluído do banco suas avaliações também são.



