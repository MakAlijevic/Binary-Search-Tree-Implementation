package org.example;

public class Node<Key extends Comparable<Key>, Value> {
    public int size = 1;
    public Key key;
    public Value value;
    public Node<Key, Value> left;
    public Node<Key, Value> right;

    public Node(Key key, Value value){
        this.key = key;
        this.value = value;
    }
}
