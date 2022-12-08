package com.bootcoding.Linklist;

public class LastInsertNode
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        lastInsertNode(head);
        printLinkedList(head);
    }

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    private static Node createLinkedList()
    {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node forthNode = new Node(40);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void lastInsertNode(Node head){
        Node temp = head;
        Node fifithnode = new Node(50);
        System.out.println(head);
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = fifithnode;
    }
}
