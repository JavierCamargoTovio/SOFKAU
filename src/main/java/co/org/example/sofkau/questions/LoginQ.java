package co.org.example.sofkau.questions;

import co.org.example.sofkau.userinterface.SofkaUPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class LoginQ {

    private LoginQ() {
    }

    public static Question<String> validarUsuario(){
        return actor -> Text.of(SofkaUPage.Nombre_USUARIO).viewedBy(actor).asString();

    }

}
