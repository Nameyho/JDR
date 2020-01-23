/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author matall
 */
public class ManuelDeSorts implements IClasses{
    
    
    private TreeSet<Sort> manuelSort = new TreeSet();
    private TreeSet<String> ListeSortsString = new TreeSet();
    
    
    private String[] lienSorts= {
        "http://www.pathfinder-fr.org/Wiki/Pathfinder-RPG.Liste%20des%20sorts.ashx"
//        "http://www.pathfinder-fr.org/Wiki/Pathfinder-RPG.Liste%20des%20sorts%20(fin).ashx",
//        "http://www.pathfinder-fr.org/Wiki/Pathfinder-RPG.Liste%20des%20sorts%20(suite).ashx"
    };
    private URL url;
    private InputStream is = null;
    private BufferedReader br;
    private String line = "";
    
    
    
    public boolean AjouterSortManuel(Sort s){
        return manuelSort.add(s);
    }
    
    // cette methode reçoit un lien en parametre 
    //et la connection se fait et renvoie un bufferedreader
    public BufferedReader etablirConnection(String lien) {

		try {
			url = new URL(lien);
			is = url.openStream(); // throws an IOException
			this.br = new BufferedReader(new InputStreamReader(is));
		} catch (MalformedURLException mue) {
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (is != null) {
				// is.close();
			}
		}
		return br;
	}
    // cette méthode a été faite pour remplir la liste manueldesort
    public void ObtenirDonnéesSort(){
      
         boolean titre =false;
         ArrayList<String> classeliste = new ArrayList<String>();
         String t = "";
        for (int i = 0; i < lienSorts.length; i++) {
            try {
                String lienS = lienSorts[i];
                Sort sort = new Sort();
                this.etablirConnection(lienS);
                //lecture des différentes ligne du bufferedreader avec la boucle while
                while ((line = br.readLine()) != null) {
                    //filtrage des lignes
                    if (line.contains("</a></h2><ul><li><b><i><a")) {
                        //je split la ligne avec le chevron
                       String[] lineTab =  line.split("<");
                      
                        for (int j = 0; j < lineTab.length; j++) {
                           //deuxiéme boucle afin de travaille
                           //sur le tableau obtenu sur la variable line
                            String string = lineTab[j];
                            if(string.contains("a class=\"pagelink")&& !(string.contains("Liste des")))
                                
                                string = lineTab[j];
                         
                            if((string.contains("pagelink"))){
                                 
                                   
                                //la description étant le dernier attribut à être
                                //attribué dans l'objet sort
                                // si il est pas null alors on prendra afin dobtenir
                                // le nom du sort
                                // si il est null alors on splitera encore la phrase
                                
                                    if (sort.getDescription()== null){
                                        if(titre){
                                             String [] lineTab1 =string.split(">");
                                            
                                             String string1 = lineTab1[1];
                                             t= string1;
                                           
                                        
                                                
                                        }else{
                                             String [] lineTab1 =string.split(">");
                             
                                             String string1 = lineTab1[1];
                                             
                                             sort.setNom(string1);
                                             
                                             
                                             titre=true;
                                            
                                             
                                        }
                                    
                                  
                                    
                                     }
                                
                               
                                
                                
                              //vu que la description est la derniére chose entrée 
                              // dans un objet sort alors quand celui-ci est entré
                              // on pourra ajouter le sort au manuel
                              //et créer un nouveau sort
                             if((lineTab.length >1) && (lineTab[j+1].contains("/a>)"))){
                                String description = lineTab[j+1];
                               String[] descriptionTab= description.split("\\)");
                                     if(descriptionTab[1].length()>0){
                                        description = descriptionTab[1].substring(2); 
                                        sort.setDescription(description);
                                       
                                         manuelSort.add(sort);
                                           sort = new Sort();
                                           titre=false;
                                    } 
                              
                                }
                              
                                    
                            } 
                           String temp[] = t.split(" ");
                           t="ecefe";
//                         
                           Classe c = null;  
                           Niveau n = null;
                            
                                                  // vu que certains classe et niveau ne contiennent pas d'espace
                                                  //il faut dont faire gaffe que le tableau splitté contienne
                                                  //bien 2 valeurs
                                                  if(temp.length==2){
                                                  for (int k = 0; k < TABLEAUCLASSE.length; k++) {
                                                  
                                                     if(TABLEAUCLASSE[k].getAbreviation().equalsIgnoreCase(temp[0])){
                                                        
                                                         TABLEAUCLASSE[k].AjouterSortListSortClasse(sort); 
                                                        c= TABLEAUCLASSE[k];
                                                         System.out.println("jdr.ManuelDeSorts.ObtenirDonnéesSort()" + c.getNom() + "1");
                                                         
                                                     }
                                                     
                                                 }
                                                 for (int k = 0; k < TABLEAUNIVEAU.length; k++) {
                                                    boolean o = false;
                                                     for (int p = 0; p < NOMBRE.length; p++) {
                                                         String string1 = NOMBRE[p];
                                                         if(string1.equalsIgnoreCase(temp[1])){
                                                             o=true;
                                                         }
                                                     }
                                                     if(o){
                                                     int niv = Integer.parseInt(temp[1]);
                                                     if(TABLEAUNIVEAU[k].getNiveau()== niv){
                                                     TABLEAUNIVEAU[k].ajouterSort(sort);
                                                     n = TABLEAUNIVEAU[k];
                                                       //  System.out.println("jdr.ManuelDeSorts.ObtenirDonnéesSort()" + n.getNiveau() +  "2 ");
                                                       }    }
                                             
                                                     
                                               
                                         
                                                 }if(c!= null){
                                                     if(n != null){
                                                          sort.ajouterClasseNiveau(c, n);
                                                       //  System.out.println("jdr.ManuelDeSorts.ObtenirDonnéesSort()" + c.getNom() + " "+ n.getNiveau() + " 3");
                                                          c = null;  
                                                          n = null;
                                                     }
                                                     
                                                 }
                                                 
                                                  }}}}
                                
                            
                            
                        
                
                
                //this.ecrireDansFichierHTML();
            } catch (IOException ex) {
                Logger.getLogger(ManuelDeSorts.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
    }
    public void AfficherManuel(){
        for (Sort sort : manuelSort) {
            System.out.println( sort.toString());
        }
    }
   
    
    public void ecrireDansFichierHTML() throws FileNotFoundException, IOException {

		String Repertoire ="JDR.txt";
		FileOutputStream fos = new FileOutputStream(new File(Repertoire));
                String Newligne = System.getProperty("line.separator");
//		String HtmlEntete = "<!DOCTYPE html>";
//		String head = "<head>";
//		String headFin = "</head>";
//		String meta = "<meta charset=\"utf-8\" />";
//
//		byte[] HtmlEnteteByte = HtmlEntete.getBytes();
//		byte[] headByte = head.getBytes();
//		byte[] headByteF = headFin.getBytes();
//		byte[] metaB = meta.getBytes();
//
//		fos.write(HtmlEnteteByte);
//		fos.write(headByte);
//		fos.write(metaB);
//		fos.write(headByteF);
//                
//                byte[] lineB = line.getBytes();
//		fos.write(lineB);
//                
                 for (Sort sort : manuelSort) {
               String t =   sort.toString() + Newligne ;
               byte[] tb = t.getBytes();
               fos.write(tb);
                 }




		fos.close();
		br.close();
    }}

