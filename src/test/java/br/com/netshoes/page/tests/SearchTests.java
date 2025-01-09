package br.com.netshoes.page.tests;

import br.com.netshoes.page.pages.HomePage;
import br.com.netshoes.page.pages.ResultsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

@DisplayName("Testes automatizados da funcionalidade de pesquisa ")

public class SearchTests {

    private WebDriver navegador;

    @BeforeEach
    public void setUp() {

        WebDriverManager.firefoxdriver().setup();
        navegador = new FirefoxDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    @DisplayName("Buscar um item na barra de pesquisa com um item válido")
    public void  testBuscarUmItemNaBarraDePesquisaComUmItemValido() {

        HomePage homePage = new HomePage(navegador);
        ResultsPage resultsPage = new ResultsPage(navegador);

        homePage.acessarSiteNetshoes();

        homePage.inserirPalavraNaBarraDePesquisa("tenis");

        homePage.clicarNoBotaoSearch();

        String resultado = resultsPage.verificarResultadoDaBusca();
        Assertions.assertTrue(resultado.contains("RESULTADOS DE BUSCA PARA"));

    }

    @Test
    @DisplayName("Buscar um item na barra de pesquisa com um item inválido")
    public void testBuscarUmItemNaBarraDePesquisaComUmItemInvalido() {

        HomePage homePage = new HomePage(navegador);
        ResultsPage resultsPage = new ResultsPage(navegador);

        homePage.acessarSiteNetshoes();

        homePage.inserirPalavraNaBarraDePesquisa("tesssssst");

        homePage.clicarNoBotaoSearch();

        String resultadoInvalido = resultsPage.verificarResultadoDaBuscaInvalida();
        Assertions.assertTrue(resultadoInvalido.contains("Verifique se você digitou as palavras corretamente ou tente novamente a busca."));
    }



    @AfterEach
    public void tearDown() {
        navegador.quit();
    }

}
