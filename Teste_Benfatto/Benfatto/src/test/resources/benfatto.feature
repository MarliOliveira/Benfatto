#Author: marlideoliveira2016@gmail.com

Feature: Acesso pagina google
 Como usuario quero acessar pagina do google para buscar Benfatto
  
  Scenario: Acessar paginar e realizar busca  
    Given que esteja na pagina do google "https://google.com.br"
    When digite Benfatto na busca 
    Then valido a busca e fecho a pagina
  