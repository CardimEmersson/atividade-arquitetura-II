# Atividade prática de desenvolvimento II
## Arquitetura de Software - ADS - IFBA Campus Eunápolis
> <p>Repositório para atividade prática II da Disciplina de Arquitetura de Software.</p>
> <p>Discentes: Emersson Cardim, Jéssica Batista, João Oliveira.</p>

Tecnologias utilizadas:
=================
<!--ts-->
* [Spring Boot](https://spring.io/projects/spring-boot)

<!--te-->
## Dependencias utilizadas:
<!--ts-->
* <b>WEB</b>
   * Spring web
   * Hystrix Netflix
<!--te-->

## EXECUÇÃO DO DOCKER
```bash
# Para executar os comandos abaixo é necessário ter o Maven instalado
# Entre nas pastas 'central-irrigacao' e 'irrigacao' e execute os comandos para executar os servidores
$ mvn clean install -DskipTests
$ mvn spring-boot:run

# O serviço irrigacao é executado na porta 8181
$ localhost:8181/criar-irrigacao
$ localhost:8181/ligar-irrigacao

# O serviço central-irrigacao é executado na porta 8282
$ localhost:8282/ligar-irrigacao

```
