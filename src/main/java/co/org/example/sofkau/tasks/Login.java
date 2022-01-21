package co.org.example.sofkau.tasks;

import co.org.example.sofkau.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {

    private String usuario;
    private String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    @Step("{0} ingresa las credenciales")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.USUARIO),
                Enter.theValue(clave).into(LoginPage.CLAVE),
                Click.on(LoginPage.BTN_INICIAR_SESION)
        );
    }

    public static Login login(String usuario, String clave) {
        return Tasks.instrumented(Login.class, usuario, clave);
    }

}
