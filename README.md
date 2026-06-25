# Proyecto: Estructuras de Datos No Lineales - Árboles Binarios

## Información Universitaria
* **Institución:** UPS
* **Carrera:** Computación
* **Asignatura:** Estructura de Datos
* **Estudiante:** Ariel Ushca
* **Fecha:** 6/25/2026

---

## Descripción de los Ejercicios Implementados

### Ejercicio 1: Creación e Impresión del Árbol (`Ejercicio1.java`)
* **`insert(int[] numeros)`**: Toma una matriz de números enteros, crea un árbol binario de tipo `IntTree` e introduce los elementos de manera sucesiva para que la propiedad del árbol binario de búsqueda permanezca. Al concluir, llama al método de impresión.
* **`printTree(Node<Integer> root)`**: Verifica si el árbol está vacío. Si tiene elementos, comienza el proceso de renderizado visual invocando la función recursiva desde el nivel base.
* **`printTreeRecursivo(Node<Integer> actual, int subNivel)`**: Efectúa un recorrido en orden inverso modificado (de derecha a izquierda). Para calcular el número de tabulaciones necesarias en la consola y así obtener una proyección del árbol rotada 90 grados, emplea el parámetro `subNivel`.

---

### Ejercicio 2: Inversión de Árbol Binario (`Ejercicio2.java`)
* **`invertTree(Node<Integer> actual)`**: Toma la raíz del árbol y, usando un método de recursión ascendente, intercambia los punteros de los hijos izquierdo y derecho de cada nodo. Esto convierte al árbol en su reflejo.
* **`imprimirArbolInvertido(Node<Integer> actual)`** y **`imprimirInvertidoRecursivo(...)`**: Se comportan de forma similar al sistema de impresión del Ejercicio 1, con el fin de corroborar en la consola que la rotación física de los nodos derechos e izquierdos se haya realizado satisfactoriamente.

---

### Ejercicio 3: Listar Niveles en Listas Enlazadas (`ListLevels.java`)
* **`listLevels(Node<?> root)`**: Se emplea una estructura de cola (`Queue`) para implementar un algoritmo de búsqueda en anchura (BFS). Al comienzo de cada iteración, obtiene el tamaño de la cola (`levelSize`) de manera dinámica para segmentar los nodos que pertenecen estrictamente a un mismo nivel de profundidad. Los agrupa en sublistas separadas que al final son incorporadas a una lista principal.

---

### Ejercicio 4: Calcular la Profundidad Máxima (`Depth.java`)
* **`maxDepth(Node<?> root)`**: Calcula, de manera recursiva, la profundidad o altura del árbol binario. Calcula la profundidad máxima que ha llegado de forma independiente el subárbol derecho y el subárbol izquierdo; después, escoge el valor mayor entre los dos usando `Math.max()`, a lo que le suma 1 (que representa el nivel del nodo actual) para devolver la ruta más larga desde la raíz hasta la hoja más remota.