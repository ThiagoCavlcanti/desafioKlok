package br.com.netshoes.page.pages;

import br.com.netshoes.page.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage {

    private By localizadorDoresultadoDaBusca = By.className("header-content__title");

    public ResultsPage(WebDriver navegador) {
        super(navegador);
    }

    public String verificarResultadoDaBusca() {
        return navegador.findElement(localizadorDoresultadoDaBusca).getText();
    }
}
