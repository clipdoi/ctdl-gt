package com.demo.tree;

class Node<T extends Comparable<T>> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public com.demo.tree.Node<T> getLeft() {
        return left;
    }

    public void setLeft(com.demo.tree.Node<T> left) {
        this.left = left;
    }

    public com.demo.tree.Node<T> getRight() {
        return right;
    }

    public void setRight(com.demo.tree.Node<T> right) {
        this.right = right;
    }

    private com.demo.tree.Node<T> left, right;

    public Node(T data, com.demo.tree.Node<T> left, com.demo.tree.Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
