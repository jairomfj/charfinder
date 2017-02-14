# charfinder

## _Arquitetura_ ##

Para o design dos projetos, foram usados as seguintes tecnologias:

- Java 8
- Gradle (apenas para build do projeto e rodar os testes automatizados)
- JUnit

## _Para Rodar os Testes Aplicação_ ##

Via terminal, insira o seguinte comando no diretório do projeto:

```./gradlew test```

**Observação:** Os testes estão no seguinte arquivo: [CharStreamTest](https://github.com/jairomfj/charfinder/blob/master/src/test/java/br/com/charfinder/CharStreamTest.java)

Para testar mais cenários, basta incluir um novo método anotado com _@Test_ testando o cenário desejado.
