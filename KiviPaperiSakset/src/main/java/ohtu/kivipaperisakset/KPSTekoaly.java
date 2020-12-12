package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.Tekoaly;

public class KPSTekoaly extends KiviPaperiSakset {

    @Override
    protected String toisenSiirto() {
        Tekoaly tekoaly = new Tekoaly();        
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }      
}