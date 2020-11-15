import page_objects.PostagemPage;
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

    private WebDriver driver;

    private TesterGlobalPage paginaPrincipal;
    private PostagemPage postagem;

    @BeforeAll
    public void setup (){
        // Remova propriedade para usar seu chrome driver local ao invés do que vem junto do projeto que só funciona pra MAC e chrome 86x
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    public void tearDown () {
        driver.close();
    }

    @Test
    @DisplayName("Quando abrir página principal do Tester Global, Então encontrar o título da página presente.")
    public void verificaPaginaPrincipal () {
        driver.get(baseUrl);
        String tituloEsperado = "TESTER GLOBAL";
        String tituloEncontrado = "";

        paginaPrincipal = new TesterGlobalPage(driver);
        tituloEncontrado = paginaPrincipal.getTituloTesterGlobal();

        System.out.println(tituloEncontrado);

        assertThat(tituloEncontrado, containsString(tituloEsperado));
    }

    @Test
    @DisplayName("Quando realizar a busca por norma no campo busca, então devo ver o artigo sobre normas de teste.")
    public void verificaCampoBusca () {
        driver.get(baseUrl);
        paginaPrincipal = new TesterGlobalPage(driver);

        String tituloEsperado = "Norma ISO/IEC/IEEE 29119 Software Testing The international standard for software testing";
        String tituloEncontrado = "";

        paginaPrincipal.realizarBuscaPorTema("norma iso");

        postagem = new PostagemPage(driver);

        tituloEncontrado = postagem.getTituloPostagem();

        System.out.println(tituloEncontrado);

        assertThat(tituloEncontrado, containsString(tituloEsperado));
    }
}
