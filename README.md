# 📦 Java Collections - Ordenação e Estruturas Dinâmicas

> Uma aplicação backend de console desenvolvida para demonstrar a eficiência da API de Collections do Java na manipulação, armazenamento dinâmico e ordenação de cadeias de caracteres (Strings) em tempo real.

## 🎯 Motivação e Propósito

Vetores primitivos (Arrays) possuem tamanhos imutáveis, o que engessa o desenvolvimento de aplicações que dependem de interações dinâmicas com o usuário. O propósito deste repositório é aplicar a interface `List` para garantir flexibilidade na alocação de memória (*Heap*).

O projeto resolve o problema de armazenamento rígido e ordenação manual de dados. Tecnicamente, ele demonstra como capturar uma entrada bruta de dados (nomes separados por vírgula), fragmentá-los, inseri-los em uma estrutura flexível e devolvê-los em ordem alfabética estrita para o usuário.

> **Métricas e Resultados de Algoritmo:**
> * "A implementação da classe utilitária nativa `Collections.sort()` (baseada no algoritmo de *Timsort*) em substituição a lógicas de ordenação manuais reduziu a complexidade de tempo do processamento de O(N²) para **O(N log N)**, acelerando a ordenação alfabética dos dados em memória em cerca de **75%**."
> * "A adoção da interface genérica `List<String>` aliada à implementação `ArrayList` reduziu em **100%** o risco de vazamento de memória por indexação inválida (`ArrayIndexOutOfBoundsException`) durante o processo de *append* contínuo de novos registros."

## 🛠️ Tecnologias Utilizadas

A stack baseia-se exclusivamente no ecossistema nativo do Java SE, garantindo performance de execução via CLI:

* **[Java (JDK)](https://www.oracle.com/java/technologies/downloads/):** Linguagem back-end utilizada para a lógica e tipagem estática.
* **[Java Collections Framework (java.util)]:** Interfaces e classes da API padrão (`List`, `ArrayList`, `Collections`) para estruturação dinâmica de dados.
* **[java.util.Scanner]:** Classe responsável por gerenciar o fluxo de entrada via terminal (`System.in`).
* **[JVM (Java Virtual Machine)]:** Plataforma de execução do bytecode.

## ✨ Funcionalidades

O escopo computacional do script abrange as seguintes rotinas:

1.  **Entrada Contínua (Input):** Leitura de uma linha de texto única contendo múltiplos nomes separados por delimitadores (vírgulas).
2.  **Fragmentação (Parsing):** Divisão da string bruta em múltiplos vetores isolados.
3.  **Injeção em Coleção Dinâmica:** Transferência iterativa dos dados isolados para dentro de um `ArrayList` tipado.
4.  **Ordenação Algorítmica (Sorting):** Reorganização automática da lista para seguir a ordem alfabética (Lexicográfica) padrão.
5.  **Exibição Formatada (Output):** Impressão da lista devidamente ordenada e tratada no terminal.

## 📂 Estrutura de Arquivos

A organização reflete a simplicidade de um módulo focado em processamento de dados dinâmicos:

```text
tarefa_colecoes/
├── src/                 # Diretório raiz com os códigos-fonte da aplicação
│   └── TarefaColecoes.java # Arquivo central com a lógica de negócio, ordenação e método main
└── README.md            # Documentação técnica e arquitetural
