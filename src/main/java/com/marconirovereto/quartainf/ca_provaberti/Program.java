/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconirovereto.quartainf.ca_provaberti;

import com.marconirovereto.quartainf.ca_provaberti.fantacalcio.*;
import static com.marconirovereto.quartainf.ca_provaberti.fantacalcio.Metodi.*;

/**
 *
 * @author Nico
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Squadra squadra1 = new Squadra("Los Angeles Lakers");
        Squadra squadra2 = new Squadra("Miami Heat");
        
        inserisciAllenatore("Mr.Ammuffito",squadra1);
        inserisciAllenatore("Amadeus", squadra2);
                
        inserisciGiocatore("Gianni Morandi",1,squadra1);
        inserisciGiocatore("Enrico Ruggeri",92,squadra1);
        inserisciGiocatore("Patty Pravo",99,squadra1);
        inserisciGiocatore("Ornella Vanoni",23,squadra1);
        inserisciGiocatore("Orietta Berti",52,squadra1);
        
        
        inserisciGiocatore("Raffaele Gradenigo",3,squadra2);
        inserisciGiocatore("Jebediah Gocciole",18,squadra2);
        inserisciGiocatore("Joe Salyn",44,squadra2);
        inserisciGiocatore("Roo Steca",22,squadra2);
        inserisciGiocatore("Belandi Gabibbo",69,squadra2);

        
        System.out.println(squadra1.getFormazione());
        System.out.println("\n");
        System.out.println(squadra2.getFormazione());
        
        
    }
    
}
