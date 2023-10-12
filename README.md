# AirAfrika : Réservation des Vols

# Contexte du projet
Dans le Cadre de l’automatisation du système de réservation, la société AirAfrika souhaite créer une application web qui va permettre la réservation des vols à ses clients via un site responsive. Nous supposons que le client (code, nom, prénom, email, téléphone) accède à l’IHM réservation. Le client saisit la ville de départ/d’arrivé, l’heure départ /d’arrivé, la date de départ/Arrivé, et le nombre de places. Le système affiche une liste de propositions de vols sur le menu de réservation, indiquant la description des vols. Si l’un des vols nécessite une escale, dans ce cas l’aéroport escale est affiché aussi. Le client choisit le vol qui lui intéresse, et il demande la réservation de celui-ci. Le système vérifie la disponibilité du vol. Si le vol est disponible, un message est affiché au client « la confirmation de la réservation sera complétée avec le paiement ».

#remarque: la société AirAfrika est conventionnée avec plusieurs société de transport aiérien


# FrontOffice :

- Le client est ensuite redirigé vers la page de paiement. Le client reçoit un email de confirmation de sa réservation avec les détails du vol choisi.
- Le Système enregistre par la suite le détail de la réservation dans un fichier (txt) .
- Un Administrateur de la société AirAfrica s’occupe de la gestion des vols (Crud) .
- Le client peut ajouter des extras à son vols (exemple: Assurance, Repas, Hôtel...) .
- La tarifications des vols est en MAD mais le client peut afficher le tarif en Euro .
- Une réduction de 19% s'applique pour les clients qui réservant aller/retour.
- Le client peut modifier ou annuler sa réservation après la confirmation de son vol dans le cas d'annulation: 8% des frais est retenue pour la société AirAfrika .

# BackOffice :
Un responsable de réservation (déjà enregistré dans le système) prend en charge de la gestion des vols (Crud)
Le Responsable peut consulter les statistiques des réservations confirmées et annulées ( Mensuelles et annuelle)
NB : Un Vol ne doit pas dépasser 30 passagers

# Travail à Faire :

• Réaliser la partie Backend de l'application Monilithique AirAfrika avec les configurations suivants:
Java J2ee
Serveur : Tomcat
Base de données: PostgreSql
ORM: Hibernate

• Proposez une base de données adéquate sous Postgresql qui répond efficacement au cahier des charges
• Réaliser un fichier de gestion de projet sur Trello/Jira
• Proposer un diagramme de classe+ cas d'utilisation adéquats
• Tester votre application dans un premier temps avec une interface console
​
