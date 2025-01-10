# Plano de Teste - Pesquisa Netshoes

## Visão Geral

Será feita a verificação do funcionamento da barra de pesquisas na página principal do site da Netshoes, sendo verificado casos de sucesso e fluxos alternativos de pesquisa para validação do comportamento da aplicação.

---

## Escopo

Testar a funcionalidade de pesquisa inserindo pesquisas com itens existentes e válidos, pesquisa com itens inexistentes ou inválidos e sugestões de pesquisa.

---

## User Stories

### Pesquisa com Item Válido

**Como usuário**, quero ser capaz de pesquisar um item válido na barra de pesquisa para encontrar resultados correspondentes ao item inserido.

**Critérios de Aceitação:**

- Quando o usuário digitar um termo válido na barra de pesquisa e pressionar Enter ou clicar no botão de pesquisa, ele deve ver uma lista de resultados relevantes.

### Pesquisa com Item Inválido

**Como usuário**, quero saber quando não há resultados para o termo pesquisado, para que eu possa ajustar minha pesquisa.

**Critérios de Aceitação:**

- Quando o usuário digitar um termo inválido na barra de pesquisa e pressionar Enter ou clicar no botão de pesquisa, ele deve ver uma mensagem indicando que não foram encontrados resultados.

### Sugestão de Pesquisa

**Como usuário**, quero ver sugestões de termos mais pesquisados, para que eu possa selecionar rapidamente um termo relevante.

**Critérios de Aceitação:**

- Quando o usuário começa a digitar na barra de pesquisa, uma lista de sugestões relevantes deve aparecer.

---

## Casos de Teste

- **CT-001-001**: Buscar um item na barra de pesquisa com um item válido.
- **CT-001-002**: Buscar um item na barra de pesquisa com um item inválido.
- **CT-001-003**: Verificar itens sugeridos na barra de pesquisa.
