# BootCoding-LinkList

# Linked list implementation in java 
### Linked List

A linked list is a linear collection of data elements, in which linear order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a group of nodes that together represent a sequence.
![Untitled Diagram drawio (1)](https://user-images.githubusercontent.com/83603148/206536079-6ad52a0e-b8ce-4fa2-8d84-905dcad4a16b.png)
### Consider the above example
- node A is the head of the list.
- node D is the tail of the list.
- Each node is connected in such a way that node A is pointing to node B which in turn pointing to node C.
- Node C is again pointing to node D. 
- Node D is pointing to null as it is the last node of the list.

```
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
```
- Create a class Node which has two attributes data and next.
- Next is a pointer to the next node.


```
public static Node createLinkedList()
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
```
- Create a createLinkedList() method in that class.
- createLinkedList() will add a new node to the list
- After that alocatng Starting Points to each nodes (i.e firstNode,secondNode,etc)

```
public static void printLinkedList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
```
- Then Create a printLinkedList() method in that class.
- printLinkedList() will display the nodes present in the list
- Define a node temp (variable) which initially pointng to the head of the list.
- Traverse through the list till temp pointng to null.
- Display each node by making temp to pointng to node next to it in each iteration
