# Projeto Didático Simples com Selenium Webdriver

Essa framework de teste automatizado utiliza Selenium Webdriver, Junit 5 e Gradle para realizar 
os testes. 

Também exemplifica o uso do design pattern Page Objects. 

## Framework de teste automatizado

O chomedrive disponível nesse projeto é a versão ChromeDriver 86.0.4240.22 para MACOSx.

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