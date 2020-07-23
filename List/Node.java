package List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PST91
 */
public class Node<T> {

    T info;
    Node next;

    Node(T x, Node p) {
        info = x;
        next = p;
    }

    Node(T x) {
        this(x, null);
    }
}
