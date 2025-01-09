package br.com.netshoes.page.pages;

import br.com.netshoes.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "search")
    private WebElement barraSearch;

    @FindBy(className = "search__button")
    private WebElement botaoSearch;

    @FindBy(className = "suggest__popular-words")
    private WebElement sugestao;

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public  void acessarSiteNetshoes() {
        navegador.get("https://www.netshoes.com.br/");
    }

    public void inserirPalavraNaBarraDePesquisa(String palavra) {
        barraSearch.sendKeys(palavra);
    }

    public void clicarNaBarraSearch() {
        barraSearch.click();
    }

    public void clicarNoBotaoSearch() {
        botaoSearch.click();
    }

    public String verificaSugeridos() {
        return sugestao.getText();
    }
}
