/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import controle.connexion.ControleConnexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author matall
 */
public class Race {
    
        
    private String nom;
   
    private String description;
     private static Connection laConnexion =
            ControleConnexion.getLaConnectionStatique();
    
    public Race(String n,String d){
        this.nom=n;
        this.description=d;
    }

    public String getNom() {
        return nom;
    }

    public int getindex() {
        int index =0;
        System.out.println("jdr.modele.Race.getindex()");
        try {
            Statement state = laConnexion.createStatement();
            String requete = "SELECT IdRace FROM race where nom = " + "'"+this.nom+"'";
            ResultSet rs = state.executeQuery(requete);
             if(rs.next()){
            index = rs.getInt("IdRace");
             }
        } catch (SQLException ex) {
            Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return index;
    }

}
