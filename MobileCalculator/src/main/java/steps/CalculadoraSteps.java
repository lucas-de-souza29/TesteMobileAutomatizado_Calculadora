package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.CalculadoraPage;
import static utils.Utils.driver;

public class CalculadoraSteps {

    CalculadoraPage calc = new CalculadoraPage(driver); 	
	
	@Dado("que o usuario clique no primeiro numero")
	public void queOUsuarioCliqueNoPrimeiroNumero() {
	    calc.clicarBtnPrimeiroNro();
	}

	@Dado("clique no botao mais")
	public void cliqueNoBotaoMais() {
	    calc.clicarBotaoMais();    
	}

	@Dado("clique no botao com o segundo numero")
	public void cliqueNoBotaoComOSegundoNumero() {
	    calc.clicarBtnSegundoNro();
	}

	@Dado("clique no botao igual")
	public void cliqueNoBotaoIgual() {
	    calc.clicarBtnIgual();
	}

	@Entao("o app realiza a soma")
	public void oAppRealizaASoma() {
        calc.realizarSoma();   
	}



}
