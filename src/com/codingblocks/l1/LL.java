package com.codingblocks.l1;

public class LL {

    private Node head;

    public void insertHead(String name){
        Node node = new Node(name);
        node.next = head;
        head = node;
    }



    private class Node {
        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
        }
    }
}
