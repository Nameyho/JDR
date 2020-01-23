/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdr.vue;

import jdr.modele.Religion;
/**
 *
 * @author mathi
 */
public interface IDescriptionReligion {
    
    
    final String[] RELDESLIEN = {
"Abadar","Abadar est connu pour être un dieu patient d''alignement Loyal Neutre. Dictature ou Démocratie, peu lui importe tant que l''élan civilisateur étend l''influence des villes et de la loi sur tout Golarion. On le surnomme : Le maître du premier coffre-fort (Master of the First Vault ), Le juge des dieux (Judge of the Gods)","/images/Abadar.jpg",
"Asmodéus","Asmodéus est le plus puissant des neuf archi-diables qui règnent sur l''Enfer, et le seul à revendiquer un statut de divinité. Il est le maître des contrats, et c''est lui qui créa le contrat entre les forces à l''origine du monde. Ses fidèles pensent qu''il existe un vice caché dans ce contrat qui libèrera les armées du prince des ténèbres sur le monde.","/images/Asmodeus.jpg",
"Calistria","Calistria est une déesse aux mille visages et qui a de multiples desseins, notamment la luxure et la vengeance. Les elfes la tiennent en grand respect car pour eux elle incarne les us et coutumes de leur race.","/images/Calistria.jpg",
"Cayden Cailéan","Ne laisse pas les règles t''empêcher de jouir des belles choses de la vie."

+"Cayden Cailéan est le saint patron des aventuriers, des philanthropes, des fêtards et des combattants de la liberté. ","/images/Cayden_Cailéan.jpg",
"Desna","Que chaque rêve soit une étoile brillante dans l''obscurité de la nuit, et qu''il éclaire ta journée"+

"Desna est une des plus anciennes divinités, et elle a peu changé depuis l''aube de la civilisation. Elle habite dans un palais appelé Cynosure, que l''on peut voir dans le ciel, la nuit, au nord. C''est l''étoile autour de laquelle dansent toutes les autres.","/images/Desna.jpg",
"Érastil","Érastil est un des plus anciens dieux à l''œuvre en Avistan. Sa religion date d''avant l''âge des Ténèbres quand de petites communautés agricoles et des rassemblements de chasseurs le priaient pour des récoltes abondantes et des chasses réussies. C''est un dieu de la chasse et de l''agriculture qui préfère montrer la voie à suivre à ses disciples au travers d''exemples simples plutôt que par des sermons.","/images/Érastil.jpg",
"Gorum","Gorum est le seigneur des batailles, le père du conflit qui ne prend plaisir que dans la guerre et l''affrontement","/images/Gorum.jpg",
"Gozreh","Gozreh est une divinité duale. Il est le silence de la forêt, le calme de la nature, la douceur d''une brise d''été. Elle est aussi inconstante comme la mer sous la tempête, le typhon ou la grêle. Gozreh est la nature, sous tout ses aspects.","/images/Gozreh.jpg",
"Iomédae","La justice est l''amour guidé par la lumière. Iomédae est la déesse de la justice, du courage et de l''honneur. Ayant été le héraut d''Aroden, elle a récupéré nombres de ses serviteurs azlantes à sa mort. Elle continue de poursuivre ses idéaux d''honneur et de droiture en luttant contre le mal et en défendant le bien.","/images/Iomédae.jpg",
"Irori","Irori est le dieu de l''ultime perfection de soi, du dépassement et de la sagesse infinie. Ses adeptes affirment qu''il a atteint l''ultime perfection dans l''équilibre du corps et de l''esprit. Il est l''un des dieux principaux, mais pas majeurs, du panthéon Vudra.","/images/Irori.jpg",
"Lamashtu","Des milliers de races d’humanoïdes monstrueux considèrent Lamashtu comme leur mère procréatrice. Par exemple, les gnolls sont issus selon eux de l’accouplement de Lamashtu avec une hyène qu’elle aurait fait prince. Toutes ces races la vénèrent et craignent sa colère. Elle ne manque pas de la faire sentir sur ses adorateurs notamment au travers de leurs cauchemars.","/images/Lamashtu.jpg",
"Néthys","Néthys est l''ancien dieu de la magie. Binaire, il est autant le divin protecteur du monde et de la féérie, protégeant les races pensantes de sa paume, que l''abominable pratiquant d''Arcane interdite, attirant pouvoirs magiques et saignant le monde jusqu''à sa totale destruction.","/images/Néthys.jpg",
"Norgorber","Norgorber est le dieu des voleurs et des assassins, ainsi que le gardien des secrets. Il est appelé le faucheur de réputation mais il a bien d''autres noms parmi ses fidèles. Il est une énigme pour la plupart des gens, et ses motivations restent inconnues.","/images/Norgorber.jpg",
"Pharasma","La Dame des tombes est la déesse qui juge toutes les âmes des défunts décédés sur Golarion. Confortablement assise sur un trône gris décoré de crânes, Pharasma choisit la destination des défunts dans l''autre vie, mais ne réserve une place dans son propre cimetière qu''aux âmes des indignes et des blasphémateurs.","/images/Pharasma.jpg",
"Rovagug","Emprisonné depuis l''aube des temps, Rovagug cherche uniquement à détruire la création et les dieux. Ses accès de furie continuelle sont pris pour beaucoup comme la cause du volcanisme et des séismes.","/images/Rovagug.jpg",
"Sarenrae","Que la lumière salutaire du soleil chasse l''obscurité qui est en toi"+

"Connue comme la fleur de l''aube, la flamme guérisseuse, Sarenrae enseigne tempérance et patience dans toutes choses. La compassion et la paix sont ses grandes vertus, et elle croit que tout être sur la voie de la rédemption doit être sauvé.","/images/Sarenrae.jpg",
"Shélyn","Shélyn est la demi-sœur de Zon-Kuthon, le seigneur des ténèbres. Durant de nombreux siècles, Shélyn fut vénérée comme une déesse mineure, protectrice des arts et de la beauté. À la mort de sa mère, la déesse de l''amour, Shélyn reprit le flambeau familial, ainsi que les adorateurs et les libations des fidèles du culte, et fut propulsée au panthéon des divinités majeures de Golarion. Bien que d''origine Taldorienne, le culte de Shélyn est présent dans tous les pays, en particulier le Taldor, le Galt, le Sargava ainsi que la cité état d''Absalom.","/images/Shélyn.jpg",
"Torag","Torag est un dieu stoïque et sérieux qui apprécie l''honneur, les plans et l''acier bien trempé. C''est un dieu distant qui accorde ses pouvoirs à ses prêtres, mais qui laisse ses suivants choisir leur voie dans la vie.","/images/Torag.jpg",
"Urgathoa","Attrape ce que tu peux, déchire le en morceaux et savoure le goût délicat de son sang"+

"Urgathoa est la déesse de la gloutonnerie, des maladies et des morts-vivants. Elle est appelée aussi la Princesse Pâle.","/images/Urgathoa.jpg",
"Zon-Kuthon","Zon-Kuthon est l''abject dieu des tortures, de la souffrance et de la douleur. Il n''existe aucune créature plus mauvaise et plus horrible dans l''univers.","/images/Zon_Kuthon.jpg",

    };
    
    final Religion[] TABREL = {
        new Religion(RELDESLIEN[0],RELDESLIEN[1]),
        new Religion(RELDESLIEN[3],RELDESLIEN[4]),
        new Religion(RELDESLIEN[6],RELDESLIEN[7]),
        new Religion(RELDESLIEN[9],RELDESLIEN[10]),
        new Religion(RELDESLIEN[12],RELDESLIEN[13]),
        new Religion(RELDESLIEN[15],RELDESLIEN[16]),
        new Religion(RELDESLIEN[18],RELDESLIEN[19]),
        new Religion(RELDESLIEN[21],RELDESLIEN[22]),
        new Religion(RELDESLIEN[24],RELDESLIEN[25]),
        new Religion(RELDESLIEN[27],RELDESLIEN[28]),
        new Religion(RELDESLIEN[30],RELDESLIEN[31]),
        new Religion(RELDESLIEN[33],RELDESLIEN[34]),
        new Religion(RELDESLIEN[36],RELDESLIEN[37]),
        new Religion(RELDESLIEN[39],RELDESLIEN[40]),
        new Religion(RELDESLIEN[42],RELDESLIEN[43]),
        new Religion(RELDESLIEN[45],RELDESLIEN[46]),
        new Religion(RELDESLIEN[48],RELDESLIEN[49]),
        new Religion(RELDESLIEN[51],RELDESLIEN[52]),
        new Religion(RELDESLIEN[54],RELDESLIEN[55]),
        new Religion(RELDESLIEN[57],RELDESLIEN[58]),
             
        
    
            };
}
