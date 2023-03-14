<?php

// je suis un commentaire
echo "Bonjour et bienvenue dans le cours";

$age = 18;
//condition
if(Sage < 18) {
    echo "Je suis mineur";
} else if (Sage == 18) {
    echo "Tout juste la majorité <br>";
} else {
    echo "Je suis majeur";
}
echo "J'ai" .$age."ans";

switch ($age) {
    case 10:
        echo "J'ai 10 ans";
        break;
    case 20:
        echo "j'ai 20 ans";
        break;
        default:
        echo "Vous n'avez pas l'âge requis";
}
echo "<br>";
//boucles
for($i = 1; $i <= 100; $i++){
    echo $i." ";
}


*/
Je suis un block de commentaire
?>