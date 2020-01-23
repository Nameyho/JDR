/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;


import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author matall
 */
public class Sort implements Comparable<Sort>  {
    
    private String nom;
    private String description;
    private Hashtable<Classe,Niveau> listeClasseNiveau = new Hashtable();
    



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    public Sort(String n,String d ) throws Exception{
        if((n!=null)&&(d!=null)){
           this.nom=n;
           this.description=d;
          
        }else{
        throw new Exception() ;
    }
      }

    Sort() {
       
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }
    
  
    public void ajouterClasseNiveau(Classe c,Niveau n){
        this.listeClasseNiveau.put(c, n);
    }
    
    
    
  

    @Override
    public int compareTo(Sort o1) {
   
       return nom.compareTo(o1.nom);
            }
     @Override
    public String toString(){
        String s ="";
        String Newligne = System.getProperty("line.separator");
        s += this.nom + " à pour description " + this.description + "\n" + Newligne;
       
        s += "---------------------------------------------------------------  \n" + Newligne;
        
         for (Map.Entry<Classe, Niveau> entry : listeClasseNiveau.entrySet()) {
             Classe key = entry.getKey() ;
             Niveau value = entry.getValue();
           
             s += key.getNom()  + " " ;
             s += value.getNiveau()+ " \n"+ Newligne;
            
         }
        s += "---------------------------------------------------------------"+Newligne;
        return s;
        
    }
}

