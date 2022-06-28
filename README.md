## Projeto de Aplicação de Conhecimentos - SOLID e Clean Code

Caso de Uso desenvolvido para materializar a aplicação do aprendizado obtido por meio dos princípios
SOLID e das técnicas e práticas recomendadas por Robert C. Martin, chamadas de Clean Code.

## 🔨 Funcionalidades do projeto

Criar um projeto que simule uma empresa ACME. Essa empresa deve ter a entidade Funcionário. Cada funcionário deve ter seus dados básicos:

* Nome
* Telefones (Cada funcionário deve ter de 0 a N telefones)
* Endereço
* Salário
* Setor
* Cargo

Neste projeto, vamos adicionar uma entidade chamada funcionário terceirizado. As propriedades desse funcionário são as seguintes:

* Nome
* Telefones (Cada funcionário deve ter de 0 a N telefones)
* Endereço
* Salário
* Setor
* Cargo
* Empresa Contratada
* Tempo Previsto de Permanência
O domínio dos setores é o seguinte:

DESENVOLVIMENTO, DEVOPS, BANCO DE DADOS.

O domínio dos cargos é o seguinte:

ESTAGIÁRIO, JÚNIOR, PLENO, SÊNIOR.

Deve ser implementado um método que será usado pelo RH para dar reajuste para os funcionários da empresa ACME. 
As regras de reajuste utilizadas na empresa não se aplicam a empresas terceirizadas e seu código deve prever isso. 
O aluno deve mostrar onde foi possível aplicar os conceitos de Solid.

Obs: Esse projeto deve ser o mais simples possível, não precisando ser implementadas interfaces e banco de dados.

## ✔️ Técnicas e tecnologias utilizadas

- `Spring Boot`: framework Java para aplicações WEB.

## 🛠️ Abrir e rodar o projeto

Para executar a aplicação, basta executar em seu terminal o seguinte comando:
`./gradlew bootRun`

**Apresente as instruções necessárias para abrir e executar o projeto**
> Instale o Java em sua máquina, de preferência uma versão LTS. Este projeto usa Java 17 LTS.
