package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pages.BarraNavegacionPage.BOTON_SECCION_NOVIOS;
import static co.com.falabella.pages.FalabellaBienvenidaPage.BOTON_SKIP_BIENVENIDA;
import static co.com.falabella.pages.SeccionNoviosPage.BOTON_TIPS_BODAS;
import static co.com.falabella.pages.TipBodasPage.LISTA_TIPS_BODAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TipsBodasStepDefinitions {
    @Dado("que {actor} busca consejos para celebrar a una boda")
    public void accederSeccionNovios(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SKIP_BIENVENIDA),
                Click.on(BOTON_SECCION_NOVIOS),
                Switch.toNewWindow()
        );

    }
    @Cuando("{actor} accede al apartado de tips para bodas")
    public void accederTipsBodas(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_TIPS_BODAS)

        );
    }
    @Entonces("{actor} debe encontrar tips para bodas")
    public void consejosBodas(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LISTA_TIPS_BODAS, isVisible()).forNoMoreThan(3).seconds(),
                Ensure.that(LISTA_TIPS_BODAS).isDisplayed()
        );
    }
}
