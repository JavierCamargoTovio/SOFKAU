package co.org.example.sofkau.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {
    public static  final Target USUARIO = Target.the("Campo usuario").located(By.xpath("(//form[@id='tlLoginForm']//div//div//div//input)[1]"));
    public static  final Target CLAVE = Target.the("Campo CLAVE").located(By.xpath("(//form[@id='tlLoginForm']//div//div//div//input)[2]"));
    public static  final Target BTN_INICIAR_SESION = Target.the("Campo CLAVE").located(By.xpath("//form[@id='tlLoginForm']//div[@class='spacer spacer--x2']//input"));
}
