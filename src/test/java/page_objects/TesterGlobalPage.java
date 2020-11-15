package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesterGlobalPage {

    WebDriver driver;

    By tituloTesterGlobal = By.cssSelector(".et_pb_text_inner");
   // By campoBusca = By.id("et_search_icon");


    public TesterGlobalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTituloTesterGlobal() {
        return driver.findElement(tituloTesterGlobal).getText();
    }



}
