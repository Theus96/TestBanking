package br.com.brq.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.brq.ByUtils;
import br.com.brq.JsonUtils;
import br.com.brq.TelaBase;

public class TelaDeLogin extends TelaBase {
	private By inputAgencia = ByUtils.encontraByID(ByUtils.INPUT, "campo_agencia");
	private By inputConta = ByUtils.encontraByID(ByUtils.INPUT, "campo_conta");
	private By botaoEntrar = ByUtils.encontraByClass(ByUtils.A_LINK, "btnSubmit");
	private By senhaEletronica = ByUtils.encontraByID(ByUtils.INPUT, "senha");

	public TelaDeLogin(WebDriver driver) {
		super(driver);
	}

	public void setAgencia(String usuario) {
		this.getElemento().elementoWebInsereTexto(this.inputAgencia, usuario);
	}

	public void setConta(String usuario) {
		this.getElemento().elementoWebInsereTexto(this.inputConta, usuario);
	}
	
	public boolean setSenhaEletronica() {
		return this.getElemento().elementoWebEstaVisivel(this.senhaEletronica);
	}

	public void clicaBotaoEntrar() {
		this.getElemento().elementoWebClica(this.botaoEntrar);
	}


//	public TelaHome loga() {
//		JsonUtils json = new JsonUtils();
//		this.navega(json.getUrl());
//		this.maximizaBrowser();
//		this.setChave(this.getChave());
//		this.setLogin(json.getUsuario());
//		this.setSenha(json.getSenha());
//		this.apertaEsc();
//		this.clicaBotaoEntrar();
//
//		return new TelaHome(this.getDriver());
//	}
}
