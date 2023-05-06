package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;

public class VendeEnFalabellaPage {

    public static Target BOTON_PRIMEROS_PASOS = Target.the("seccion primeros pasos").locatedBy("//div[@data-testid='HorizontalMenuItem-testId']//p[contains(text(),'Primeros pasos')][1]");

}
