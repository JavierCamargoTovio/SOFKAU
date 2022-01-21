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

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {

    private static String USUARIO;
    private static String CLAVE;
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

    @Given("un usuario de sofka u abre la página")
    public void un_usuario_de_sofka_u_abre_la_página() {
        OnStage.theActorCalled("Javier").wasAbleTo(AbrirPagina.abrirPagina());
    }

    @When("ingresa {string} y {string}")
    public void ingresa_y(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(Login.login(usuario, clave));
    }

    @Then("se logea correctamente")
    public void se_logea_correctamente() {
     //System.out.println("Usuario: "+ LoginQ.ValidarUsuario().answeredBy(theActorInTheSpotlight()));
       String  validar = LoginQ.validarUsuario().answeredBy(theActorInTheSpotlight());
       System.out.println(validar);

        if (validar.equalsIgnoreCase("JAVIER EMILIO CAMARG...")){
            System.out.println("Exitoso");
        }else{
            System.out.println("Fallido");
        }

    }
}
