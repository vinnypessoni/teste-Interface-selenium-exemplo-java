import page_objects.TesterGlobalPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class VerificaSiteTesterGlobal {

    private final String baseUrl = "http://www.viniciuspessoni.com";
    private final String driverPath = "src/test/resources/chromedriver 5";


    private TesterGlobalPage tgp;
    private WebDriver driver;

    @BeforeAll
    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterAll
    public void tearDown () {
        driver.close();
    }

    @Test
    @DisplayName("Quando abrir página principal do Tester Global, Então encontrar o título da página presente.")
    public void verificaPaginaPrincipal () {
        String tituloEsperado = "TESTER GLOBAL";
        String tituloEncontrado = "";

        tgp = new TesterGlobalPage(driver);
        tituloEncontrado = tgp.getTituloTesterGlobal();

        System.out.println(tituloEncontrado);

        assertThat(tituloEncontrado, containsString(tituloEsperado));
    }

    @Test
    @DisplayName("Quando realizar a busca por norma no campo busca, então devo ver o artigo sobre normas de teste.")
    public void verificaCampoBusca () {

    }


}
