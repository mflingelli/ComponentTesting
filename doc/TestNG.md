# TestNG

* TestNG ist ein von [JUnit](https://junit.org/junit5/) inspiriertes Test-Framework.
* Es bietet verschiedene Funktionen wie
  * datengesteuertes Testen,
  * Unterstützung von Parametrisierung,
  * parallele Testfallausführung und
  * Testfallgruppierung

## Funktionen

* Verschiedene Arten von Assertions (Überprüfungen)
* Parallele Testdurchführung
* Die Fähigkeit, Tests voneinander abhängig zu machen
* Priorisierung von Tests
* Gruppierung von Tests
* Datengesteuertes Testen
* Berichterstattung
* Parametrisierung

## Vorteile

* Durch die Möglichkeit, Tests parallel auszuführen, kann die Gesamtdauer der Testausführung verkürzt werden.
* Es kann problemlos in CI (Continuous Integration)/CD (Continuous Delivery)-Tools integriert werden.
* Tests können von anderen Tests abhängig gemacht werden.
* Es besteht keine Notwendigkeit, die Daten zu kodieren. Dies kann mit verschiedenen Anmerkungen wie ```@DataProvider```
oder ```@Parameter``` usw. geschehen.
* Durch Gruppierung von Tests können verschiedene Testsuiten erstellt werden, z. B. Sanity, Smoke, Regression usw.

## Annotationen

Reihenfolge, in der die mit Anmerkungen annotierten Methoden ausgeführt werden:

* ```@BeforeSuite```
* ```@BeforeTest```
* ```@BeforeClass```
* ```@BeforeMethod```
* ```@Test```
* ```@AfterMethod```
* ```@AfterClass```
* ```@AfterTest```
* ```@AfterSuite```


### ```@AfterClass```

Wird ausgeführt, nachdem alle Testmethoden in der aktuellen Klasse ausgeführt wurden.

### ```@AfterGroups```

* Die Liste der Gruppen, nach denen diese Konfigurationsmethode ausgeführt wird.
* Diese Methode wird garantiert kurz nach dem Aufruf der letzten Testmethode ausgeführt, die zu einer dieser Gruppen gehört.

### ```@AfterMethod```

Wird nach jeder Testmethode ausgeführt.

### ```@AfterTest```

Wird ausgeführt, nachdem alle Testmethoden ausgeführt wurden, die zu den Klassen innerhalb des ```<test>```-Tags gehören.

### ```@AfterSuite```

Wird ausgeführt, nachdem alle Tests in dieser Suite ausgeführt wurden.

### ```@BeforeClass```

Wird ausgeführt, bevor die erste Testmethode in der aktuellen Klasse aufgerufen wird.

Ein Beispiel ist in der Klasse [AnnotationTest](../src/test/java/AnnotationTest.java) zu finden:
```
@BeforeMethod(description = "This method is called before every test call.")
public void initSimpleMathBeforeMethod() {
    simpleMathBeforeMethod = new SimpleMath();
}
```

### ```@BeforeGroups```

* Die Liste der Gruppen, vor denen diese Konfigurationsmethode ausgeführt wird. 
* Diese Methode wird garantiert kurz vor dem Aufruf der ersten Testmethode ausgeführt, die zu einer dieser Gruppen gehört.

Ein Beispiel ist in der Klasse [AnnotationTest](../src/test/java/AnnotationTest.java) zu finden:
```
@BeforeMethod(description = "This method is called before every test call.")
public void initSimpleMathBeforeMethod() {
    simpleMathBeforeMethod = new SimpleMath();
}
```

### ```@BeforeMethod```

Wird vor jeder Testmethode ausgeführt.

### ```@BeforeSuite```

Wird ausgeführt, bevor alle Tests in dieser Suite ausgeführt wurden.

### ```@BeforeTest```

Wird ausgeführt, bevor eine Testmethode ausgeführt wird, die zu den Klassen innerhalb des ```<test>```-Tags gehört.

### ```@Test```

* Markiert eine Klasse oder Methode als Testmethode.
* Bei Verwendung auf Klassenebene werden alle öffentlichen Methoden einer Klasse als Testmethoden betrachtet, 
auch wenn sie nicht mit Annotationen versehen sind.

Ein Beispiel ist in der Klasse [AnnotationTest](../src/test/java/AnnotationTest.java) zu finden:
```
@Test(groups = {"Arithmetic"}, expectedExceptions = ArithmeticException.class)
public void testDivideZero() {
    new SimpleMath().divide(15, 0);
}
```

### ```@DataProvider```

* Markiert eine Methode als datenbereitstellende Methode für Testmethoden.
* Die Methode muss ein Array oder Doppelarray von Objekten als Daten zurückgeben: ```Object[]``` oder ```Object[][]```

Ein Beispiel ist in der Klasse [GeometryTest](../src/test/java/GeometryTest.java) zu finden:
```
@DataProvider(name = "radius")
public Object[] getRadius() {
    return new Object[][] {{10.0, 314.159}, {20.0, 1256.637}};
}

@Test(groups = {"Geometry"}, dataProvider = "radius")
public void getCircleAreaRadiusFromDataProvider(double radius, double expected) {
    Assert.assertEquals(new Geometry().getCircleArea(radius), expected, 0.005);
}
```