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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matall
 */
public class Religion {
    
    private String nom;
    private String description;
      private static Connection laConnexion =
            ControleConnexion.getLaConnectionStatique();
    

    
    public Religion(String n, String d){
       this.nom=n;
       this.description=d;
    }
    
    
    public String getNom() {
        return nom;
    }

    
    public int getindex() {
        int index =0;
        try {
            Statement state = laConnexion.createStatement();
            String requete = "SELECT idreligion FROM religion where nom = " +"'"+ this.nom+"'";
            ResultSet rs = state.executeQuery(requete);
            if(rs.next()){
              index = rs.getInt("idreligion");  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return index;
    }
}
