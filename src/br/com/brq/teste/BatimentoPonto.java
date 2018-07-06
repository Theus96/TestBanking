package br.com.brq.teste;

import static org.junit.Assert.assertTrue;

import java.util.TimerTask;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.brq.pom.TelaDeLogin;

public class BatimentoPonto extends TimerTask {
	private TelaDeLogin telaLogin;
	WebDriver driver;
	// private TelaControleDoPonto telaPonto;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/DEV/LIB/geckodriver.exe");
		driver = new FirefoxDriver();
		telaLogin = new TelaDeLogin(driver);
	}

	@Test
	public void run() {
		telaLogin.startURL("https://www.itau.com.br/");
		telaLogin.setAgencia("0440");
		telaLogin.setConta("083327");
		telaLogin.clicaBotaoEntrar();
		if (telaLogin.setSenhaEletronica()) {
			assertTrue("Deu bom", telaLogin.setSenhaEletronica());
		} else {
			Assert.fail("Deu ruim");
		}
		telaLogin.preencheSenha("102432");
		telaLogin.clicaBotaoAcessar();
		
	}

	@After
	public void downTest() {
		telaLogin.fecha();
	}

}
