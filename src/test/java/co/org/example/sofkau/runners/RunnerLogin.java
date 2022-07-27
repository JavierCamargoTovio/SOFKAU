package co.org.example.sofkau.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        tags = {"@LoginFallido"},
        glue = "co.org.example.sofkau.stepdefinitios")
public class RunnerLogin {

}
