package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.BarraNavegacionPage.DESPLEGAGLE_AYUDA;
import static co.com.falabella.pages.DesplegableDeAyudaPage.BOTON_HORARIOS;
import static co.com.falabella.pages.DetailsHorariosHomecenterMedellinPage.DETALLES_HORARIOS_MEDELLIN;
import static co.com.falabella.pages.FalabellaBienvenidaPage.BOTON_SKIP_BIENVENIDA;
import static co.com.falabella.pages.HomecenterHorariosPage.HORARIOS_MEDELLIN;
import static co.com.falabella.pages.HorariosTiendasPage.BOTON_HORARIO_HOMECENTER;

public class HorarioTiendaHomecenterStepDefinitions {
    @Dado("que {actor} necesita los horarios de las tiendas homecenter en Medellin")
    public void accederHorarioTiendas(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SKIP_BIENVENIDA),
                MoveMouse.to(DESPLEGAGLE_AYUDA),
                Click.on(BOTON_HORARIOS)


        );


    }
    @Cuando("{actor} accede a los horarios de tiendas de homecenter")
    public void seleccionarHorariosHomecenter(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_SKIP_BIENVENIDA),
                Click.on(BOTON_HORARIO_HOMECENTER)
        );
    }
    @Entonces("{actor} encontrara los horarios para la ciudad de Medellin")
    public void seleccionarCiudadMedellin(Actor actor) {
        actor.attemptsTo(
                Scroll.to(HORARIOS_MEDELLIN),
                Click.on(HORARIOS_MEDELLIN),
                Ensure.that(DETALLES_HORARIOS_MEDELLIN).isDisplayed()
        );

    }
}
