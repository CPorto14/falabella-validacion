package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BarraNavegacionPage {

    public static Target BOTON_VENDE_EN_FALABELLA = Target.the("Boton para la seccion vende en falabella").located(By.id("testId-extra-links-0"));
    public static Target DESPLEGABLE_TARJETAS_Y_CUENTAS = Target.the("Desplegable de tarjetas y cuentas").locatedBy("//div[@id='testId-extra-links-dropdown-1']");
    public static Target BOTON_SECCION_NOVIOS = Target.the("Boton seccion de novios").located(By.id("testId-extra-links-3"));
    public static Target DESPLEGAGLE_AYUDA = Target.the("Desplegable de seccion de ayuda").located(By.id("testId-extra-links-dropdown-4"));
    public static Target BOTON_LINIO = Target.the("Boton para ingresar a Linio").located(By.id("testId-store-links-2"));



}
