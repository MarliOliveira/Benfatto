package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By elementoBusca = By.id("q");
private By nome = By.xpath("//*[@id=\"Odp5De\"]/div/div/div/div[1]/div[1]/div/div/div/div/div");
	public By getelementoBusca() {
		return elementoBusca;

	}
	public By getNome() {
		return nome;
	}
}
