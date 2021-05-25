package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.PostagemPage;
import page_objects.TesterGlobalPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class StepDefsTesterGlobal {

    private String baseUrl = "N/D";
    private final String driverPath = "src/test/resources/chromedriver 6";

    WebDriver driver;

    private TesterGlobalPage paginaPrincipal;
    private PostagemPage postagem;

    @Before
    public void setup (){
        System.out.println("Preparando o driver ");
        // Remova propriedade para usar seu chrome driver local ao invés do que vem junto do projeto que só funciona pra MAC e chrome 86x
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Dado("eu quero saber se o site {string} está online")
    public void eu_quero_saber_se_o_site_está_online(String baseUrl) {
       System.out.println("Vamos verificar o site: "+ baseUrl);
       this.baseUrl = baseUrl;
    }

    @Quando("acessar o site")
    public void acessar_o_site() {
        driver.get(baseUrl);
    }

    @Então("eu devo ver o nome {string} nele")
    public void eu_devo_ver_o_nome_nele(String string) {
        String tituloEsperado = "TESTER GLOBAL";
        String tituloEncontrado = "";

        paginaPrincipal = new TesterGlobalPage(driver);
        tituloEncontrado = paginaPrincipal.getTituloTesterGlobal();

        System.out.println("Titulo Encontrado: "+ tituloEncontrado);

        assertThat(tituloEncontrado, containsString(tituloEsperado));
    }

    @After
    public void tearDown () {
        driver.close();
    }

}
