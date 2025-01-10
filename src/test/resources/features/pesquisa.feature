Feature: realizar uma pesquisa no site nteshoes
  Scenario: realizar pesquisa com item válido
    Given usuário esta na pagina inicial
    When digitar "tenis" na barra de pesquisa
    And clicar no botão search
    Then  deve ser exibido uma lista de produtos relacionados

  Scenario: realizar pesquisa com item inválido
    Given usuário esta na pagina inicial
    When digitar "tessssst" na barra de pesquisa
    And clicar no botão search
    Then  deve ser exibido a mensagem "Verifique se você digitou as palavras corretamente ou tente novamente a busca."

  Scenario: Verifica se após clicar na barra de busca tem itens sugeridos
    Given usuário esta na pagina inicial
    When clicar no barra search
    Then  deve ser exibido "Termos mais buscados"
