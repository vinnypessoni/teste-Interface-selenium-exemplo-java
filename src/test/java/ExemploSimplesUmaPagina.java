import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ExemploSimplesUmaPagina {


    @Test
    @DisplayName("Quando abrir página principal do Tester Global, Então encontrar o título da página presente.")
    public void verificaPaginaPrincipal () {
        /**
         *  Assumimos que o chromedriver esteja na sua pasta de sistema corretamente.
         *  ex:
         *      Windows: C:/users/seuUsuario
         *      MAC: usr/local/bin
         */
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://www.viniciuspessoni.com";

        String tituloEsperado = "TESTER GLOBAL";

        String tituloEncontrado = "";

        driver.get(baseUrl);
        tituloEncontrado = driver.findElement(By.cssSelector(".et_pb_text_inner")).getText();

        System.out.println(tituloEncontrado);

        /**
         * Observe que estamos usando o contains para verificar se o título está presente na página.
         * Fazemos isso para o código ficar mais robusto.
         * Observe ainda que o matcher vem do Hamcrest. Usamos bibliotecas específicas para nos ajudar
         * a ter matchers mais robustos.
         */
        assertThat(tituloEncontrado, containsString(tituloEsperado));

        driver.close();
    }
}
