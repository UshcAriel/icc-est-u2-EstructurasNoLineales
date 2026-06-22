
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;

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
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros = new int[] {5,3,7,2,4,6,8};
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.add(numero);
        }
        Node<Integer> root = tree.getRoot();
        ejercicio2.inverTree(root);             
    }

}
