package pageObjects;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class CalculadoraPage {
	
	public CalculadoraPage(AppiumDriver<?> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_05")
	private MobileElement btnPrimeiroNro;
    
	@AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_add")
	private MobileElement botaoMais;
	
	@AndroidFindBy(accessibility = "5")
	private MobileElement btnSegundoNro;
	
	@AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_equal")
	private MobileElement btnIgual;
	
	@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/txtCalc")
	private MobileElement campoResultado;
	
	public void clicarBtnPrimeiroNro() {
		btnPrimeiroNro.click();
	}
	
	public void clicarBotaoMais() {
	    botaoMais.click();	
	}
	
	public void clicarBtnSegundoNro() {
		btnSegundoNro.click();
	}
	
	public void clicarBtnIgual() {
		btnIgual.click();
	}
	
	public void realizarSoma() {
		System.out.println("Soma realizada com sucesso!");
		campoResultado.click();
	}
	
}
