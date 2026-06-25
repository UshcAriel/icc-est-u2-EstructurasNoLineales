import structures.node.Node;
import structures.trees.Depth;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.IntTree;
import structures.trees.ListLevels;

public class App {
    public static void main(String[] args) throws Exception {
        runEjercicios();
        runEjercicio2();
        runEjercicio3();
        runEjercicio4();
    }

    private static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
    }

    private static void runEjercicio2(){
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};
        IntTree tree = new IntTree();
        for (int numero : numeros) {
            tree.add(numero);
        }

        Node<Integer> root = tree.getRoot();

        Ejercicio2.invertTree(root);

        System.out.println("Estructura visual del árbol INVERTIDO (rotado 90°):");
        
        Ejercicio2.imprimirArbolInvertido(root);
    }

    private static void runEjercicio3() {
        IntTree tree = new IntTree();
        tree.add(4);
        tree.add(2);
        tree.add(7);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(9);

        System.out.println("Input:");
        System.out.println("      4");
        System.out.println("    2   7");
        System.out.println("   1 3 6 9\n");

        ListLevels program = new ListLevels();
        java.util.List<java.util.List<Node<?>>> niveles = program.listLevels(tree.getRoot());

        System.out.println("Output:");
        for (java.util.List<Node<?>> nivel : niveles) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nivel.size(); i++) {
                sb.append(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    sb.append(" -> ");
                }
            }
            System.out.println(sb.toString());
        }
        System.out.println();
    }

    private static void runEjercicio4() {
        IntTree tree = new IntTree();
        tree.add(4);
        tree.add(2);
        tree.add(7);
        tree.add(1);
        tree.add(3);
        
        Node<Integer> nodo1 = tree.getRoot().getLeft().getLeft();
        nodo1.setLeft(new Node<>(8));

        System.out.println("Input:");
        System.out.println("      4");
        System.out.println("    2   7");
        System.out.println("   1 3");
        System.out.println("  8\n");

        Depth program = new Depth();
        int profundidad = program.maxDepth(tree.getRoot());

        System.out.println("Output: " + profundidad);
    }
}