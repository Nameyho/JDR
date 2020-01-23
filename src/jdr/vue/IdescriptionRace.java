/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.vue;

import java.util.ArrayList;
import javax.swing.JComboBox;
import jdr.modele.Race;

/**
 *
 * @author matall
 */
public interface IdescriptionRace {
    
    final String[] NOMRACE = {
    "Demi-elfes",
    "Demi-orques",
    "Elfes",
    "Halfelins",
    "Humains",
    "Gnomes",
    "Nains"
    };
    
      final String[] NOMSTAT ={
         "Force" , 
         "Dexterite",
          "Constitution",
          "Intelligence",
          "Sagesse",
          "charisme"
         
      };
     
     

  
    
     
     
    final String[] RACEDESLIENS ={
        "Demi-elfes","Les demi-elfes oscillent souvent entre les deux mondes de leurs parents et mêlent la grâce aux contradictions. Leur héritage dual et leurs dons naturels en font de brillants diplomates et de bons émissaires de la paix, mais ils se laissent souvent envahir par une immense mélancolie et s’isolent en comprenant qu’ils ne font ni partie de la société humaine ni de la société elfique.","/images/Demi-elfe.jpg",
        "Demi-orques","Les demi-orques sont souvent féroces et sauvages, parfois nobles et résolus, et peuvent faire preuve des meilleures qualités comme des pires défauts des deux races qui leur ont donné naissance. Beaucoup de demi-orques luttent pour maîtriser leurs élans bestiaux et incarner les valeurs les plus nobles de l’humanité. Malheureusement, de nombreuses personnes considèrent les demi-orques comme des abominations désespérément dépourvues de tout sens civil ou comme des monstres qui ne méritent ni pitié ni pourparlers.","/images/demi-orque.jpg",
        "Elfes","Grands, nobles et souvent hautains, les elfes à la longue espérance de vie sont les maîtres subtils de la nature. Ils excellent dans les arts magiques et utilisent souvent leur lien inné avec la nature pour inventer de nouveaux sorts et fabriquer de merveilleux objets qui, comme leurs créateurs, semblent presque hors d’atteinte des ravages du temps. Les elfes forment une race secrète et souvent introvertie, qui donne parfois l’impression d’être imperméable aux suppliques d’autrui.","/images/Elfes.jpg",
        "Gnomes","Ces petites gens exilés originaires de l’étrange monde des fées sont réputés pour être frivoles et excentriques. De nombreux gnomes sont des artisans et des rétameurs capricieux qui fabriquent des objets bizarres alimentés par la puissance de la magie, de l’alchimie ou par leur singulière imagination. Ils ont toujours soif de nouvelles expériences, ce qui leur attire souvent des ennuis.","/images/Gnomes.jpg",
        "Halfelins","Les membres de cette race de petite taille tirent leur force de leur famille, de leur communauté et de leur chance, qui semble absolument inépuisable. Leur insatiable curiosité entre souvent en conflit avec leur bon sens, mais ce sont d’éternels optimistes et des opportunistes rusés qui disposent d’un talent incroyable pour se sortir des pires situations.","/images/Halfelins.jpg",
        "Humains","Ambitieux, parfois héroïques, mais toujours confiants, les humains sont capables de travailler ensemble pour atteindre des objectifs communs, ce qui fait d’eux une puissance à ne pas négliger. Ils ont une espérance de vie réduite par rapport aux autres races, mais leur énergie sans limites et leurs passions leur permettent d’accomplir beaucoup de choses malgré leur brève existence.","/images/Humains.jpg",
        "Nains","On pense souvent que ces défenseurs des forteresses montagneuses petits et râblés sont sévères et dépourvus de tout sens de l’humour. Ils sont connus pour extraire les trésors du sol et fabriquer de merveilleux objets métalliques, parfois incrustés de gemmes, et pour avoir une affinité particulière avec les richesses cachées dans les entrailles de la terre. Les nains ont aussi tendance à s’isoler et à se replier sur leurs traditions, au point de sombrer parfois dans la xénophobie.","/images/Nains.jpg"
        
    };
    
    final Race[] TABRACE ={
    new Race(RACEDESLIENS[0],RACEDESLIENS[1]),
    new Race(RACEDESLIENS[3],RACEDESLIENS[4]),
    new Race(RACEDESLIENS[6],RACEDESLIENS[7]),
    new Race(RACEDESLIENS[9],RACEDESLIENS[10]),
    new Race(RACEDESLIENS[12],RACEDESLIENS[13]),
    new Race(RACEDESLIENS[15],RACEDESLIENS[16]),
    new Race(RACEDESLIENS[18],RACEDESLIENS[19]),
        
};
    //force,dexterité,constitution,intelligence,sagesse,charisme,au choix 
    final int[][] BONUSRACIAUX = {
         {0,0,0,0,0,0,+2},
         {0,0,0,0,0,0,+2},
         {0,2,-2,2,0,0,0},
         {-2,2,0,0,0,2,0},
         {0,0,0,0,0,0,+2},
         {-2,0,+2,0,0,+2,0},
         {0,0,2,0,2,-2,0}
         
    };
    
}
