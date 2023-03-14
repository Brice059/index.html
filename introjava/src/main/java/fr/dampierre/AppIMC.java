package fr.dampierre;

public class AppIMC { //Nom classe/objet

  // Méthode main initiale
  // Vous ne devez pas modifier cette méthode
  public static void main(String[] args) { //Programme principal
    Patient patient = new Patient(74.5, 1.75 , "masculin"); //Instanciation de l'objet Patient
    System.out.println(patient.caractéristiques()); // Afficher les caractéristiques du patient ( Fonction caractéristiques)
    System.out.println("IMC exact : " + patient.calculerIMC());

    // Valeur négative pour l'un des deux => les deux seront mis à zéro
    Patient autrePatient = new Patient(-2.0, 4.5 , "masculin"); // String format
    System.out.println(autrePatient.caractéristiques());
  }
}