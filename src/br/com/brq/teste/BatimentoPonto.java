package br.com.brq.teste;

import java.util.TimerTask;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.brq.pom.TelaDeLogin;

public class BatimentoPonto extends TimerTask {
	private TelaDeLogin telaLogin;
	//private TelaControleDoPonto telaPonto;

	@Test
	public void run() {
		System.setProperty("webdriver.gecko.driver", "C:/DEV/LIB/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		telaLogin = new TelaDeLogin(driver);
		telaLogin.startURL("https://www.itau.com.br/");
		telaLogin.setAgencia("0440");
		telaLogin.setConta("083327");
		telaLogin.clicaBotaoEntrar();
		Assert.assertTrue(telaLogin.setSenhaEletronica());
	}
}
