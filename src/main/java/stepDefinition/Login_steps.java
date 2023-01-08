package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {




    @Given("Amazon sitesine git")
    public void amazon_sitesine_git() {
        System.out.println("Amazon sitesine gidildi");
    }

    @Given("login butonuna tıkla")
    public void login_butonuna_tıkla() {
        System.out.println("Login butonuna tiklanildi");
    }

    @Given("isim gir")
    public void isim_gir() {
        System.out.println("Isim girildi");
    }

    @Given("sifre gir")
    public void sifre_gir() {
        System.out.println("Sifre girildi");

    }

    @When("submit butonuna tıkladıgımda")
    public void submit_butonuna_tıkladıgımda() {
        System.out.println("Submit butonuna tikanildi");

    }

    @Then("success mesajini verify et")
    public void success_mesajini_verify_et() {
        System.out.println("Succes mesaji verify edildi");

    }

}
