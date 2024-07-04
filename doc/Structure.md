De ces différents besoins, une architecture en couches a émergé, avec un rôle pour chaque couche :

- **couche Controller** : gestion des interactions entre l’utilisateur de l’application et l’application ;
- **couche Service** : implémentation des traitements métiers spécifiques à l’application ;
- **couche Repository** : interaction avec les sources de données externes ;
- **couche Model** : implémentation des objets métiers qui seront manipulés par les autres couches.

|Couche|Objectif|
|:-----|:-------|
|controller|Réceptionner la requête et fournir la réponse|
|service|Exécuter les traitements métiers|
|repository|Communiquer avec la source de données|
|model|Contenir les objets métiers|