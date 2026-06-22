
import structures.node.Node;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runEjercicios();
        runEjercicio2();

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


}
