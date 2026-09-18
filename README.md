# teste-pratico-iniflex-prothera

Teste prático de programação em Java (JDK 17).

## Enunciado

Considerando que uma indústria possui pessoas/funcionários, desenvolver um projeto Java com os requisitos abaixo.

### Dados de entrada

| Nome    | Data Nascimento | Salário  | Função       |
|---------|------------------|----------|--------------|
| Maria   | 18/10/2000       | 2009.44  | Operador     |
| João    | 12/05/1990       | 2284.38  | Operador     |
| Caio    | 02/05/1961       | 9836.14  | Coordenador  |
| Miguel  | 14/10/1988       | 19119.88 | Diretor      |
| Alice   | 05/01/1995       | 2234.68  | Recepcionista|
| Heitor  | 19/11/1999       | 1582.72  | Operador     |
| Arthur  | 31/03/1993       | 4071.84  | Contador     |
| Laura   | 08/07/1994       | 3017.45  | Gerente      |
| Heloísa | 24/05/2003       | 1606.85  | Eletricista  |
| Helena  | 02/09/1996       | 2799.93  | Gerente      |

## Requisitos

- [X] 1 - Classe `Pessoa` com os atributos: nome (String) e data nascimento (LocalDate).
- [X] 2 - Classe `Funcionario` que estenda a classe `Pessoa`, com os atributos: salário (BigDecimal) e função (String).
- [X] 3 - Classe `Principal` para executar as seguintes ações:
  - [X] 3.1 - Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
  - [X] 3.2 - Remover o funcionário "João" da lista.
  - [X] 3.3 - Imprimir todos os funcionários com todas suas informações, sendo que:
    - [X] informação de data deve ser exibida no formato dd/mm/aaaa;
    - [X] informação de valor numérico deve ser exibida no formato com separador de milhar como ponto e decimal como vírgula.
  - [X] 3.4 - Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
  - [X] 3.5 - Agrupar os funcionários por função em um MAP, sendo a chave a "função" e o valor a "lista de funcionários".
  - [X] 3.6 - Imprimir os funcionários, agrupados por função.
  - [X] 3.8 - Imprimir os funcionários que fazem aniversário no mês 10 e 12.
  - [X] 3.9 - Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
  - [X] 3.10 - Imprimir a lista de funcionários por ordem alfabética.
  - [X] 3.11 - Imprimir o total dos salários dos funcionários.
  - [X] 3.12 - Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.

## Orientações gerais

- Ferramenta livre (Eclipse, NetBeans, etc.). PS: no projeto usei o vscode.
- Ao finalizar, exportar o projeto e enviar o link do repositório.
- Itens não resolvidos devem ser comentados no código informando o motivo.

## Requisitos técnicos

No projeto utilizei o Java 17(sdkman a versão temurin).

