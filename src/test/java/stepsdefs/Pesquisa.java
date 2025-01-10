package stepsdefs;

import br.com.netshoes.page.BasePage;
import br.com.netshoes.page.pages.HomePage;
import br.com.netshoes.page.pages.ResultsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pesquisa {

    private WebDriver navegador;

    private HomePage homePage;
    private ResultsPage resultsPage;

    @Before
    public void setup() {
        navegador = new ChromeDriver();
        navegador.manage().window().setSize(new Dimension(1024, 800));
    }

    @After
    public void tearDown() {
        navegador.quit();
    }

    @Given("usuário esta na pagina inicial")
    public void usuárioEstaNaPaginaInicial() {
        homePage = new HomePage(navegador);
        resultsPage = new ResultsPage(navegador);
        homePage.acessarSiteNetshoes();
        navegador.findElement(By.tagName("body")).click();
    }

    @When("digitar {string} na barra de pesquisa")
    public void digitar(String item) {
        homePage.inserirPalavraNaBarraDePesquisa(item);
    }

    @And("clicar no botão search")
    public void clicar() {
        homePage.clicarNoBotaoSearch();
    }

    @Then("deve ser exibido uma lista de produtos relacionados")
    public void deveSerExibidoUmaListaDeProdutosRelacionados() {
        String resultado = resultsPage.verificarResultadoDaBusca();
        Assert.assertTrue(resultado.contains("RESULTADOS DE BUSCA PARA"));
    }

    @Then("deve ser exibido a mensagem {string}")
    public void deveSerExibidoAMensagem(String mensagem) {
        String resultado = resultsPage.verificarResultadoDaBuscaInvalida();
        Assert.assertTrue(resultado.contains(mensagem));
    }

    @When("clicar no barra search")
    public void clicarNoBarraSearch() {
        homePage.clicarNaBarraSearch();
    }

    @Then("deve ser exibido {string}")
    public void deveSerExibidoUmaListaDeProdutosSugeridos(String mensagem) {
        String sugeridos = homePage.verificaSugeridos();
        Assert.assertTrue(sugeridos.contains(mensagem));
    }
}
