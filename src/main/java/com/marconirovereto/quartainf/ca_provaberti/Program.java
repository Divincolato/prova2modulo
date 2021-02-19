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
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            Scanner scan = new Scanner(System.in);
        
        
        Squadra squadra1 = new Squadra("Los Angeles Lakers");
        Squadra squadra2 = new Squadra("Miami Heat");
        
        inserisciAllenatore("Biagio Antonacci",squadra1);
        inserisciAllenatore("Amadeus", squadra2);
                
        inserisciGiocatore("Gianni Morandi",1,squadra1);
        inserisciGiocatore("Enrico Ruggeri",92,squadra1);
        inserisciGiocatore("Patty Pravo",99,squadra1);
        inserisciGiocatore("Ornella Vanoni",23,squadra1);
        inserisciGiocatore("Orietta Berti",52,squadra1);
        
        
        inserisciGiocatore("Raffaele Gradenigo",3,squadra2);
        inserisciGiocatore("Giovanni Salin",5,squadra2);
        inserisciGiocatore("Fabrizio De Andrè",44,squadra2);
        inserisciGiocatore("Lucio Battisti",22,squadra2);
        inserisciGiocatore("Giovanni Salin II",55,squadra2);

        System.out.println("Formazione di squadra1");
        System.out.println(squadra1.getFormazione());
        System.out.println("\n");
        
        System.out.println("Formazione di squadra2");
        System.out.println(squadra2.getFormazione());
        
        System.out.println("\n");
        //serializzazione oggetto
        System.out.println("Provo la serializzazione e deserializzazione di squadra1");
        
        try {
            System.out.println("Inserisci il nome della squadra da salvare:");
            String file = scan.next();
            file+=".ser";
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(squadra1);
            out.close();
            System.out.println("Squadra serializzata correttamente");
            
        } catch (Exception e) {
            System.out.println("Eccezione "+e.getMessage());
        }
        
        //deserializzazione oggetto
        Squadra squadra3 = new Squadra();
        try {
            System.out.println("Inserisci il nome della squadra da caricare:");
            String file = scan.next();
            file+=".ser";
            FileInputStream fileIn = new FileInputStream("squadra.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            squadra3 = (Squadra) in.readObject();
            System.out.println("Squadra deserializzata correttamente");
        } catch (Exception e) {
            
            System.out.println("Eccezione "+e.getMessage());
        }
        
        System.out.println("Formazione della squadra passata dall'interfaccia serializable\n"+squadra3.getFormazione());
        System.out.println(squadra3.nomeSquadra);
    }
    
}
