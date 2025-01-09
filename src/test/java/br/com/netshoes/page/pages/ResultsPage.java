package br.com.netshoes.page.pages;

import br.com.netshoes.page.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage {


    @FindBy(className = "header-content__title")
    private WebElement resultadoDaBusca;

    public ResultsPage(WebDriver navegador) {
        super(navegador);
    }

    public String verificarResultadoDaBusca() {
        return resultadoDaBusca.getText();
    }
}
