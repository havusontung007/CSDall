package List;


import List.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PST91
 */
public class List<T> {

    Node head, tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    int size(){
        int index = 0;
        for(Node r = head; r != null; r = r.next, index ++);
        return index;
    }
    
    // getIndex
    /**
     * @ replace param with what u need
     * get Index of Node has true condition
     * @return the first Index
     */
    int getIndex(/*<Param>*/) {
        int id = 0;
        for (Node r = head; r != null; r = r.next, id++) {
//            if(condition){
                return id;
//            }
        }
        return -1;
    }

    // get node at Index
    Node<T> getNodeAt(int id){
      int index = 0;
        for(Node r = head; r != null; r = r.next, index ++){
            if(index == id) return r;
        };
        return null;  
    }
    
    // add to head
    void addToHead(T obj) {
        if (isEmpty()) {
            head = tail = new Node(obj);
        } else {
            head = new Node(obj, head);
        }
    }

    // add last ( to tail)
    void addLast(T obj) {
//        if () { // if has condition so add to if
        if (isEmpty()) {
            head = tail = new Node(obj);
        } else {
            tail = tail.next = new Node(obj);
        }
//        }

    }

    // insert to index
    /***
     * insert to index
     * @param id index
     * @param obj object
     */
    void insertToIndex(int id, T obj){ // not done yet
        int index = 1;
        for(Node r = head; r != null; r = r.next, index ++){
            if(id == 0){
                head = new Node(obj, head);
            }
            if(index == id){
                r.next = new Node(obj, r.next);
                return;
            }
        }
        System.err.println("Out of range!!!");
    }
    
    // swap element at index
    void swapElementAt(int a, int b){
        if(getNodeAt(a) != null && getNodeAt(b) != null){
            T obj = getNodeAt(a).info;
            getNodeAt(a).info = getNodeAt(b).info;
            getNodeAt(b).info = obj;
            
        }
    }
    
    
    // sort by ? 
    int val(Node n){
        return n.info.?; // thay ? 
    }
    
    void sort(){
        for(int i = 0; i < size()-1; i ++){
            for(int j = i+1; j < size(); j++){
                if(val(getNodeAt(i))> val(getNodeAt(j))){ //
                    swapElementAt(i, j);
                }
            }
        }
    }
    
    // reverse in range
    void reverse(int a, int b){ // a < b
        if( a >= 0 && b < size() && a < b)
        for(int i = a, j = b-1; j > i; j--, i++){
            swapElementAt(i, j);
        }
    }
    // reverse
    void reverse(){
        reverse(0, size());
    }
    
    
    
}
