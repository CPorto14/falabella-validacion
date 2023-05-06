package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OportunidadesUnicasPage {
    public static Target BOTON_PAGINA2 = Target.the("boton pagina 2").located(By.id("testId-pagination-top-button2"));
    public static Target PRODUCTOS = Target.the("productos listados").locatedBy("//div[@pod-layout='4_GRID']");




}
