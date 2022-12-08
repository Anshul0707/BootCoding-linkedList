package com.bootcoding.Linklist;

public class FirstInsertNode
{
    public static void main(String[] args)
    {
        Node head = createLinkedList();
        head = firstInsert(head);
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

    private static Node firstInsert(Node head)
    {
        Node newNode = new Node(70);
        newNode.next=head;
        head=newNode;
        return head;
    }
}
