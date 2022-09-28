# 🚀 A Simple Kafka Producer 🔗

Este projeto trata-se de uma POC de um jovem desocupado/entediado em um sábado à tarde, ele consiste basicamente em uma
API com um endpoint e um simples e inocente Kafka Producer.

As tecnologias usadas para isso foram Java, Spring Boot, Kafka e Swagger.

[![GitHub stars](https://img.shields.io/github/stars/matheuscarv69/a-simple-kafka-producer?color=7159)](https://github.com/matheuscarv69/votes-challenge/stargazers)
![Maven Central with version prefix filter](https://img.shields.io/maven-central/v/org.apache.maven/apache-maven/3.8.5?color=7159)

## 🤔 O que é este projeto?

Ele nada mais é que um Kafka Producer, implementado da forma mais simples possível para se ter um Producer operante
quando for necessário.

Logo, podemos dizer que ele trata-se de um template para os futuros Kafka Producers que este humilde dev que os escreve,
possa vir a desenvolver.

### 🧐 Mas o que é um Kafka Producer?

Apache Kafka é uma plataforma de streaming baseada em sistema distribuído de publish/subscribe, onde há um processo
chamado producer, que envia mensagens para um tópico.

## 🚀 Executando a aplicação 👾

### 📍 Local

Se você quiser fazer alguma modificação no código precisará ter instalado em sua máquina as seguintes ferramentas:

- [Java JDK 11+](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
- [Maven 3.8.5](https://maven.apache.org/download.cgi)

### 🐳 Docker

Este projeto conta com um **docker-compose**, contento os serviços de zookepper e kafka, inclusive a própria imagem da
aplicação já está configurada para ser
executada no docker.

Caso queria executar somente os serviços do Apache Kafka, por favor comente o serviço da aplicação no docker-compose.

Os requisitos para isso são:

- [Docker](https://www.docker.com/products/docker-desktop) - Baixe de acordo com o seu SO
- [Docker-compose](https://docs.docker.com/compose/install/) - Se estiver utilizando Windows, o Docker desktop já possui
  o docker-compose instalado

A imagem da aplicação também está disponível no Docker Hub:

- [matheuscarv69/a-simple-kafka-producer](https://hub.docker.com/r/matheuscarv69/a-simple-kafka-producer)

Caso queria executa-lá através dessa imagem, abaixo tem alguns comandos que podem lhe ajudar:

## ⬇ 1. Pull

```shell
docker pull matheuscarv69/a-simple-kafka-producer
```

## 🏃‍♂️ 2. Running

O comando abaixo executa a imagem baixada em um container, essa aplicação possui algumas env vars, atenção para as que
possuem o sufixo **HOST**, neste você deve colocar o ipv4 da sua máquina.

```shell
docker run -d -p 8081:8081 -e SERVER_PORT=8081 -e KAFKA_HOST="localhost:9092" -e KAFKA_GROUP_ID="a-simple-group-id" -e KAFKA_TOPIC_NAME="a-simple-topic" matheuscarv69/a-simple-kafka-producer
```

## 🎲 Executando a API com o docker-compose

Com esse repositório já clonado em sua máquina e com todos os pré-requisitos atendidos.

1. Você deve ir até a raiz do projeto onde o arquivo **docker-compose.yml** está.
2. Deve abrir um terminal na raiz do projeto.
3. Agora certifique-se que o seu Docker já está em execução.
4. Execute o seguinte comando no terminal:

```bash
docker-compose up -d
```

5. Com isso sua aplicação já está em execução por padrão na porta local 8081

## 🔧 Variáveis de Ambiente da Aplicação

| ENV_VARS                      | Descrição                                                        |
| ----------------------------- |------------------------------------------------------------------|
| SERVER_PORT                   | Porta que a aplicação utilizará em sua execução. (Default: 8081) |
| KAFKA_HOST                    | Url do Kafka. (Default: localhost: 9092)                         |
| KAFKA_TOPIC_NAME              | Nome do tópico do kafka. (Default: a-simple-topic)               |
| KAFKA_GROUP_ID                | Group Id do Kafka. (Default: a-simple-group-id)                    |

### 🚀 A Simple Kafka Consumer 📚

Essa é uma API que foi desenvolvida para ser um simples Kafka Consumer seguindo a mesma pegada desse projeto, no link
abaixo você pode acessar toda a documentação e a aplicação.

```bash

```

## 🚀 Tecnologias 👩‍🚀

As seguintes tecnologias foram utilizadas no desenvolvimento do projeto.

- Java 11
- Spring Boot 2.7.4
    - Web
- Swagger
- Kafka

## 👨🏻‍💻 Autor

<br>
<a href="https://github.com/matheuscarv69">
 <img style="border-radius: 35%;" src="https://avatars1.githubusercontent.com/u/55814214?s=460&u=ffb1e928527a55f53df6e0d323c2fd7ba92fe0c3&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Matheus Carvalho</b></sub></a> <a href="https://github.com/matheuscarv69" title="Matheus Carvalho">🚀</a>

Feito por Matheus Carvalho, entre em contato!✌🏻

 <p align="left">
    <a href="mailto:matheus9126@gmail.com" alt="Gmail" target="_blank">
      <img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white&link=mailto:matheus9126@gmail.com"/></a>
    <a href="https://www.linkedin.com/in/matheus-carvalho69/" alt="Linkedin" target="_blank">
        <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white&link=https://www.linkedin.com/in/matheus-carvalho69/"/></a>  
    <a href="https://www.instagram.com/_mmcarvalho/" alt="Instagram" target="_blank">
      <img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white&link=https://www.instagram.com/_mmcarvalho/"/></a>  
  </p>