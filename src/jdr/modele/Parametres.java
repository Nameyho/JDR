/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;



/**
 *
 * @author Win10_ET
 */
public class Parametres {
    private String nomUtilisateur;
    private String motDePasse;
    private String serveurBD;
    private String driverSGBD;

    public Parametres() {
        this.obtenirInfo();
        
        driverSGBD = "org.gjt.mm.mysql.Driver";
        serveurBD = "jdbc:mysql://localhost/jdr";
    }

        public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }  

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getServeurBD() {
        return serveurBD;
    }

    public void setServeurBD(String serveurBD) {
        this.serveurBD = serveurBD;
    }

    public String getDriverSGBD() {
        return driverSGBD;
    }

    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }
    
    //on va rechercher les infos de connexion dans le fichier texte
    public void obtenirInfo(){
        try{
       //ouverture du fichier
       URL url = getClass().getResource("infoconnection.txt");
       File file = new File(url.getPath());
       InputStream flux=new FileInputStream(file); 
       InputStreamReader lecture=new InputStreamReader(flux);
       //obtention d'un bufferedreader sur lequel effectuer la boucle while
       BufferedReader buff=new BufferedReader(lecture);
       String ligne;
       while ((ligne=buff.readLine())!=null){
	// affectation des valeurs globales
        this.nomUtilisateur=ligne;
        ligne=buff.readLine();
        this.motDePasse=ligne;
}
       //fermeture de la connection
buff.close(); 
}		
catch (Exception e){
System.out.println(e.toString());
}
    }

    
}
