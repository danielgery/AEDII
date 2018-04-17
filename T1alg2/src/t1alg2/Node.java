/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1alg2;

/**
 *
 * @author Doug
 */
public class Node {

	public enum Status { EMPTY, MULTICOLOR, UNIQUECOLOCOR };
    private Node father;
    private Node leftUp;
    private Node rightUp;
    private Node leftDown;
    private Node rightDown;
    private Cor cor;
    private Status status;

    public Node() {
        father = null;
        leftUp = null;
        rightUp = null;
        leftDown = null;
        rightDown = null;
        this.status = Status.EMPTY;
        cor = null;
    }

    public Node(double n) {
        father = null;
        leftUp = null;
        rightUp = null;
//        element = n;
    }

    public Node getFather() {
        return father; 
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public Node getLeft() {
        return leftUp;
    }

    public void setLeft(Node left) {
        this.leftUp = left;
    }

    public Node getRight() {
        return rightUp;
    }

    public void setRight(Node right) {
        this.rightUp = right;
    }

//    public double getElement() {
//        return element;
//    }
//
//    public void setElement(double element) {
//        this.element = element;
//    }

}
