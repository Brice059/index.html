package fr.gah;

public class Main {
   
    public static void main(String[] args ) {
        // votre code ici
    
    Assistant assistant = new Assistant(); //Chercher dans le fichier assistant.java l'objet assistant
    Spectateur moi = new Spectateur(); // 
    Mentaliste mentaliste = new Mentaliste();
    assistant.demanderInfosSpectateur(moi); // Chercher dans le fichier assistant.java la fonction demanderInfosSpectateur
    int indice = assistant.annoncerIndice(); // Chercher dans le fichier assistant.java la fonction annoncé indice
    mentaliste.révélerGrâceA(indice);
    }
}
