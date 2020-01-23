/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import controle.connexion.ControleConnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matall
 */
public class Classe {
    private String nom;
    private HashSet<Sort> ListeSortClasse = new HashSet<>();
    private String Description;
   
      private static Connection laConnexion =
            ControleConnexion.getLaConnectionStatique();
    
   
    
    public Classe(String n, String d){
        this.Description=d;
        this.nom=n;
   }
    

    public HashSet<Sort> getListeSortClasse() {
        return ListeSortClasse;
    }


    public String getAbreviation() {
        return abreviation;
    }

  
    private String abreviation;

    public String getNom() {
        return nom;
    }

 

 
    
    public Classe(String n,String d,String a){
        if(n!=null){
            this.nom=n;
        }
        if(d != null){
            this.Description = d;
        }
        if(a != null){
            this.abreviation= a;
        }
    }
    public boolean AjouterSortListSortClasse(Sort s){
        return ListeSortClasse.add(s);
    }
    public int getindex() {
        int index =0;
        try {
            Statement state = laConnexion.createStatement();
            String requete = "SELECT idclasse FROM classe where nom = " + "'"+this.nom+"'";
            ResultSet rs = state.executeQuery(requete);
             if(rs.next()){
            index = rs.getInt("idclasse");
             }
        } catch (SQLException ex) {
            Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return index;
    }
    
}
