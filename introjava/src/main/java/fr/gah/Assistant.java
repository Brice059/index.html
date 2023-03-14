package fr.gah;

public class Assistant{ // Définition/résumé de l'objet (Vert)

  private Papier boutDePapier; //Proriété privée (Définition de la variable)

  public Assistant() { // Fonction (Constructeur)
    this.boutDePapier = new Papier(); //Dans boutDePapier , que des papiers , sinon ça fonctionnera pas
  }  //new = Instanciation de l'objet (On va utiliser notre objet). Il faut définir l'objet avant de l'instancier

  public void demanderInfosSpectateur(Spectateur spectateur) { //Définition/Résumé de la fonction (Jaune)
    System.out.println("[Assistant] Bonjour, Spectateur !");
    System.out.println(
        "[Assistant] Veuillez écrire sur ce bout de papier votre âge et la somme d'argent que vous avez en poche.");
    spectateur.écrireInfos(boutDePapier); //Paramètre de la fonction
    System.out.println("[Assistant] Bien ! Je prends le papier et je le lis silencieusement...");
    // Pour Debug
    // System.out.println("papier : " + boutDePapier);
  }

  public int annoncerIndice() {
    int indice = (boutDePapier.getAge() * 2 + 5) * 50 + boutDePapier.getSommeArgent() - 365;
    System.out.println("[Assistant] J'annonce : " + indice + " !");
    return indice;
  }
}