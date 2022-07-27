package co.org.example.sofkau.tasks;

import co.org.example.sofkau.model.Usuario;
import co.org.example.sofkau.userinterface.LoginPage;
import co.org.example.sofkau.util.manager.GestionUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {
    Usuario usuario = GestionUsuarios.getUser();
    public Login() {

    }

    @Override
    @Step("{0} ingresa las credenciales y inicia sesión")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario.getUser()).into(LoginPage.USUARIO),
                Enter.theValue(usuario.getClave()).into(LoginPage.CLAVE),
                Click.on(LoginPage.BTN_INICIAR_SESION)
        );
    }

    public static Login login() {
        return Tasks.instrumented(Login.class);
    }

}
