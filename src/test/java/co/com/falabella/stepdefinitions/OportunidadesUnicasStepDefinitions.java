package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pages.BarraNavegacionPage.DESPLEGABLE_TARJETAS_Y_CUENTAS;
import static co.com.falabella.pages.DesplegableTarjetasCuentasPage.BOTON_OPORTUNIDADES_UNICAS;
import static co.com.falabella.pages.FalabellaBienvenidaPage.BOTON_SKIP_BIENVENIDA;
import static co.com.falabella.pages.OportunidadesUnicasPage.BOTON_PAGINA2;
import static co.com.falabella.pages.OportunidadesUnicasPage.PRODUCTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OportunidadesUnicasStepDefinitions {
    @Dado("que {actor} busca comprar productos con descuento")
    public void desplegableTarjetasYCuentas(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SKIP_BIENVENIDA),
                MoveMouse.to(DESPLEGABLE_TARJETAS_Y_CUENTAS)
        );
    }
    @Cuando("{actor} accede a la seccion de oportunidades unicas")
    public void seccionOportunidadesUnicas(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_OPORTUNIDADES_UNICAS)
        );
    }
    @Entonces("{actor} encontrara productos en la pagina 2")
    public void buscarXElementosEnPag2(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_SKIP_BIENVENIDA),
                Click.on(BOTON_PAGINA2),
                WaitUntil.the(PRODUCTOS, isVisible()).forNoMoreThan(3).seconds());
    }
}
