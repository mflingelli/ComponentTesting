# ComponentTesting
![Build-Status](https://github.com/mflingelli/ComponentTesting/actions/workflows/maven.yml/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

Dieses Projekt zeigt, wie TestNG zu Komponententests und zur Bestimmung der Testabdeckung eingesetzt werden kann. 
Die Bibliothek Hamcrest bietet viele Methoden, welche die Prüfung der Testergebnisse erleichtern. 
Die Darstellung der Testergebnisse erfolgt neben den TestNG-Report auch über Allure Report.

Neben TestNG werden auch weitere Erweiterungen eingesetzt, die zur Verbesserung der Code-Qualtität und der Sicherheit
beitragen sollen.

## TestNG

Weitere Informationen zu TestNG sind hier ausgeführt: [TestNG](doc/TestNG.md)

## Profile

### Allure

Das Allure-Plugin erzeugt einen Bericht über alle ausgeführten Tests, dieser ist im Verzeichnis
`target/site/allure-maven-plugin` zu finden.

Die Testergebnisse werden automatisch als Allure-Report erzeugt und auf GitHub hochgeladen:
[https://mflingelli.github.io/ComponentTesting](https://mflingelli.github.io/ComponentTesting)

### Checkstyle

Der Hauptzweck des Maven Plugins Checkstyle in Java ist es, die Einhaltung von Codekonventionen und 
-standards sicherzustellen. Es analysiert den Quellcode und meldet Abweichungen von vordefinierten Regeln 
und Stilrichtlinien.

### Coverage

Dieses Profil enthält das JaCoCo-Plugin und erzeugt im Verzeichnis `target/site/jacoco` einen Report, 
welcher die Code-Abdeckung anzeigt.

### Dependency-check

Dieses Profil ruft das Plugin Dependency-check auf. Dieses dient der Identifikation von Sicherheitslücken in den 
Projektabhängigkeiten. Es analysiert die verwendeten Bibliotheken und Abhängigkeiten auf bekannte Schwachstellen und 
gibt Warnungen aus, wenn potenzielle Risiken gefunden werden.

### Parameters

In diesem Profil werden die in der Datei `testng.xml` definierten Testfälle ausgeführt.

## Quellen:

* Allure Maven Plugin: [https://github.com/allure-framework/allure-maven](https://github.com/allure-framework/allure-maven)
* Allure Report: [https://allurereport.org/](https://allurereport.org/)
* Apache Maven Projects
  * Checkstyle Plugin: [https://maven.apache.org/plugins/maven-checkstyle-plugin/](https://maven.apache.org/plugins/maven-checkstyle-plugin/)
  * Surefire Plugin: [https://maven.apache.org/surefire/maven-surefire-plugin/index.html](https://maven.apache.org/surefire/maven-surefire-plugin/index.html)
* Dependency-Check Maven: [https://jeremylong.github.io/DependencyCheck/](https://jeremylong.github.io/DependencyCheck/)
* Hamcrest: [https://hamcrest.org/JavaHamcrest/](https://hamcrest.org/JavaHamcrest/)
* TestNG: [https://testng.org/](https://testng.org/)
* HowToDoInJava - TestNG: [https://howtodoinjava.com/testng/](https://howtodoinjava.com/testng/)
* Java Code Coverage Library (JaCoCo): [https://github.com/jacoco/jacoco](https://github.com/jacoco/jacoco)
* TestNG: [https://testng.org/](https://testng.org/)