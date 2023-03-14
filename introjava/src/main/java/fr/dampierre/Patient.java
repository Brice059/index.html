package fr.dampierre;

public class Patient {

  private double poids;
  private double taille;
  private String sexe; 

  public Patient(double poids , double taille , String sexe) { //Constructeur
    this.sexe = sexe;
    if (poids <= 0 || taille <= 0) { // && Et 
      this.poids = 0; // Propriété l5 
      this.taille = 0; 
    } else {
      this.poids = poids; // Egal à ce qu'on a fourni dans l'argument poids , à savoir 74,5
      this.taille = taille; // 
    }
  }

  //public  (String sexe)
  //if (sexe = masculin )
  //this.sexe = masculin 


  public double calculerIMC() {
    if (taille == 0)
      return 0;
    double imc = poids / (taille * taille);
    return imc;
  }

  public String caractéristiques() {
    // Utilisation de String.format pour les arrondis
    // https://www.geeksforgeeks.org/java-string-format-method-with-examples/
    String varcaractéristiques =
        String.format("Patient : %.1f kg pour %.1f m (IMC : %.2f)", poids, taille, calculerIMC());
    return varcaractéristiques; // Cette fonction retourne dans la variable , qui va mettre en forme les valeurs et les transformer en String
  }
}