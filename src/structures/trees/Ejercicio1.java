package structures.trees;

public class Ejercicio1 {


    public static void insert(int[] numeros) {
        IntTree tree = new IntTree();

        for (int numero : numeros) {
            tree.add(numero);
        }
        
       
        System.out.println("Estructura visual del árbol (rotado 90°):");
        printTree(tree.getRoot());
    }

    public static void printTree(structures.node.Node<Integer> root) {
        if (root == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        printTreeRecursivo(root, 0);
    }

    
    private static void printTreeRecursivo(structures.node.Node<Integer> actual, int subNivel) {
        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), subNivel + 1);

        for (int i = 0; i < subNivel; i++) {
            System.out.print("    "); 
        }

        System.out.println(actual.getValue());

        printTreeRecursivo(actual.getLeft(), subNivel + 1);
    }
}