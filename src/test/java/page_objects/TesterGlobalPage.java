package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TesterGlobalPage {

    WebDriver driver;

    By tituloTesterGlobal = By.cssSelector(".et_pb_text_inner");
    By campoBusca = By.xpath("//*[@id=\"main-header\"]/div[2]/div/form/input");

    public TesterGlobalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTituloTesterGlobal() {
        return driver.findElement(tituloTesterGlobal).getText();
    }

    public void realizarBuscaPorTema (String palavraParaBuscar) {
        driver.findElement(campoBusca).sendKeys(palavraParaBuscar);
        driver.findElement(campoBusca).sendKeys(Keys.ENTER);
    }

    public By getCampoBusca() {
        return campoBusca;
    }
}
