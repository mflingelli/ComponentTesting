# ComponentTesting
![Build-Status](https://github.com/mflingelli/ComponentTesting/actions/workflows/maven.yml/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

Dieses Projekt zeigt, wie TestNG zu Komponententests und zur Bestimmung der Testabdeckung eingesetzt werden kann. 
Die Darstellung der Testergebnisse erfolgt neben den TestNG-Report auch über Allure Report.

## Profile

### Allure

Das Allure-Plugin erzeugt einen Bericht über alle ausgeführten Tests, dieser ist im Verzeichnis
```target/site/allure-maven-plugin``` zu finden.

### Coverage

Dieses Profil enthält das JaCoCo-Plugin und erzeugt im Verzeicni ```target/site/jacoco``` einen Report, 
welcher die Code-Abdeckung anzeigt.

## Quellen:

* Allure Report: [https://allurereport.org/](https://allurereport.org/)
* Homepage TestNG: [https://testng.org/](https://testng.org/)
* Java Code Coverage Library (JaCoCo): [https://github.com/jacoco/jacoco](https://github.com/jacoco/jacoco)
* Maven Allure: [https://github.com/allure-framework/allure-maven](https://github.com/allure-framework/allure-maven)
