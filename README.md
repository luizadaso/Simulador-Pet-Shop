# 🐾 Simulador de Tarefas de Pet Shop

## Descrição

Este projeto consiste em um simulador de máquina de banho para pet shop desenvolvido em Java. O sistema permite gerenciar o processo de banho dos pets por meio de um menu interativo no terminal, possibilitando o controle de recursos como água e shampoo, além do gerenciamento dos animais na máquina.

O projeto foi criado com fins educacionais para praticar conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando Java.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- Dar banho em um pet;
- Abastecer o reservatório de água;
- Abastecer o reservatório de shampoo;
- Consultar o nível de água disponível;
- Consultar o nível de shampoo disponível;
- Verificar se existe um pet na máquina;
- Inserir um pet na máquina;
- Remover um pet da máquina;
- Realizar a limpeza da máquina;
- Encerrar o sistema.

## Menu da Aplicação

```text
Escolha a opção desejada:

1 - Dar banho no pet
2 - Abastecer com água
3 - Abastecer com shampoo
4 - Verificar nivel de água
5 - Verificar nivel de shampoo
6 - Verificar se tem pet no banho
7 - Colocar pet na maquina
8 - Retirar pet da máquina
9 - Limpar máquina
0 - Sair
```

## Regras de Negócio

### Banho do Pet

Para realizar um banho, a máquina deve possuir:

- Pelo menos 10 litros de água;
- Pelo menos 2 litros de shampoo;
- Um pet inserido na máquina.

Caso algum dos recursos esteja insuficiente, o sistema exibirá uma mensagem informando a situação.

### Inserção de Pet

Para inserir um pet na máquina:

- O nome deve ser informado pelo usuário;
- Não são aceitos nomes vazios ou em branco.

### Controle de Recursos

O sistema permite monitorar constantemente os níveis de:

- Água;
- Shampoo.

## Estrutura do Projeto

```text
src/
│
├── Main.java
├── BathMachine.java
└── Pet.java
```

### Main.java

Classe responsável pela interação com o usuário através do terminal, exibindo o menu e executando as ações escolhidas.

### BathMachine.java

Classe responsável pelo gerenciamento da máquina de banho, incluindo:

- Controle dos níveis de água;
- Controle dos níveis de shampoo;
- Gerenciamento do pet na máquina;
- Execução do banho;
- Limpeza da máquina.

### Pet.java

Classe que representa o animal de estimação contendo suas informações básicas, como o nome.

## Exemplo de Uso

```text
Informe o nome do pet:
Thor

Água adicionada ao recipiente.
Shampoo adicionado ao recipiente.

Banho realizado com sucesso.
```

## Tecnologias Utilizadas

- Java
- Scanner (java.util.Scanner)
- Programação Orientada a Objetos (POO)

## ▶️ Como Executar

### Compilar o projeto

```bash
javac *.java
```

### Executar a aplicação

```bash
java*Main*```

## Objetivo do Projeto
Este projeto tem como objetivo demonstrar a aplicação de conceitos básicos e intermediários de Java, incluindo:

- Encapsulamento;
- Classes e Objetos;
- Métodos;
- Estruturas de Repetição;
- Estruturas Condicionais;
- Manipulação de entrada de dados pelo terminal.

## Autora

Para mais informações, sinta-se à vontade para entrar em contato:

<div>
  <img src="https://github.com/user-attachments/assets/57cac2a3-49b1-4a0a-aef3-e968523971eb" width="15%" alt="autora" />
</div>

- [Github](https://github.com/luizadaso)
- [Linkedin](https://www.linkedin.com/in/luizadaso)
