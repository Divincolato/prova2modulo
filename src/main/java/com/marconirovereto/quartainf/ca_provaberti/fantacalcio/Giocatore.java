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
public class Giocatore extends Squadra{
    
    
    public String nomeCognome;
    public int numeroMaglia;
    public int punteggioGiornata;
    
    public Giocatore(String nomeCognome, int numeroMaglia, Squadra squadra){
        super(squadra);
        this.numeroMaglia=numeroMaglia;
        this.nomeCognome=nomeCognome;
    }
    
    
    public void setPunteggio(int punteggioGiornata){
        this.punteggioGiornata=punteggioGiornata;
    }
    
    @Override
    public String toString(){
        return "N°"+numeroMaglia+": "+this.nomeCognome;
    }
}
