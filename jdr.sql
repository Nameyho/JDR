
DROP DATABASE IF EXISTS jdr;

/*SET NAMES 'uft8';*/

CREATE DATABASE jdr; /*CHARACTER SET utf8 COLLATE utf8_general_cl;

*/

/* j'ai mis comme indiqué au cours mais ne veut pas fonctionner dans mon phpmyadmin */
USE jdr;
DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `idclasse` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(2500) DEFAULT NULL,
  `description` varchar(2500) DEFAULT NULL,
  `idarme` int(11) DEFAULT NULL,
  `idcapacite` int(11) DEFAULT NULL,
  `idSort` int(11) DEFAULT NULL,
  PRIMARY KEY (`idclasse`),
  KEY `FK_classe_idarme` (`idarme`),
  KEY `FK_classe_idcapacite` (`idcapacite`),
  KEY `FK_classe_idSort` (`idSort`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;


INSERT INTO `classe` (`idclasse`, `nom`, `description`) VALUES
(1, 'Barbare', 'un combattant brutal qui provient des frontières de la civilisation'),
(2, 'Barde', 'qui utilise ses capacités ainsi que ses sorts pour donner du courage à ses alliés, troubler ses ennemis et se construire une réputation'),
(3, 'Druide', ' à la fois lanceur de sorts vénérant la nature, ami des animaux et métamorphe doué'),
(4, 'Ensorceleur', 'un lanceur de sorts venu au monde avec un don inné pour la magie, qui possède d’étranges et mystérieux pouvoirs'),
(5, 'Guerrier', 'un maître en matière d’armes et d’armures de toutes sortes à la fois courageux et vaillant'),
(6, 'Magicien', 'à force d\'étudier sans cesse, parvient à maîtriser la magie et acquiert d\'incroyables pouvoirs'),
(7, 'Moine', 'qui étudie les arts martiaux et s’entraîne à faire de son corps sa meilleure arme et sa meilleure défense'),
(8, 'Paladin', 'un chevalier à l’armure étincelante, un individu dévoué à la loi et au bien'),
(9, 'prêtre', 'qui, fidèle et dévoué à son dieu, peut soigner les blessures, ramener les morts à la vie et attirer sur ses ennemis les foudres divines'),
(10, 'Rôdeur', 'à la fois pisteur et chasseur, une créature des étendues sauvages qui excelle lorsqu’il s’agit de débusquer ses ennemis jurés, et enfin'),
(11, 'Roublard', ' à la fois voleur et éclaireur, un opportuniste capable de porter des coups terribles contre les ennemis qu’il parvient à surprendre.');

-- --------------------------------------------------------


DROP TABLE IF EXISTS `connait`;
CREATE TABLE IF NOT EXISTS `connait` (
  `idlangue` int(11) NOT NULL,
  `IdRace` int(11) NOT NULL,
  PRIMARY KEY (`idlangue`,`IdRace`),
  KEY `FK_connait_IdRace` (`IdRace`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

DROP TABLE IF EXISTS `langue`;
CREATE TABLE IF NOT EXISTS `langue` (
  `idlangue` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(2500) DEFAULT NULL,
  `description` varchar(2500) DEFAULT NULL,
  PRIMARY KEY (`idlangue`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------


DROP TABLE IF EXISTS `personnage`;
CREATE TABLE IF NOT EXISTS `personnage` (
  `idPerso` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(25) DEFAULT NULL,
  `sexe` varchar(25) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `poids` int(11) DEFAULT NULL,
  `taille` int(11) DEFAULT NULL,
  `yeux` varchar(25) DEFAULT NULL,
  `cheveux` varchar(25) DEFAULT NULL,
  `TypePeau` varchar(25) DEFAULT NULL,
  `dextrie` varchar(25) DEFAULT NULL,
  `forc` int(11) DEFAULT NULL,
  `dexterite` int(11) DEFAULT NULL,
  `constitution` int(11) DEFAULT NULL,
  `intelligence` int(11) DEFAULT NULL,
  `sagesse` int(11) DEFAULT NULL,
  `charisme` int(11) DEFAULT NULL,
  `IdRace` int(11) DEFAULT NULL,
  `idreligion` int(11) DEFAULT NULL,
  `idclasse` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPerso`),
  KEY `FK_personnage_IdRace` (`IdRace`),
  KEY `FK_personnage_idreligion` (`idreligion`),
  KEY `FK_personnage_idclasse` (`idclasse`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;



INSERT INTO `personnage` (`idPerso`, `nom`, `sexe`, `age`, `poids`, `taille`, `yeux`, `cheveux`, `TypePeau`, `dextrie`, `forc`, `dexterite`, `constitution`, `intelligence`, `sagesse`, `charisme`, `IdRace`, `idreligion`, `idclasse`) VALUES
(9, 'matall', 'Femme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Ambidextre', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(10, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(13, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(15, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(16, 'matall', 'Femme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(17, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(19, 'matall', 'Femme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(20, 'matall', 'Femme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(21, 'matall', 'Femme', 25, 72252178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(22, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(23, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(24, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(25, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(26, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(27, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(28, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(29, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(30, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(31, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(32, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(33, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(34, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(35, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(36, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(37, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(38, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(39, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(40, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(41, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(42, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(43, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(44, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(45, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8),
(46, 'matall', 'Homme', 25, 178, 178, 'clair', 'clair', 'rouge', 'Gaucher', 13, 16, 8, 12, 15, 11, 5, 3, 8);

-- --------------------------------------------------------



DROP TABLE IF EXISTS `race`;
CREATE TABLE IF NOT EXISTS `race` (
  `IdRace` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(2500) DEFAULT NULL,
  `description` varchar(2500) DEFAULT NULL,
  PRIMARY KEY (`IdRace`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;



INSERT INTO `race` (`IdRace`, `nom`, `description`) VALUES
(1, 'Demi-elfes', 'Les demi-elfes oscillent souvent entre les deux mondes de leurs parents et mêlent la grâce aux contradictions. Leur héritage dual et leurs dons naturels en font de brillants diplomates et de bons émissaires de la paix, mais ils se laissent souvent envahir par une immense mélancolie et s’isolent en comprenant qu’ils ne font ni partie de la société humaine ni de la société elfique.'),
(2, 'Demi-orques', 'Les demi-orques sont souvent féroces et sauvages, parfois nobles et résolus, et peuvent faire preuve des meilleures qualités comme des pires défauts des deux races qui leur ont donné naissance. Beaucoup de demi-orques luttent pour maîtriser leurs élans bestiaux et incarner les valeurs les plus nobles de l’humanité. Malheureusement, de nombreuses personnes considèrent les demi-orques comme des abominations désespérément dépourvues de tout sens civil ou comme des monstres qui ne méritent ni pitié ni pourparlers.'),
(3, 'Elfes', 'Grands, nobles et souvent hautains, les elfes à la longue espérance de vie sont les maîtres subtils de la nature. Ils excellent dans les arts magiques et utilisent souvent leur lien inné avec la nature pour inventer de nouveaux sorts et fabriquer de merveilleux objets qui, comme leurs créateurs, semblent presque hors d’atteinte des ravages du temps. Les elfes forment une race secrète et souvent introvertie, qui donne parfois l’impression d’être imperméable aux suppliques d’autrui'),
(4, 'Gnomes', 'Ces petites gens exilés originaires de l’étrange monde des fées sont réputés pour être frivoles et excentriques. De nombreux gnomes sont des artisans et des rétameurs capricieux qui fabriquent des objets bizarres alimentés par la puissance de la magie, de l’alchimie ou par leur singulière imagination. Ils ont toujours soif de nouvelles expériences, ce qui leur attire souvent des ennuis.'),
(5, 'Halfelins', 'Les membres de cette race de petite taille tirent leur force de leur famille, de leur communauté et de leur chance, qui semble absolument inépuisable. Leur insatiable curiosité entre souvent en conflit avec leur bon sens, mais ce sont d’éternels optimistes et des opportunistes rusés qui disposent d’un talent incroyable pour se sortir des pires situations.'),
(6, 'Humains', 'Ambitieux, parfois héroïques, mais toujours confiants, les humains sont capables de travailler ensemble pour atteindre des objectifs communs, ce qui fait d’eux une puissance à ne pas négliger. Ils ont une espérance de vie réduite par rapport aux autres races, mais leur énergie sans limites et leurs passions leur permettent d’accomplir beaucoup de choses malgré leur brève existence.'),
(7, 'Nains', 'On pense souvent que ces défenseurs des forteresses montagneuses petits et râblés sont sévères et dépourvus de tout sens de l’humour. Ils sont connus pour extraire les trésors du sol et fabriquer de merveilleux objets métalliques, parfois incrustés de gemmes, et pour avoir une affinité particulière avec les richesses cachées dans les entrailles de la terre. Les nains ont aussi tendance à s’isoler et à se replier sur leurs traditions, au point de sombrer parfois dans la xénophobie.');

-- --------------------------------------------------------


DROP TABLE IF EXISTS `religion`;
CREATE TABLE IF NOT EXISTS `religion` (
  `idreligion` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(2500) DEFAULT NULL,
  `description` varchar(2000) NOT NULL,
  PRIMARY KEY (`idreligion`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;


INSERT INTO `religion` (`idreligion`, `nom`, `description`) VALUES
(3, 'Calistria ', 'Calistria est une déesse aux mille visages et qui a de multiples desseins, notamment la luxure et la vengeance. Les elfes la tiennent en grand respect car pour eux elle incarne les us et coutumes de leur race.'),
(4,  'Cayden Cailéan', 'Ne laisse pas les règles t\'empêcher de jouir des belles choses de la vie.\r\n\r\nCayden Cailéan est le saint patron des aventuriers, des philanthropes, des fêtards et des combattants de la liberté. '),
(5,  'Desna', 'Que chaque rêve soit une étoile brillante dans l\'obscurité de la nuit, et qu\'il éclaire ta journée\r\n\r\nDesna est une des plus anciennes divinités, et elle a peu changé depuis l\'aube de la civilisation. Elle habite dans un palais appelé Cynosure, que l\'on peut voir dans le ciel, la nuit, au nord. C\'est l\'étoile autour de laquelle dansent toutes les autres.'),
(6, 'Érastil', 'Érastil est un des plus anciens dieux à l\'œuvre en Avistan. Sa religion date d\'avant l\'âge des Ténèbres quand de petites communautés agricoles et des rassemblements de chasseurs le priaient pour des récoltes abondantes et des chasses réussies. C\'est un dieu de la chasse et de l\'agriculture qui préfère montrer la voie à suivre à ses disciples au travers d\'exemples simples plutôt que par des sermons.'),
(7,  'Gorum ', 'Gorum est le seigneur des batailles, le père du conflit qui ne prend plaisir que dans la guerre et l\'affrontement.'),
(8,  'Gozreh ', 'Gozreh est une divinité duale. Il est le silence de la forêt, le calme de la nature, la douceur d\'une brise d\'été. Elle est aussi inconstante comme la mer sous la tempête, le typhon ou la grêle. Gozreh est la nature, sous tout ses aspects.'),
(9,  'Iomédae', 'La justice est l\'amour guidé par la lumière. Iomédae est la déesse de la justice, du courage et de l\'honneur. Ayant été le héraut d\'Aroden, elle a récupéré nombres de ses serviteurs azlantes à sa mort. Elle continue de poursuivre ses idéaux d\'honneur et de droiture en luttant contre le mal et en défendant le bien.'),
(10,  'Irori', 'Irori est le dieu de l\'ultime perfection de soi, du dépassement et de la sagesse infinie. Ses adeptes affirment qu\'il a atteint l\'ultime perfection dans l\'équilibre du corps et de l\'esprit. Il est l\'un des dieux principaux, mais pas majeurs, du panthéon Vudra.'),
(11, 'Lamashtu ', 'Des milliers de races d’humanoïdes monstrueux considèrent Lamashtu comme leur mère procréatrice. Par exemple, les gnolls sont issus selon eux de l’accouplement de Lamashtu avec une hyène qu’elle aurait fait prince. Toutes ces races la vénèrent et craignent sa colère. Elle ne manque pas de la faire sentir sur ses adorateurs notamment au travers de leurs cauchemars.'),
(12, 'Néthys', 'Néthys est l\'ancien dieu de la magie. Binaire, il est autant le divin protecteur du monde et de la féérie, protégeant les races pensantes de sa paume, que l\'abominable pratiquant d\'Arcane interdite, attirant pouvoirs magiques et saignant le monde jusqu\'à sa totale destruction.'),
(13, 'Norgorber ', 'Norgorber est le dieu des voleurs et des assassins, ainsi que le gardien des secrets. Il est appelé le faucheur de réputation mais il a bien d\'autres noms parmi ses fidèles. Il est une énigme pour la plupart des gens, et ses motivations restent inconnues.'),
(14,  'Pharasma ', 'La Dame des tombes est la déesse qui juge toutes les âmes des défunts décédés sur Golarion. Confortablement assise sur un trône gris décoré de crânes, Pharasma choisit la destination des défunts dans l\'autre vie, mais ne réserve une place dans son propre cimetière qu\'aux âmes des indignes et des blasphémateurs.'),
(15,  'Rovagug', 'Emprisonné depuis l\'aube des temps, Rovagug cherche uniquement à détruire la création et les dieux. Ses accès de furie continuelle sont pris pour beaucoup comme la cause du volcanisme et des séismes.'),
(16,  'Sarenrae', 'Que la lumière salutaire du soleil chasse l\'obscurité qui est en toi\r\n\r\nConnue comme la fleur de l\'aube, la flamme guérisseuse, Sarenrae enseigne tempérance et patience dans toutes choses. La compassion et la paix sont ses grandes vertus, et elle croit que tout être sur la voie de la rédemption doit être sauvé.'),
(17,  'Shélyn ', 'Shélyn est la demi-sœur de Zon-Kuthon, le seigneur des ténèbres. Durant de nombreux siècles, Shélyn fut vénérée comme une déesse mineure, protectrice des arts et de la beauté. À la mort de sa mère, la déesse de l\'amour, Shélyn reprit le flambeau familial, ainsi que les adorateurs et les libations des fidèles du culte, et fut propulsée au panthéon des divinités majeures de Golarion. Bien que d\'origine Taldorienne, le culte de Shélyn est présent dans tous les pays, en particulier le Taldor, le Galt, le Sargava ainsi que la cité état d\'Absalom.'),
(18,  'Torag ', 'Torag est un dieu stoïque et sérieux qui apprécie l\'honneur, les plans et l\'acier bien trempé. C\'est un dieu distant qui accorde ses pouvoirs à ses prêtres, mais qui laisse ses suivants choisir leur voie dans la vie.'),
(19,  'Urgathoa ', 'Attrape ce que tu peux, déchire le en morceaux et savoure le goût délicat de son sang\r\n\r\nUrgathoa est la déesse de la gloutonnerie, des maladies et des morts-vivants. Elle est appelée aussi la Princesse Pâle.'),
(20,  'Zon-Kuthon', 'Zon-Kuthon est l\'abject dieu des tortures, de la souffrance et de la douleur. Il n\'existe aucune créature plus mauvaise et plus horrible dans l\'univers.');

-- --------------------------------------------------------


DROP TABLE IF EXISTS `sort`;
CREATE TABLE IF NOT EXISTS `sort` (
  `idSort` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idSort`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE `classe`
  ADD CONSTRAINT `FK_classe_idsort` FOREIGN KEY (`idSort`) REFERENCES `sort` (`idSort`);
  
  


ALTER TABLE `connait`
  ADD CONSTRAINT `FK_connait_IdRace` FOREIGN KEY (`IdRace`) REFERENCES `race` (`IdRace`),
  ADD CONSTRAINT `FK_connait_idlangue` FOREIGN KEY (`idlangue`) REFERENCES `langue` (`idlangue`);


ALTER TABLE `personnage`
  ADD CONSTRAINT `FK_personnage_IdRace` FOREIGN KEY (`IdRace`) REFERENCES `race` (`IdRace`),
  ADD CONSTRAINT `FK_personnage_idclasse` FOREIGN KEY (`idclasse`) REFERENCES `classe` (`idclasse`),
  ADD CONSTRAINT `FK_personnage_idreligion` FOREIGN KEY (`idreligion`) REFERENCES `religion` (`idreligion`);



