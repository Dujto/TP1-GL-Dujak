package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {     // classe qui modelise notre systeme 
  
    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) { // constructeur de la classe 
        super();     
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {   methode pour creer un systeme de l'hopital 
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() { //retourne la liste de toutes les requetes faites
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {  // methode qui fait une liste des requetes 
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {  //methode qui permet de recevoir une requete et faire tout les traitements nécessaires 
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {    // methode pour analyser les requetes
        
        return "requête analysée";
    }

    private String comparerDonnes() {    // methode qui compare les données 
        
        return "Cluster trouvé";
    }

}
