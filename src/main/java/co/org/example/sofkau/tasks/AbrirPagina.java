package co.org.example.sofkau.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.org.example.sofkau.util.constants.Constants.URL;

public class AbrirPagina extends PageObject implements Task {
    private final String rutaPagina;
    private static final Logger LOGGER = LoggerFactory.getLogger(AbrirPagina.class);
    private static final String MSG_FIN_ACCION = "Página cargada con exito";

    public AbrirPagina(String rutaPagina) {
        this.rutaPagina = rutaPagina;
    }

    @Override
    @Step("{0} abre la página de SOFKA U")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(rutaPagina));
        LOGGER.info(MSG_FIN_ACCION);
    }


    public static AbrirPagina abrirPagina() {
        return Tasks.instrumented(AbrirPagina.class, URL);
    }
}
