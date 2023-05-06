package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaMaquillajeLinio {
    public static Target PRODUCTOS_MAQUILLAJE = Target.the("Resultados de los productos de maquillaje").located(By.id("testId-searchResults-products"));
    public static Target TITULO_CATEGORIA_MAQUILLAJE = Target.the("Titulo de la categoria de maquillaje").locatedBy("//a[@href='/linio-co/category/cat5440960/Belleza,-higiene-y-salud']");

}
