/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconirovereto.quartainf.ca_provaberti;

import com.marconirovereto.quartainf.ca_provaberti.fantacalcio.*;
import static com.marconirovereto.quartainf.ca_provaberti.fantacalcio.Metodi.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        //serializzazione oggetto
        try {
            FileOutputStream fileOut = new FileOutputStream("squadra.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(squadra1);
            out.close();
            System.out.println("squadra serializzata ciao giovanni");
            
        } catch (Exception e) {
            System.out.println("Eccezione "+e.getMessage());
        }
        
        //deserializzazione oggetto
        Squadra squadra3 = new Squadra();
        try {
            FileInputStream fileIn = new FileInputStream("squadra.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            squadra3 = (Squadra) in.readObject();
            System.out.println("Squadra deserializzata correttamente spero ciao");
        } catch (Exception e) {
            
            System.out.println("Eccezione "+e.getMessage());
        }
        
        System.out.println(squadra3.getFormazione());
        System.out.println(squadra3.nomeSquadra);
    }
    
}
