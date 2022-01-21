package co.org.example.sofkau.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SofkaUPage extends PageObject {
    public static  final Target Nombre_USUARIO = Target.the("Nombre de usuario").located(By.xpath("//div[@id='tl-navigation-bar-handler']//div[2]//ul//li[@id='tl-dropdown-roles']//a//span"));
}
