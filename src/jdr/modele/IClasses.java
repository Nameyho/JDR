/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.modele;

/**
 *
 * @author matall
 */
public interface IClasses {
    
    
    public static final Niveau[] TABLEAUNIVEAU = {
        new Niveau(0),
        new Niveau(1) , 
        new Niveau(2),
        new Niveau(3),
        new Niveau(4),
        new Niveau(5),
        new Niveau(6),
        new Niveau(7),
        new Niveau(8),
        new Niveau(9),
        new Niveau(10),
        new Niveau(11),
        new Niveau(12),
        new Niveau(13),
        new Niveau(14),
        new Niveau(15),
        new Niveau(16),
        new Niveau(17),
        new Niveau(18),
        new Niveau(19),
        new Niveau(20)
        
    };
    
    public static final Classe[] TABLEAUCLASSE = {
        new Classe("Barbare"," un combattant brutal qui provient des frontières de la civilisation","bar"),
        new Classe("Barde","le barde, qui utilise ses capacités ainsi que ses sorts pour donner du courage à ses alliés, troubler ses ennemis et se construire une réputation.","Bard"),
        new Classe("Druide","le druide, à la fois lanceur de sorts vénérant la nature, ami des animaux et métamorphe doué,","Dru" ),
        new Classe("Ensorceleur", "l'ensorceleur, un lanceur de sorts venu au monde avec un don inné pour la magie, qui possède d’étranges et mystérieux pouvoirs,","Ens/Mag"),
        new Classe("Guerrier","le guerrier, un maître en matière d’armes et d’armures de toutes sortes à la fois courageux et vaillant","Gue"),
        new Classe("Magicien","le magicien qui, à force d'étudier sans cesse, parvient à maîtriser la magie et acquiert d'incroyables pouvoirs,","Ens/Mag"),
        new Classe("Moine","le moine, qui étudie les arts martiaux et s’entraîne à faire de son corps sa meilleure arme et sa meilleure défense","Moi"),
        new Classe("Paladin","le paladin, un chevalier à l’armure étincelante, un individu dévoué à la loi et au bien,","Pal"),
        new Classe("Prêtre","Le prêtre qui, fidèle et dévoué à son dieu, peut soigner les blessures, ramener les morts à la vie et attirer sur ses ennemis les foudres divines","Prê"),
        new Classe("Rôdeur","le rôdeur, à la fois pisteur et chasseur, une créature des étendues sauvages qui excelle lorsqu’il s’agit de débusquer ses ennemis jurés, et enfin","Rôd"),
        new Classe("Roublard","le roublard, à la fois voleur et éclaireur, un opportuniste capable de porter des coups terribles contre les ennemis qu’il parvient à surprendre.","Roub")
    };
    
    public static final String[] NOMBRE = {
        "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
            
            
    };
   
    
                }
