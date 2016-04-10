package model;

public class Tree<T> {
    public T data;
    public Tree<T> left;
    public Tree<T> right;

    private Tree( T data, Tree<T> left, Tree<T> right ) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static <T> Tree<T> leaf() {
        return null;
    }

    public static <T> Tree<T> node( T data ) {
        return new Tree( data, null, null );
    }

    public static <T> Tree<T> node( T data, Tree<T> left, Tree<T> right ) {
        return new Tree( data, left, right );
    }
}