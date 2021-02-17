/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconirovereto.quartainf.ca_provaberti.fantacalcio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class Squadra implements Serializable{
    
    public String nomeSquadra;
    //array contenente i componenti della squadra 
    public ArrayList<Giocatore> formazione = new ArrayList<>();
    public Allenatore all;
    
    public Squadra(){
        
    }
    
    public Squadra(Squadra squadra){
        this.nomeSquadra=squadra.nomeSquadra;
    }
    
    public Squadra(String nomeSquadra){
        this.nomeSquadra=nomeSquadra;
    }
    
    //metodo per aggiungere giocatore all'array
    public void addGiocatore(Giocatore gioc){
         formazione.add(gioc);
    }
    public void addAllenatore(Allenatore all){
        this.all=all;
    }
    public String getFormazione(){
        String tmp="";
        tmp+="Formazione della squadra: \n"+nomeSquadra;
        //tmp+="\n"+all.toString();
        
        for (Giocatore giocatore : formazione) {
            
            tmp+="\n"+giocatore;
            }
        
        return tmp;
    }
    
    
    public String toString(){
         return "Nome Squadra: "+nomeSquadra;
    }


    

    

}
