package co.com.choucair.certification.ProyectoBase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject{

    public static final Target LOGIN_BUTTTON = Target.the("button that shows us the form the login").
            located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("Where the user write the username").
            located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Where the user write the password").
            located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Button to access").
            located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
