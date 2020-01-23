/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import java.util.ArrayList;


/**
 *
 * @author matall
 */
public class Niveau {
    
    private ArrayList<Sort> ListSort = new ArrayList();
    private int niveau ;
   
    
    public Niveau(int i){
        this.niveau=i;
            
        
    }
    public boolean ajouterSort(Sort s){
       return  this.ListSort.add(s);
    }

    public int getNiveau() {
        return niveau;
    }

    
}
