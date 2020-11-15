
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExemploSimplesUmaPagina {


    public static void main (String[] args) {

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
       MatcherAssert.assertThat(tituloEncontrado, Matchers.containsString(tituloEsperado));

        // Observe que se estamos usando só o Java pra rodar o selenium, precisamos usar o quit ao inves do .close aqui
        driver.quit();

    }
}
