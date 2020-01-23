/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Win10_ET
 */
public class ModelePersonnage extends AbstractTableModel{
    // pour récupérer les enreg et les mettre dans le modèle
    Personnage instancePersonnage = new Personnage();
    private ArrayList<Personnage> lesDonnees = instancePersonnage.getLesEnreg();
    // les en-têtes de colonnes
    private final String[] lesTitres = {"ID", "Nom", "Sexe", 
                                    "classe", "race","religion"};
    
    @Override
    public int getRowCount() {
         return lesDonnees.size();
    }

    @Override
    public int getColumnCount() {
       return lesTitres.length;  
    }

    // pour accéder à un objet du modèle
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        if (rowIndex >= 0) {
        switch (columnIndex) {
            case 0:
               
                return lesDonnees.get(rowIndex).getIndex();
            case 1:
              
                return lesDonnees.get(rowIndex).getNom();
            case 2:
                
                return lesDonnees.get(rowIndex).getSexe();
            case 3:
              
                return lesDonnees.get(rowIndex).getClasse().getNom();
                
            case 4:
                return lesDonnees.get(rowIndex).getRace().getNom();
                
            
            case 5 :
                return lesDonnees.get(rowIndex).getReligion().getNom();
            default:
                return null;
        }
        }
        return null;
    }
   
    @Override
    public String getColumnName(int columnIndex) {
        return lesTitres[columnIndex];
    }
    
    @Override
     public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 3:
                return String.class;
            case 4:
                return String.class;
            default:
                return Object.class;
        }
    } 
    
    
    // pour obtenir le numéro de ligne à partir du code client
    // lors d’une recherche dans l’ArrayList
    public int getNumLigne(String vCode) {
        String code = "";
        int numLigne = 0;
        
        for (int i = 0; i < lesDonnees.size(); i++) {
            
            code = ""+  lesDonnees.get(i).getIndex();
            if (code.equals(vCode)) {
                numLigne = i;
            }
        }
        return numLigne;
    } 
    
    public void creerMOD(Personnage p){
        lesDonnees.add(p);
    }
    
     public void supprimerMOD( int rowindex){
       lesDonnees.remove(rowindex);
       fireTableRowsDeleted(rowindex, rowindex);
   }
    
    public void modifierMOD(int firstRow, int lastRow, Personnage p){
        // set() attend 2 paramètres,
        // le numéro de ligne
        // et l’objet concerné par les modifications
        lesDonnees.set(firstRow, p);
        fireTableDataChanged();
    }
    
   
    
    public void lireRecupMOD(){
        
    }
    
   

    public void lireRecupMOD(ArrayList<Personnage> nouvelleDonnees) {
        lesDonnees = nouvelleDonnees;
        fireTableDataChanged();
    }

    
}
