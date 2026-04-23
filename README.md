# Exercice 3 : Compteur de mots

## Objectif
Ce projet est une application Java qui lit un fichier texte (`texte.txt`)
et affiche le nombre total de mots qu'il contient.

---

## Structure du projet
- `CompteurDeMots.java` : contient la classe principale avec la méthode `main`.
- `texte.txt` : fichier texte à analyser (à placer à la racine du projet).

---

## Prérequis
- Java JDK 21
- IntelliJ IDEA (ou tout autre IDE compatible)
- Git installé sur votre machine

---

## Installation et exécution
- Clonez le dépôt :
```bash
git clone https://github.com/cmoussa07/CompteurDeMots.git
```
- Ouvrez le projet dans IntelliJ IDEA.
- Vérifiez que le JDK est bien configuré sur la version 21.
- Assurez-vous que le fichier `texte.txt` est présent à la racine du projet.
- Lancez la classe `CompteurDeMots`.

---

## Fonctionnement
- Le programme ouvre le fichier `texte.txt` via un lecteur de fichiers.
- Il parcourt chaque ligne et sépare les mots en utilisant l'espace comme délimiteur.
- Le nombre de mots de chaque ligne est compté via la longueur du tableau créé.
- Le total de tous les mots est additionné et affiché dans la console.
- Si le fichier est introuvable, un message d'avertissement est affiché.