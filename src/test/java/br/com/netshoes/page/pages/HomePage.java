package br.com.netshoes.page.pages;

import br.com.netshoes.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By localizadorDaBarraSearch = By.id("search");
    private By localizadorBotaoSearch = By.className("search__button");

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public  void acessarSiteNetshoes() {
        navegador.get("https://www.netshoes.com.br/");
    }

    public void inserirPalavraNaBarraDePesquisa(String palavra) {
        navegador.findElement(localizadorDaBarraSearch).sendKeys(palavra);
    }

    public void clicarNoBotaoSerach() {
        navegador.findElement(localizadorBotaoSearch).click();
    }
}
