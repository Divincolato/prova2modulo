/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconirovereto.quartainf.ca_provaberti.fantacalcio;

/**
 *
 * @author Nico
 */
public class Allenatore extends Squadra{
    
    
    public String nomeCognome;
    public int punteggioGiornata;
    
    public Allenatore(String nomeCognome, Squadra squadra){
        super(squadra);
        this.nomeCognome=nomeCognome;
    }
    
    public void setPunteggio(int punteggioGiornata){
        this.punteggioGiornata=punteggioGiornata;
    }
    public int getPunteggio(){
        return punteggioGiornata;
    }
    
    @Override
    public String toString(){
        return "Allenatore: "+nomeCognome;
    }
}
