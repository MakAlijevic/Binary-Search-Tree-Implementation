package org.example;

import java.util.ArrayList;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node<Key, Value> root;
    private int steps = 1;

    public int size() {
        return size(root);
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Key findMin() {
        return findMin(root).key;
    }

    public Key findMax() {
        return findMax(root).key;
    }

    public int rank(Key key) {
        return rank(root, key);
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    public void delete(Key key) {
        root = delete(root, key);
    }

    public void iterate() {
        inorder(root);
    }

    public void inorderSpecific(int elements){
        ArrayList<Value> list = new ArrayList<Value>();
        inorderSpecific(root, elements, list);
        for (int i = 0; i<elements;i++) {
            System.out.println(list.get(i));
        }
    }

    public void preorderSpecific(int elements){
        ArrayList<Value> list = new ArrayList<Value>();
        preorderSpecific(root, elements, list);
        for (int i = 0; i<elements;i++) {
            System.out.println(list.get(i));
        }
    }

    public void postorderSpecific(int elements){
        ArrayList<Value> list = new ArrayList<Value>();
        postorderSpecific(root, elements, list);
        for (int i = 0; i<elements;i++) {
            System.out.println(list.get(i));
        }
    }

    public Value get(Key key) {
        steps = 1;
        Node<Key, Value> x = root;

        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
                addSteps();
            } else if (cmp > 0) {
                x = x.right;
                addSteps();
            } else {
                return x.value;
            }
        }
        return null;
    }

    public int getSteps(){
        return steps;
    }

    private void addSteps(){
        steps++;
    }

    private int size(Node<Key, Value> x) {
        if (x == null) {
            return 0;
        }
        return x.size;
    }

    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) {
            return new Node<Key, Value>(key, value);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }

        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }

    private Node<Key, Value> findMin(Node<Key, Value> x) {
        if (x.left == null) {
            return x;
        }
        return findMin(x.left);
    }

    private Node<Key, Value> findMax(Node<Key, Value> x) {
        if (x.right == null) {
            return x;
        }
        return findMax(x.right);
    }

    private int rank(Node<Key, Value> x, Key key) {
        if (x == null) {
            return 0;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(x.left, key);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(x.right, key);
        } else {
            return size(x.left);
        }
    }

    private Node<Key, Value> deleteMin(Node<Key, Value> x) {
        if (x.left == null) {
            return x.right;
        }

        x.left = deleteMin(x.left);
        x.size = 1 + size(x.left) + size(x.right);

        return x;
    }

    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.right == null) {
                return x.left;
            }
            if (x.left == null) {
                return x.right;
            }

            Node<Key, Value> t = x;
            x = findMin(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }

    private void inorder(Node<Key, Value> x) {
        if (x == null) {
            return;
        }
        inorder(x.left);
        System.out.println(x.key);
        inorder(x.right);
    }

    private void inorderSpecific(Node<Key, Value> x, int elements, ArrayList<Value> list) {
        if (x == null) {
            return;
        }
        inorderSpecific(x.left, elements, list);
        list.add(x.value);
        inorderSpecific(x.right, elements, list);
    }

    private void preorderSpecific(Node<Key, Value> x, int elements, ArrayList<Value> list) {
        if (x == null) {
            return;
        }
            list.add(x.value);
            preorderSpecific(x.left, elements, list);
            preorderSpecific(x.right, elements, list);

    }

    private void postorderSpecific(Node<Key, Value> x, int elements, ArrayList<Value> list) {
        if (x == null) {
            return;
        }
        postorderSpecific(x.left, elements, list);
        postorderSpecific(x.right, elements, list);
        list.add(x.value);
    }
}
