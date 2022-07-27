package co.org.example.sofkau.questions;

import co.org.example.sofkau.userinterface.SofkaUPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

import static co.org.example.sofkau.util.constants.Constants.NAME_USER;
import static co.org.example.sofkau.util.manager.ComparatorManager.compareDifferences;



public class LoginQ implements Question<Boolean> {


    private LoginQ() {
    }

    public static LoginQ verificarLogin() {
        return new LoginQ();
    }

    @Override
    @Step("{0} verifica el resultado de la busqueda")
    public Boolean answeredBy(Actor actor) {
        String nameUserExperado = Text.of(SofkaUPage.Nombre_USUARIO).viewedBy(actor).asString();
        return compareDifferences(NAME_USER, nameUserExperado);
    }
}
