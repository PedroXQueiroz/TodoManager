# TodoManager

## Descrição:
Projeto de referência de estudo para java web básico.
Consiste em um simples gerenciador de tarefas (Todo), com autenticação.

- Principais tecnologias utilizadas:
  - Hibernate
  - Spring/Spring MVC
  - Mysql
  - apache Tomcat
  - Tiles

- Requisitos:
  - msysql: https://dev.mysql.com/downloads/mysql/
  - maven3: https://maven.apache.org/download.cgi (baixar o zip)
  - java8: http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html
  - tomcat: https://tomcat.apache.org/download-70.cgi

- Configuração do ambiente:
  - Instalar o mysql, baixando no link indicado acima e seguindo os passos do instalador.
  - Instalar o maven:
    - baixar o maven no link indicado acima
    - descompatá-lo na pasta que preferir
  - adicionar a pasta ao Path do sistema
  - Testar instalação abrindo o Prompt de comando e executando: mvn --version. Caso mostre que é a versão do Maven é a 3, está tudo funcionando corretamente
  - Instalar o tomcat:
    - baixar o tomcat no link indicado acima
    - descompactar na pasta que desejar
    - testar a instalação, abrindo o prompt de comando em (pasta onde descompactou o tomcat)\apache-tomcat-7.0.50\bin e executando o comando: catalina.bat run
    - quando uma mensagem similar a: INFORMAÃıES: Server startup in 9978 ms e nada mais ser escrito no prompt, acesse pelo chrome: localhost:8080. Caso esteja tudo ok, irá aparecer a página inicial do tomcat
  - No mysql, cria o banco de dados todo (da forma que achar mais conveniente, para tal, recomendo a instalação do workbench: https://dev.mysql.com/downloads/workbench/ )
  - No diretório raiz do projeto, onde o pom.xml está, abra o prompt de comando e execute o comando: mvn install
  - Se tudo funcionou corretamente o comando mvn install:
    - baixou e instalou os pacotes do hibernate, spring, conector do mysql, e alguns pacotes importantes para a comunicação em json
    - compilou o código
    - gerou um pacote resultante com o nome TodoManager.war na pasta target, dentro da pasta do projeto
  - Testar o funcionamento do projeto
  -- Acessar pelo chrome: http://localhost:8080/TodoManager/
