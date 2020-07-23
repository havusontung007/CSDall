package Tree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PST91
 */
public class Tree {

    Node root;

    Tree() {
        root = null;
    }

    void insert(/*thuộc tính*/) {//You should insert here statements to complete this function
        Node n = new Node();
        if (root == null) {
            root = n;
        } else {
            for (Node node = root;;) {
                if (!(/* Điền kiện */)) {
                    if (val(node) < /*Thuộc tính*/) {
                        if (node.right == null) {
                            node.right = n;
                            break;
                        }
                        node = node.right;
                    } else {
                        if (node.left == null) {
                            node.left = n;
                            break;
                        }
                        node = node.left;
                    }
                }
            }
        }
    }

    // lay giá trị của 1 node
    int val(Node n) {
        return n.info. ?; // thay ? bang thuoc tinh
    }

    // tim node dau co duy nhat con trai
    Node findFirstNodeOnlyLeft(Node p) {
        if (p == null || (p.left != null && p.right == null /* && val(p) < dieu kien gi do>*/)) {
            return p;
        }

        Node l = findFirstNodeOnlyLeft(p.left);
        Node r = findFirstNodeOnlyLeft(p.right);
        return l != null ? l : r;
    }

    // find node trai có 1 con phải
    Node findFirstNodeOnlyRight(Node p) {
        if (p == null || (p.left == null && p.right != null /* && val(p) < dieu kien gi do>*/)) {
            return p;
        }

        Node l = findFirstNodeOnlyLeft(p.left);
        Node r = findFirstNodeOnlyLeft(p.right);
        return l != null ? l : r;
    }

    // find node có 2 con
    Node findFirstNode2Child(Node p) {
        if (p == null || (p.left != null && p.right != null /* && val(p) < dieu kien gi do>*/)) {
            return p;
        }

        Node l = findFirstNodeOnlyRight(p.left);
        Node r = findFirstNodeOnlyRight(p.right);
        return l != null ? l : r;
    }

    // tim node cha cua 1 node
    Node findFather(Node n) {
        if (n != null) {
            for (Node r = root; r != null;) {
                boolean isEqualLeft = r.left != null && val(n) == val(r.left);
                boolean isEqualRight = r.right != null && val(n) == val(r.right);
                if (isEqualLeft || isEqualRight) {
                    return r;
                } else if (val(n) > val(r)) {
                    r = r.right;
                } else {
                    r = r.left;
                }
            }
        }
        return null;
    }

    // quay vd đề bài yêu cầu <p to right about its’ left son> thì tham số truyền vài là node left của p
    void rotate(Node n) {
        Node pn = findFather(n);

        if (pn != null) {
            Node gn = findFather(pn);
            if (val(n) > val(pn)) { // rotate left
                pn.right = n.left;
                n.left = pn;
            } else { // quay phai
                pn.left = n.right;
                n.right = pn;
            }
            if (gn != null) { // quay node
                if (val(pn) > val(gn)) { // pn nằm ở bên phải
                    gn.right = n;
                } else {
                    gn.left = n;
                }
            }
        }
    }

    // delete by copy
    void deletebyCopy(Node n) {
        Node fn = findFather(n);

        if (n.left == null && n.right == null) { // vô sinh
            if (fn == null) {
                root = null;
            } else if (val(n) == val(fn.left)) {
                fn.left = null;
            } else {
                fn.right = null;
            }
        } else if (n.left != null && n.right == null) { // có 1 con trái
            if (fn == null) {
                root = n.left;
            } else if (val(n) == val(fn.left)) {
                fn.left = n.left;
            } else {
                fn.right = n.left;
            }
        } else if (n.left == null && n.right != null) { // có 1 con phải
            if (fn == null) {
                root = n.right;
            } else if (val(n) == val(fn.left)) {
                fn.left = n.right;
            } else {
                fn.right = n.right;
            }
        } else if (n.left != null && n.right != null) {
            Node bigChild = n;

            for (Node r = n.left; r != null; r = r.right) {
                bigChild = r;
            }
            findFather(bigChild).right = bigChild.left;
            bigChild.left = null;

            n.info = bigChild.info;

        }
    }

    // delete by merge
    void deletebyMerge(Node p) {
        if (p == null) {
            return;
        }
        //find f is father of p
        Node f = findFather(p);
        //1.p has no child
        if (p.left == null && p.right == null) {
            if (f == null) {
                root = null;
            } else if (f.left == p) {
                f.left = null;
            } else {
                f.right = null;
            }
        } //2.p has left child only
        else if (p.left != null && p.right == null) {
            if (f == null) {
                root = p.left;
            } else if (f.left == p) {
                f.left = p.left;
            } else {
                f.right = p.left;
            }
        } //3.p has right child only
        else if (p.left == null && p.right != null) {
            if (f == null) {
                root = p.right;
            } else if (f.left == p) {
                f.left = p.right;
            } else {
                f.right = p.right;
            }
        } //4.p has both child
        else if (p.left != null && p.right != null) {
            //tim q la node lon nhat ben con trai cua p -> q la con phai nhat
            //cua con trai cua p
            Node bigChild = p;

            for (Node r = p.left; r != null; r = r.right) {
                bigChild = r;
            }
            
            Node rp = p.right;
            bigChild.right = rp;
            
            if (f == null) {
                root = p.left;
            } else if (f.left == p) {
                f.left = p.left;
            } else {
                f.right = p.left;
            }
        }
    }
}
