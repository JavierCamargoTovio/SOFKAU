package co.org.example.sofkau.stepdefinitios;

import co.org.example.sofkau.questions.LoginQ;
import co.org.example.sofkau.tasks.AbrirPagina;
import co.org.example.sofkau.tasks.Login;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginStep.class);
    private static final String MSG_FIN_PRUEBA = "Finaliza test";
    private static final String MSG_INICIA_PRUEBA = "Inicia test";
    private static final String MSG_EXEC_ACCION = "Validando resultado de la accion: %s";

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        LOGGER.info(MSG_INICIA_PRUEBA);
    }

    @After
    public void afterRun() {
        LOGGER.info(MSG_FIN_PRUEBA);
    }

    @Given("un usuario que ingresa la página de sofkaU")
    public void un_usuario_que_ingresa_la_página_de_sofkaU() {
        OnStage.theActorCalled("Javier").wasAbleTo(AbrirPagina.abrirPagina());
    }

    @When("ingresa las crenciales validas")
    public void ingresa_las_crenciales_validas() {
        theActorInTheSpotlight().attemptsTo(Login.login());
    }

    @Then("se logea correctamente")
    public void se_logea_correctamente() {
        theActorInTheSpotlight().should(seeThat(LoginQ.verificarLogin()));
        LOGGER.info(MSG_EXEC_ACCION);
    }
  /**
  *Login fallido
  * */
    @When("ingresa las crenciales no validas")
    public void ingresa_las_crenciales_no_validas() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("se presenta un mensaje fallido")
    public void se_presenta_un_mensaje_fallido() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
