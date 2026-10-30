# Algoritmos de ordenamiento

Colección de algoritmos clásicos de ordenamiento de enteros en Java, creados mediante una fábrica (patrón Factory).

## Características

- Burbuja, inserción, selección, sacudida (cocktail), Shell y Quicksort.
- Todos comparten la clase base `SortBase` y se obtienen con `SortFactory`.
- Ejemplo que ordena 10 números aleatorios con cada algoritmo.

## Requisitos

- JDK 21 y Maven 3.9 o superior.

## Compilar y ejecutar

```bash
mvn compile exec:java
```

## Uso

```java
SortBase algoritmo = SortFactory.createFactory(TypeSort.QUICKSORT);
int[] datos = {5, 3, 9, 1};
algoritmo.sort(datos);   // datos queda ordenado: 1 3 5 9
```

## Estructura

```text
src/main/java/com/juniverse/sort/
├── Main.java
└── algorithms/   # SortBase, SortFactory, TypeSort y los 6 algoritmos
```

## JAR ejecutable (fat jar)

```bash
mvn clean package
java -jar target/mvn-sort-1.0.0-SNAPSHOT-launcher.jar
```

El archivo `-launcher.jar` incluye todas las dependencias.

## Licencia

Código de ejemplo de uso libre con fines educativos.
