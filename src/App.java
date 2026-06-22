
import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
       runIntTree();

    }

    private static void runIntTree(){

        IntTree tree = new IntTree();

        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        System.out.print("PreOrden: ");
        tree.preOrden();

        System.out.println();

        System.out.print("InOrden: ");
        tree.inOrden();

        System.out.println();

        System.out.print("PostOrden: ");
        tree.postOrden();

        System.out.println();

        System.out.println("Altura del árbol: " + tree.getHeight());
        System.out.println("Peso del árbol: " + tree.getPeso());




    }

    private static  void runBinaryTree(){
        
        BinaryTree<String> arbolString = new BinaryTree<>();
        BinaryTree<Personas> arbolPersonas = new BinaryTree<>();

        arbolPersonas.add(new Persona("Pablo" , 30));
        arbolPersonas.add(new Persona("Maria" , 50));
        arbolPersonas.add(new Persona("Mario" , 10));
        arbolPersonas.add(new Persona("Luis" , 20));
        arbolPersonas.add(new Persona("Ana" , 40));

    }

    private static void runIntTree(){


    }

    private static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
    }
}
