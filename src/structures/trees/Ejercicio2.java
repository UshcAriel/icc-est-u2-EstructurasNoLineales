package structures.trees;

import structures.node.Node;

public class Ejercicio2 {

    public static void invertTree(Node<Integer> actual) {
        
    if (actual == null) {
            return;
        }

        System.out.println("Nodo actual: " + actual);

       
        Node<Integer> temp = actual.getLeft();

        actual.setLeft(actual.getRight());
        actual.setRight(temp);

        invertTree(actual.getLeft());
        invertTree(actual.getRight());


    }
    
}
