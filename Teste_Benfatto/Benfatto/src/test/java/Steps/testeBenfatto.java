package Steps;

import org.openqa.selenium.By;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagina.Metodos;

public class testeBenfatto {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que esteja na pagina do google {string}")
	public void que_esteja_na_pagina_do_google(String site) {
		metodos.abriNavegador(site);

	}

	@When("digite Benfatto na busca")
	public void digite_benfatto_na_busca() {
		By elementoBusca = By.name("q");
		metodos.escrever(elementoBusca, "Benfatto");
		metodos.submit(elementoBusca);
	}

	@Then("valido a busca e fecho a pagina")
	public void valido_a_busca_e_fecho_a_pagina() {
		metodos.validarTexto(el.getNome(), "Benfatto" );
		metodos.screenShot("pesquisa");
		metodos.fecharNavegador();

	}
}
