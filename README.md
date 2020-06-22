# ProjetSpring

Avec la contrainte @Unique sur l'adresse mail, 
si le ServingWebContentApplication est lancé plusieurs fois sans vider la base, ça ne fonctionnera pas.
Il faut donc : 
          - soit mettre en commentaire les lignes d'ajout de données de ServingWebContentApplication après la première utilisation
          - soit supprimer le fichier test.mv.bd qui contient les données.
          
          
Les identifiants de connexions sont les suivants :
  - user :   user
  - mdp  :   secret123
