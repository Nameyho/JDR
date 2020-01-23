/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.vue;

import jdr.modele.Classe;

/**
 *
 * @author mathi
 */
public interface IDescriptionClasse {
     

    
      final String[] CLASSEDESLIENS ={
        "Barbare","un combattant brutal qui provient des frontières de la civilisation","/images/Barbare.jpg",
        "Barde","qui utilise ses capacités ainsi que ses sorts pour donner du courage à ses alliés, troubler ses ennemis et se construire une réputation","/images/Barde.jpg",
        "Druide"," à la fois lanceur de sorts vénérant la nature, ami des animaux et métamorphe doué","/images/Druide.jpg",
        "Ensorceleur","un lanceur de sorts venu au monde avec un don inné pour la magie, qui possède d’étranges et mystérieux pouvoirs","/images/Ensorceleur.jpg",
        "Guerrier","un maître en matière d’armes et d’armures de toutes sortes à la fois courageux et vaillant","/images/Guerrier.jpg",
        "Magicien","à force d'étudier sans cesse, parvient à maîtriser la magie et acquiert d'incroyables pouvoirs,","/images/Magicien.jpg",
        "Moine","qui étudie les arts martiaux et s’entraîne à faire de son corps sa meilleure arme et sa meilleure défense,","/images/Moine.jpg",
        "Paladin","un chevalier à l’armure étincelante, un individu dévoué à la loi et au bien,","/images/Paladin.jpg",
        "prêtre","qui, fidèle et dévoué à son dieu, peut soigner les blessures, ramener les morts à la vie et attirer sur ses ennemis les foudres divines,","/images/prêtre.jpg",
        "Rôdeur","à la fois pisteur et chasseur, une créature des étendues sauvages qui excelle lorsqu’il s’agit de débusquer ses ennemis jurés, et enfin","/images/rôdeur.jpg",
        "Roublard"," à la fois voleur et éclaireur, un opportuniste capable de porter des coups terribles contre les ennemis qu’il parvient à surprendre.","/images/Roublard.jpg"
    };
     
      Classe barbare = new Classe(IDescriptionClasse.CLASSEDESLIENS[0],IDescriptionClasse.CLASSEDESLIENS[1]);  
      Classe Barde = new Classe(IDescriptionClasse.CLASSEDESLIENS[3],IDescriptionClasse.CLASSEDESLIENS[4]);
      Classe Druide= new Classe(IDescriptionClasse.CLASSEDESLIENS[6],IDescriptionClasse.CLASSEDESLIENS[7]);
      Classe Ensorceleur =    new Classe(IDescriptionClasse.CLASSEDESLIENS[9],IDescriptionClasse.CLASSEDESLIENS[10]);
      Classe Guerrier =    new Classe(IDescriptionClasse.CLASSEDESLIENS[12],IDescriptionClasse.CLASSEDESLIENS[13]);
      Classe Magicien =    new Classe(IDescriptionClasse.CLASSEDESLIENS[15],IDescriptionClasse.CLASSEDESLIENS[16]);
      Classe Moine =    new Classe(IDescriptionClasse.CLASSEDESLIENS[18],IDescriptionClasse.CLASSEDESLIENS[19]);
      Classe Paladin =    new Classe(IDescriptionClasse.CLASSEDESLIENS[21],IDescriptionClasse.CLASSEDESLIENS[22]);
      Classe Prêtre =    new Classe(IDescriptionClasse.CLASSEDESLIENS[24],IDescriptionClasse.CLASSEDESLIENS[25]);
      Classe rôdeur =    new Classe(IDescriptionClasse.CLASSEDESLIENS[27],IDescriptionClasse.CLASSEDESLIENS[28]);
      Classe Roublard=     new Classe(IDescriptionClasse.CLASSEDESLIENS[30],IDescriptionClasse.CLASSEDESLIENS[31]);

      
      
      
      
            final Classe[] ClasseTab = {barbare,Barde,Druide,Ensorceleur,Guerrier,Magicien,Moine,Paladin,Prêtre,rôdeur,Roublard};
          
                    
          
      
    
}
