/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

import controle.connexion.ControleConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import jdr.vue.IDescriptionClasse;
import jdr.vue.IDescriptionReligion;
import jdr.vue.IdescriptionRace;

/**
 *
 * @author matall
 */
public class Personnage implements IDescriptionClasse,IDescriptionReligion,IdescriptionRace {
    
    private int index;
    private String nom;
    private String Sexe;
    private int age;
    private int poids;
    private int taille;
    private String yeux;
    private String cheveux;
    private String TypePeau;
    private String dextrie;
    private int force;
    private int dexterite;
    private int constitution;
    private int intelligence;
    private int sagesse;
    private int charisme;
    private Classe classe;
    private Religion religion;
    private Race race;
    
    public Personnage(){
      this.lireRecupCRUD();
    }

    public int getIndex() {
        return index;
    }

      public String getSexe() {
        return Sexe;
    }
    public ArrayList<Personnage> getLesEnreg() {
        return lesEnreg;
    }
    
    public Personnage(int i,String n, String s,Classe c ,Religion rel , Race r ){
        this.index=i;
        this.nom=n;
        this.Sexe=s;
        this.classe=c;
        this.religion=rel;
        this.race=r;
        
    }
    
      private static Connection laConnexion =
            ControleConnexion.getLaConnectionStatique();
      
     private  ArrayList<Personnage> lesEnreg = new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

 

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }


    public void setAge(int age) {
        this.age = age;
    }

  
    public void setPoids(int poids) {
        this.poids = poids;
    }

   

    public void setTaille(int taille) {
        this.taille = taille;
    }

   

    public void setYeux(String yeux) {
        this.yeux = yeux;
    }

   

    public void setCheveux(String cheveux) {
        this.cheveux = cheveux;
    }

   

    public void setTypePeau(String TypePeau) {
        this.TypePeau = TypePeau;
    }



    public void setDextrie(String dextrie) {
        this.dextrie = dextrie;
    }

    

    public void setForce(int force) {
        this.force = force;
    }

   

    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
    }

 

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

   

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

  

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

   

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
    
        public boolean creerCRUD(int race,int rel,int classe) {
            
        boolean bCreation = false;
        String requete = null;
        try {
            requete = "INSERT INTO personnage (nom,sexe,age,poids,taille,yeux,"
                    + "cheveux,TypePeau,dextrie,forc,dexterite,constitution,"
                    + "intelligence,sagesse,charisme,IdRace,idreligion,idclasse) "
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            
            prepare.setString(1, this.nom);
            prepare.setString(2, this.Sexe);
            prepare.setInt(3, this.age);
            prepare.setDouble(4, this.poids);
            prepare.setInt(5,this.taille);
            prepare.setString(6, this.yeux);
            prepare.setString(7, this.cheveux);
            prepare.setString(8, this.TypePeau);
            prepare.setString(9, this.dextrie);
            prepare.setInt(10, this.force);
            prepare.setInt(11, this.dexterite);
            prepare.setInt(12, this.constitution);
            prepare.setInt(13, this.intelligence);
            prepare.setInt(14, this.sagesse);
            prepare.setInt(15, this.charisme);
            prepare.setInt(16, race);
            prepare.setInt(17, rel);
            prepare.setInt(18, classe);
            prepare.executeUpdate();
            bCreation = true;
            
            
            Statement state = laConnexion.createStatement();
           
           
             ResultSet rs2 =state.executeQuery("SELECT idPerso FROM personnage WHERE nom =" +"'"+ this.nom +"'"
                                               +"AND dexterite = " + this.force);
                
                while (rs2.next()){
                   
                        
                    this.index=rs2.getInt("IdPerso");
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ajout dans la BD non effectué : " 
                    + e.getMessage(), "Problème rencontré", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return bCreation;
    }

        private void lireRecupCRUD() {
        
            int id2 = 0;
            String nom2 = null;
            String sexe2 = null;
            int idclasse = 0;
            int idrace = 0;
            int idrel = 0;
            
            try {
                Statement state = laConnexion.createStatement();
                ResultSet rs = state.executeQuery("SELECT * "
                        + "FROM personnage ORDER BY nom");
                while (rs.next()) {
                    id2 = rs.getInt("idPerso");
                    nom2 = rs.getString("nom");
                    sexe2 = rs.getString("sexe");
                    idclasse= rs.getInt("idclasse");
                    idrace = rs.getInt("IdRace");
                    idrel = rs.getInt("idreligion");
                   
                    
            Classe tempClasse = null ;
            Race tempRace = null;
            Religion tempRel = null;
            Statement state2 = laConnexion.createStatement();
            ResultSet rs2 =state2.executeQuery("SELECT nom FROM classe WHERE idclasse =" + idclasse);
           
            while (rs2.next()){
                String nomclasse= rs2.getString("nom");
                
                
                for (int i = 0; i < ClasseTab.length; i++) {
                    if(ClasseTab[i].getNom().equalsIgnoreCase(nomclasse)){
                      
                        tempClasse=ClasseTab[i];
                        
                    }
                    
                }
            }
            
            Statement state3 = laConnexion.createStatement();
            ResultSet rs3  = state3.executeQuery("SELECT nom FROM race where IdRace = " + idrace);
            while(rs3.next()){
                String nomRace = rs3.getString("nom");
                for (int i = 0; i < TABRACE.length; i++) {
                    if (TABRACE[i].getNom().equalsIgnoreCase(nomRace)) {
                        
                        tempRace=TABRACE[i];
                    }
                    
                }
            }
            Statement state4 = laConnexion.createStatement();
            ResultSet rs4 = state4.executeQuery("SELECT nom FROM religion where idreligion = " + idrel);
            while(rs4.next()){
                String nomRace = rs4.getString("nom");
                
                
                for (int i = 0; i < TABREL.length; i++) {
                    
                    if (nomRace.trim().equalsIgnoreCase(TABREL[i].getNom().trim())) {
                        System.out.println(TABREL[i].getNom());
                        System.out.println("jdr.modele.Personnage.lireRecupCRUD()" +"passage ici");
                        tempRel=TABREL[i];
                    }
                    
                }
            }
                   
            lesEnreg.add(new Personnage(id2, nom2, sexe2, tempClasse, tempRel,tempRace));

                               }
            state.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,
                        "Problème rencontré : " + e.getMessage(),
                        "Résultat", JOptionPane.ERROR_MESSAGE);
            }
            
          
    } 
    
 
    
     public boolean modifierCRUD(String n,String s,int a,int p,int t,String c,String y,String tP,String d,int idperso)
     {
        boolean bCreation = false;
        String requete = null;
        try {
            requete = "UPDATE personnage SET"
                    + " nom = ?,"
                    + " sexe = ?,"
                    + " age = ?, "
                    + " poids = ?,"
                    + " taille = ?,"
                    + " yeux = ?, "
                    + " cheveux  = ?,"
                    + " TypePeau = ?,"
                    + " dextrie =  ?"
                    + " WHERE idPerso = ? ";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, n);
            prepare.setString(2, s);
            prepare.setInt(3, a);
            prepare.setInt(4, p);
            prepare.setInt(5, t);
            prepare.setString(6, c);
            prepare.setString(7, y);
            prepare.setString(8, tP);
            prepare.setString(9, d);
            prepare.setInt(10, idperso);
            prepare.executeUpdate();
            prepare.close();
            bCreation = true;
            System.out.println("truesdozefio");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Ajout dans la BD non effectué : "
                    + e.getMessage(), "Problème rencontré",
                    JOptionPane.ERROR_MESSAGE);
        }
        return bCreation;
    }
    
      public boolean supprimerCRUD(String vCode) {
        boolean bSuppression = true;
        String requete = null;
         System.out.println("jdr.modele.Personnage.supprimerCRUD()");
        
       
            try {
              
                requete = "DELETE  FROM personnage"
                        + " WHERE idPerso = '" + vCode + "'";
                Statement state = laConnexion.createStatement();
                int nbEnregSup = state.executeUpdate(requete);

                state.close();

                if (nbEnregSup == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Aucun enregistrement correspondant.",
                            "Résultat", JOptionPane.ERROR_MESSAGE);
                    bSuppression=false;
                }
            } catch (SQLException e) {
                bSuppression = false;
                JOptionPane.showMessageDialog(null,
                        "Aucune suppression effectuée dans la BD : "
                        + e.getMessage(),
                        "Problème rencontré", JOptionPane.ERROR_MESSAGE);
            
        }
        return bSuppression;
    } 
     
    }
    

