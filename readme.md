<h1 align="center">AWS S3</h1>

<p align="center">Projeto implementado para aplicar os conhecimentos de AWS S3 obtidos no curso para tirar a certificação SAA-CO2</p>

### 🛠 Tecnologias
___
As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/pt-BR/)
- [Lombok](https://projectlombok.org/)
- [Spring 2.5.5](https://spring.io/blog/2021/08/19/spring-boot-2-5-5-available-now)
- [Aws](https://aws.amazon.com/)

### ✅ Pré-requisitos
___
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com/) e [Java](https://www.java.com/pt-BR/).
Além disto é bom ter um editor para trabalhar com o código como [Intellij](https://www.jetbrains.com/pt-br/idea/)

### 🎲 Rodando o projeto
___
```bash
# Clone este repositório
$ git clone <https://gitlab.com/matheusfaxina/s3-example.git>

# Acesse a pasta do projeto no terminal/cmd
$ cd s3-example

# Vá para a pasta server
$ mvn clean package

# Instale as dependências
$ java -jar target/s3-example-0.0.1-SNAPSHOT.jar

# O servidor inciará na porta:3000 - acesse <http://localhost:3000>
```

### ➕ Detalhes da solução desenvolvida
___
* Foi implementado as ações: adicionar, buscar e deletar imagem do S3.
* Para o projeto rodar é necessário criar um bucket com o nome matheusfaxina-s3-test ou outro nome desde que seja alterado no application.yaml, criar uma pasta dentro do bucket chamada pictures e deve ser informado o access-key e a secret key do seu usuário no application.yaml.

### ✒️ Autor
___
<a href="https://www.linkedin.com/in/matheusvfaxina/">
 <img style="border-radius: 50%;" src="https://media-exp1.licdn.com/dms/image/C4E03AQHrHj9yWmIbgg/profile-displayphoto-shrink_800_800/0/1610406929592?e=1636588800&v=beta&t=7og_fNQRDlbZp38HsaQ5sV9MMBrxVqO-YkPJKfUyYZo" width="100px;" alt=""/>
 <br />
 <sub><b>Matheus Faxina</b></sub></a> <a href="https://www.linkedin.com/in/matheusvfaxina/" title="Linkedin"></a>

[![Gmail Badge](https://img.shields.io/badge/-matheus.vfaxina@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:matheus.vfaxina@gmail.com)](mailto:matheus.vfaxina@gmail.com)
