package co.org.example.sofkau.questions;

import co.org.example.sofkau.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

import static co.org.example.sofkau.util.constants.Constants.MENSAJE_ERROR;
import static co.org.example.sofkau.util.manager.ComparatorManager.compareDifferences;


public class LoginFallidoQ implements Question<Boolean> {


    public LoginFallidoQ() {
    }

    public static LoginFallidoQ verificarLoginFallido() {
        return new LoginFallidoQ();
    }

    @Override
    @Step("{0} verifica el resultado de la busqueda")
    public Boolean answeredBy(Actor actor) {
        String MensajeExperado = Text.of(LoginPage.LBL_MENSAJE_ERROR).viewedBy(actor).asString();
        return compareDifferences(MENSAJE_ERROR, MensajeExperado);
    }
}
