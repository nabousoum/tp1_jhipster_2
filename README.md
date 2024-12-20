Ce projet contient deux microservices (MS1 et MS2) qui exposent des API accessibles via une passerelle configurée localement sur le port `9090`.
Prérequis
1. Logiciels nécessaires :
   - Docker et Docker Compose 
   - Java (JDK 11 ou supérieur).
   - Maven ou Gradle (pour la compilation).
   - Postman (pour tester les API).

2. Configuration locale :
   - Assurez-vous que le projet est cloné et configuré correctement.
   - Lancer les services nécessaires (Base de données, Gateway, etc.).
   - Vérifiez que le port `9090` est disponible pour la passerelle.

Tester les API

 MS1 - Service 1
URL : `http://localhost:9090/services/ms1/api/v1/hello`

- Méthode HTTP : GET
- Description : Retourne un message d'accueil pour MS1.

Exemple de requête :
Avec Postman :
1. Ajouter le token d'autorisation dans les Headers :
   ```
   Authorization: Bearer <Votre_Token>
   ```
2. Envoyer une requête GET à : 
   ```
   http://localhost:9090/services/ms1/api/v1/hello
   ```

MS2 - Service 2
URL : `http://localhost:9090/services/ms2/api/v1/hello`

- Méthode HTTP : GET
- Description : Retourne un message d'accueil pour MS2.

 Exemple de requête :
Avec Postman :
1. Ajouter le token d'autorisation dans les **Headers** :
   ```
   Authorization: Bearer <Votre_Token>
   ```
2. Envoyer une requête GET à : 
   ```
   http://localhost:9090/services/ms2/api/v1/hello
   ```
----------------
Contributeur
- Auteur : Seynabou SOUMARE
