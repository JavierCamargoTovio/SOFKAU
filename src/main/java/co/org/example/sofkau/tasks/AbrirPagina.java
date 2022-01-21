package co.org.example.sofkau.tasks;

import co.org.example.sofkau.userinterface.AbrirPaginaPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirPagina extends PageObject implements Task {
    private AbrirPaginaPage abrirPaginaPage;
    private  final String nombrePagina;
    private static final Logger LOGGER = LoggerFactory.getLogger(AbrirPagina.class);
    private static final String MSG_EXEC_ACCION = "Accediendo a la pagina: %s";
    private static final String MSG_FIN_ACCION = "Página cargada con exito";

    public AbrirPagina() {
        this.nombrePagina = "SOFKA U";
    }

    @Override
    @Step("{0} abre la página de SOFKA U")
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info(String.format(MSG_EXEC_ACCION, nombrePagina));
        actor.attemptsTo(Open.browserOn(abrirPaginaPage));
        LOGGER.info(MSG_FIN_ACCION);
    }


    public static AbrirPagina abrirPagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }
}
