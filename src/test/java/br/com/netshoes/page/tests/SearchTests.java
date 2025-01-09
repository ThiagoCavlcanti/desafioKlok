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

        //acessa o site da NetShoes
        homePage.acessarSiteNetshoes();

        //Insere na barra de pesquisas a palavra desejada
        homePage.inserirPalavraNaBarraDePesquisa("tenis");

        //Clica no botão de pesquisa da barra de pesquisa
        homePage.clicarNoBotaoSerach();

        //Verifica se o site encontrou algum resultado para a pesquisa realizada
        String resultado = resultsPage.verificarResultadoDaBusca();
        Assertions.assertTrue(resultado.contains("RESULTADOS DE BUSCA PARA"));

    }


    @AfterEach
    public void tearDown() {
        navegador.quit();
    }

}
