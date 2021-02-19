package com.marconirovereto.quartainf.ca_provaberti.fantacalcio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Nico
 */
public class Metodi {
    
    public static void creaSquadra(){
        
    }


    public static void inserisciAllenatore(String nome, Squadra squadra){
        Allenatore allen1 =  new Allenatore(nome,squadra);
        squadra.addAllenatore(allen1);
    }
    
    public static void inserisciGiocatore(String nomeCognome, int numeroMaglia, Squadra squadra){
        Giocatore giocatore = new Giocatore(nomeCognome,numeroMaglia,squadra);
        squadra.addGiocatore(giocatore);
    }
}
