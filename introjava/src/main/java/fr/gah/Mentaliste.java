package fr.gah;

public class Mentaliste {

  public void révélerGrâceA(int indice) {
    indice = indice + 115;
    int âge = indice / 100;
    int sommeArgent = indice - (âge * 100);
    System.out.println("[Magicien] Mmm... Vous avez " + âge + " ans et vous avez " + sommeArgent
        + " euros en poche !");
  }
}