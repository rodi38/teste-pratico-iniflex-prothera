# teste-pratico-iniflex-prothera

## Requisitos técnicos

- Java 17 (Temurin) e Maven 3.9.9 — usados no projeto e definidos no `.sdkmanrc`.
- Git (opcional) — usado apenas para clonar o repositório; caso não tenha, dá pra baixar o projeto como `.zip` diretamente pelo GitHub (veja o passo 1 de [Como executar](#como-executar)).

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

## Como executar

### 1. Obter o projeto

**Com Git:**

```bash
git clone https://github.com/rodi38/teste-pratico-iniflex-prothera.git
cd teste-pratico-iniflex-prothera
```

**Sem Git (baixando o ZIP):**

1. Acesse a página do repositório: https://github.com/rodi38/teste-pratico-iniflex-prothera
2. Clique em **Code** > **Download ZIP**.
3. Extraia o arquivo baixado e abra um terminal dentro da pasta extraída.

### 2. Instalar o Java 17 e o Maven (caso não tenha)

#### Linux / macOS (via SDKMAN!)

O projeto usa [SDKMAN!](https://sdkman.io/) para gerenciar as versões do Java e do Maven.

Instalar o SDKMAN!:

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

Instalar as versões usadas no projeto (definidas no arquivo `.sdkmanrc`):

```bash
sdk env install
sdk env
```

Isso instala e ativa automaticamente o Java 17.0.13-tem e o Maven 3.9.9 apenas para este diretório.

#### Windows

O SDKMAN! não roda nativamente no Windows (apenas via WSL). Duas opções:

**Opção A - WSL (Windows Subsystem for Linux):** instale o WSL, abra um terminal Ubuntu e siga as instruções de "Linux / macOS" acima dentro dele.

**Opção B - instalação manual:**
1. Baixe e instale o [JDK 17 (Temurin)](https://adoptium.net/temurin/releases/?version=17), escolhendo o instalador `.msi` para Windows.
2. Baixe o [Maven 3.9+](https://maven.apache.org/download.cgi) (arquivo `.zip`), extraia em uma pasta (ex.: `C:\Program Files\Apache\maven`) e adicione a pasta `bin` dela na variável de ambiente `PATH`.
3. Confirme a instalação abrindo um novo terminal (PowerShell ou CMD) e rodando:
   ```powershell
   java -version
   mvn -version
   ```

### 3. Compilar e rodar

Em qualquer sistema operacional, dentro da pasta do projeto:

```bash
mvn compile exec:java
```

O programa executa todos os requisitos em sequência e imprime o resultado de cada item no terminal.
