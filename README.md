# 🧮 Calculatrice TDD

![Java](https://img.shields.io/badge/Java-11-orange)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue)
![JUnit](https://img.shields.io/badge/JUnit-5.10-green)
![Tests](https://img.shields.io/badge/Tests-13%2F13%20passing-brightgreen)

> Projet d'apprentissage du **Test-Driven Development (TDD)** avec Maven et JUnit 5


## 📋 Description

Calculatrice implémentée en suivant la méthodologie **TDD (Test-Driven Development)**.  
Le projet démontre le cycle Rouge → Vert → Refactor avec 13 tests unitaires.

### Fonctionnalités

✅ **Addition** de nombres (positifs, négatifs, décimaux)  
✅ **Soustraction** avec gestion des résultats négatifs  
✅ **Multiplication** incluant les cas limites (par 0, par 1)  
✅ **Division** avec gestion d'exception (division par zéro)  

## 🎯 Objectifs Pédagogiques

- Maîtriser le cycle TDD (Rouge → Vert → Refactor)
- Utiliser Maven pour la gestion de projet Java
- Écrire des tests unitaires avec JUnit 5
- Comprendre l'importance des tests dans le DevOps

## 🚀 Installation et Utilisation

### Prérequis

- Java JDK 11 ou supérieur
- Maven 3.6 ou supérieur

### Clone le projet
```bash
git clone https://github.com/TON-USERNAME/calculatrice-tdd.git
cd calculatrice-tdd
```

### Compiler le projet
```bash
mvn compile
```

### Exécuter les tests
```bash
mvn test
```

### Exécuter le programme
```bash
mvn exec:java -Dexec.mainClass="sn.unchk.ibrahima.calculatrice.Main"
```

### Créer le JAR
```bash
mvn package
```

## 📊 Résultats des Tests
```
Tests run: 13, Failures: 0, Errors: 0, Skipped: 0

✅ Addition (4 tests)
✅ Soustraction (3 tests)  
✅ Multiplication (3 tests)
✅ Division (3 tests)
```

## 🏗️ Structure du Projet
```
calculatrice-tdd/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/java/sn/unchk/ibrahima/calculatrice/
    │   ├── Calculatrice.java      # Classe principale
    │   └── Main.java               # Point d'entrée
    └── test/java/sn/unchk/ibrahima/calculatrice/
        └── CalculatriceTest.java   # Tests TDD
```

## 🔄 Méthodologie TDD Appliquée

### Cycle Rouge → Vert → Refactor

1. **🔴 ROUGE** : Écrire un test qui échoue
2. **🟢 VERT** : Écrire le code minimal pour faire passer le test
3. **🔵 REFACTOR** : Améliorer le code sans casser les tests

### Exemple de cycle TDD pour l'addition :
```java
// 1. Test d'abord (Rouge)
@Test
void testAddition() {
    assertEquals(8, calculatrice.addition(5, 3));
}

// 2. Code minimal (Vert)
public double addition(double a, double b) {
    return a + b;
}

// 3. Refactor si nécessaire
```

## 🧪 Technologies Utilisées

- **Java 11** : Langage de programmation
- **Maven** : Gestion de projet et dépendances
- **JUnit 5** : Framework de tests unitaires

## 💡 Leçons Apprises

> *"On ne peut pas faire du DevOps si on ne sait pas faire des tests !"*

- Les tests unitaires donnent confiance dans le code
- Le TDD force à penser à l'interface avant l'implémentation
- Maven automatise le build et les tests
- Le code testé est plus maintenable et évolutif
