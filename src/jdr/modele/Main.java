/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matall
 */
public class main {
      public static void main(String args[]) throws IOException {
      
          
          ManuelDeSorts temps= new ManuelDeSorts();
          temps.ObtenirDonnéesSort();
          //temps.AfficherManuel();
        temps.ecrireDansFichierHTML();
         
      }
      
              
}
