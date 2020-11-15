package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostagemPage {

    WebDriver driver;

    By tituloPostagem = By.cssSelector("#post-205 > h2 > a");

    public PostagemPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTituloPostagem() {
        return driver.findElement(tituloPostagem).getText();
    }
}
