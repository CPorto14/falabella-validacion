package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaBienvenidaPage {
    public static Target BOTON_SKIP_BIENVENIDA = Target.the("boton skip de bienvenida").located(By.id("testId-onboarding-desktop-skip"));

}
