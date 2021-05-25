# Projeto Didático Simples com Selenium Webdriver

Essa framework de teste automatizado utiliza Selenium Webdriver, Junit 5 e Gradle para realizar os testes. 

Também exemplifica o uso do design pattern Page Objects. 

## Estrutura das Branches

Esse projeto possui 3 branches com diferentes níveis de complexidade e exemplificando diferentes usos das ferramentas para testes de interface. 

1. master: possui o projeto mais simples possível, para quem é iniciante com selenium, java e junit 5. 
2. selenium-puro: exemplifica o uso de selenium e java puro (sem Junit 5). 
3. selenium-junit5-pageobjects: demonstra o uso de selenium e Junit 5 aplicando o padrão Page Objects. 


## Framework de teste automatizado

O ChromeDriver disponível nesse projeto é a versão 86.0.4240.22 para MACOSx.

Isso significa que ele só funcionará em browsers chrome dessa série. 

Caso você queira executar esse projeto em uma outra versão de sistema e chromedriver, 
remova o seguinte comando de configuração da classe VerificaSiteTesterGlobal.

           System.setProperty("webdriver.chrome.driver", driverPath);
           
Após isso, visite o [site do chromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) baixe e instale o chromedriver localmente no seu sistema. 

        Windows
        	C:\users\seuNome
        
        Mac/Linux
        	/usr/local/bin

Assim, o projeto usará o chromedriver instalado localmente, e não o fornecido no projeto. 

#### Executando pelo IntelliJ

Após importar esse projeto no IntelliJ, navegue até a pasta src/test/java e abra a classe ExemploSimplesUmaPagina.

Um botão verde (um play) deve aparecer ao lado do nome da classe, basta apertar ele.

Os testes serão executados e os resultados serão exibidos na tela de execução do Intellij.

#### Executando pelo Terminal

Uma outra possibilidade é executá-los por meio do terminal.

Navegue até a pasta em que voceê baixou ou clonou os arquivos e use os comandos:
 
    Linux/Mac
    
        ./gradlew clean test  
    
    Windows
    
        gradlew clean test 

#### Relatórios

Os resultados dos testes são exibidos na tela do Intellij ou terminal.
 
Além disso, geramos um relatório .html a cada execução. 

Esse relatório está na pasta 

    build -> reports -> tests -> test -> index.html


#  Me Segue =}

😍 [YouTube]( https://www.youtube.com/c/pessonizando) 

💗 [Instagram](https://www.instagram.com/pessonizando)

⭐ [Telegram](https://t.me/pessonizando)
