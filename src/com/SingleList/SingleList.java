package com.SingleList;

public class SingleList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        SingleList linkedList = new SingleList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node firth = new Node(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = firth;

        System.out.print("LinkedList: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}





