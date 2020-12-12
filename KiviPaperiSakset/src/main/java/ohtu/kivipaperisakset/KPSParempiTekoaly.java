package ohtu.kivipaperisakset;

import java.util.Scanner;

import ohtu.kivipaperisakset.Tekoaly;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KiviPaperiSakset {

    @Override
    protected String toisenSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);       
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    } 
}
