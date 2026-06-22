package structures.trees;

import structures.node.Node;

public class IntTree {

    private Node<Integer> root;

    public IntTree() {
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(Integer value) {
        this.root = new Node<Integer>(value);
    }

    public void add(int value) {
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
    }

    private Node<Integer> addRecursivo(Node<Integer> actual,
                                       Node<Integer> nodeInsertar) {

        if (actual == null) {
            return nodeInsertar;
        }

        if (nodeInsertar.getValue() < actual.getValue()) {
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    // PREORDEN
    public void preOrden() {
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<Integer> actual) {

        if (actual == null) {
            return;
        }

        System.out.print(actual.getValue() + " ");

        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    // INORDEN
    public void inOrden() {
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<Integer> actual) {

        if (actual == null) {
            return;
        }

        inOrdenRecursivo(actual.getLeft());

        System.out.print(actual.getValue() + " ");

        inOrdenRecursivo(actual.getRight());
    }

    // POSTORDEN
    public void postOrden() {
        postOrdenRecursivo(root);
    }

    private void postOrdenRecursivo(Node<Integer> actual) {

        if (actual == null) {
            return;
        }

        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());

        System.out.print(actual.getValue() + " ");
    }

    // ALTURA
    public int getHeight() {
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<Integer> actual) {

        if (actual == null) {
            return 0;
        }

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        return Math.max(heightLeft, heightRight) + 1;
    }

    // PESO (cantidad de nodos)
    public int getPeso() {
        return getPesoRecursivo(root);
    }

    private int getPesoRecursivo(Node<Integer> actual) {

        if (actual == null) {
            return 0;
        }

        return getPesoRecursivo(actual.getLeft())
             + getPesoRecursivo(actual.getRight())
             + 1;
    }
}