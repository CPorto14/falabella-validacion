package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.BarraNavegacionPage.BOTON_VENDE_EN_FALABELLA;
import static co.com.falabella.pages.FalabellaBienvenidaPage.BOTON_SKIP_BIENVENIDA;
import static co.com.falabella.pages.PublicaTusProductosPage.SECCION_PUBLICA_TUS_PRODUCTOS;
import static co.com.falabella.pages.VendeEnFalabellaPage.BOTON_PRIMEROS_PASOS;

public class GuiaCrearMarcaStepsDefinitions {
    @Dado("que {actor} busca crear una marca para su negocio")
    public void accederSeccionVendeFalabella(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co/"),
                Click.on(BOTON_SKIP_BIENVENIDA),
                Click.on(BOTON_VENDE_EN_FALABELLA),
                Click.on(BOTON_SKIP_BIENVENIDA)


        );

    }
    @Cuando("{actor} accede a la seccion de primeros pasos")
    public void accederSeccionPrimerosPasos(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRIMEROS_PASOS)
        );

    }
    @Entonces("{actor} encontrara la guia para crear su marca")
    public void guiaCrearMarca(Actor actor) {
        actor.attemptsTo(
                Ensure.that(SECCION_PUBLICA_TUS_PRODUCTOS).isDisplayed()
        );

    }
}
