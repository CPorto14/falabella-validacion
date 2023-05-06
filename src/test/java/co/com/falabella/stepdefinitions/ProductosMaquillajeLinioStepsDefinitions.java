package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pages.BarraNavegacionPage.BOTON_LINIO;
import static co.com.falabella.pages.CategoriaMaquillajeLinio.PRODUCTOS_MAQUILLAJE;
import static co.com.falabella.pages.CategoriaMaquillajeLinio.TITULO_CATEGORIA_MAQUILLAJE;
import static co.com.falabella.pages.FalabellaBienvenidaPage.BOTON_SKIP_BIENVENIDA;
import static co.com.falabella.pages.LinioPage.SECCION_BELLEZA;
import static co.com.falabella.pages.ProductosBellezaLinioPage.CATEGORIA_MAQUILLAJE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductosMaquillajeLinioStepsDefinitions {

    @Dado("que {actor} busca productos de maquillaje en Linio")
    public void ingresarLinio(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SKIP_BIENVENIDA),
                Click.on(BOTON_LINIO)
        );


    }
    @Cuando("{actor} Ingresa a la seccion de belleza")
    public void seccionBellezaYCuidadoPersonal(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_SKIP_BIENVENIDA),
                MoveMouse.to(SECCION_BELLEZA),
                Click.on(SECCION_BELLEZA)
        );

    }
    @Entonces("{actor} debe encontrar la categoria de maquillaje y sus productos")
    public void productosMaquillaje(Actor actor) {
        actor.attemptsTo(
                Click.on(CATEGORIA_MAQUILLAJE),
                WaitUntil.the(TITULO_CATEGORIA_MAQUILLAJE, isVisible()).forNoMoreThan(3).seconds(),
                Ensure.that(PRODUCTOS_MAQUILLAJE).isDisplayed()
        );
    }
}
