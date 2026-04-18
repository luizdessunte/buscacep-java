# Busca CEP (Java)

Projeto simples em Java para consultar um CEP na API ViaCEP e salvar o resultado em um arquivo JSON.

## Funcionalidades

- Lê o CEP digitado no terminal.
- Consulta os dados do endereço na API `https://viacep.com.br`.
- Mostra o endereço no console.
- Gera um arquivo JSON com o nome do CEP (ex.: `01001-000.json`).

## Estrutura

- `src/Main.java`: fluxo principal (entrada, consulta e gravação em arquivo).
- `src/ConsultaCEP.java`: chamada HTTP para a API ViaCEP e conversão de JSON para objeto Java.
- `src/Endereço.java`: record com os campos do endereço.
- `src/GeradorDeArquivo.java`: escrita do retorno em arquivo JSON.

## Requisitos

- Java 11+ (ideal: Java 17).
- Biblioteca Gson no classpath.

## Como executar no IntelliJ

1. Abra o projeto `BuscaCep`.
2. Verifique se o SDK do Java está configurado.
3. Confirme se a biblioteca Gson está adicionada nas dependências do módulo.
4. Execute a classe `Main`.

## Como executar via terminal (PowerShell)

> Ajuste o caminho do `gson-2.13.2.jar` conforme sua máquina.

```powershell
cd "C:\Users\Henrique Dessunte\OneDrive\Desktop\CARREIRA-JAVA\Java-POO\desafios\desafio 12 - buscacep\BuscaCep"
$gsonJar = "C:\caminho\para\gson-2.13.2.jar"
javac -cp "$gsonJar" -d out src\*.java
"01001-000" | java -cp "out;$gsonJar" Main
```

## Exemplo de uso

Entrada:

```text
Digite o CEP:
01001-000
```

Saida esperada (resumida):

```text
Endereço[cep=01001-000, logradouro=Praca da Se, ...]
```

Arquivo gerado:

- `01001-000.json`

## Observacoes

- A aplicacao depende de conexao com a internet para consultar o ViaCEP.
- Em caso de erro na consulta, o programa mostra a mensagem e finaliza.

