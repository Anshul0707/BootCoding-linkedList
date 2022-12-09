# BootCoding-linkedList
## Linked list implementation in java 
### Linked List -

A linked list is a linear collection of data elements, in which linear order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a group of nodes that together represent a sequence.
### Consider this example -
![Untitled Diagram drawio (1)](https://user-images.githubusercontent.com/83603148/206536079-6ad52a0e-b8ce-4fa2-8d84-905dcad4a16b.png)
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

### How to create new Linked List ?

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
![Untitled Diagram drawio (2)](https://user-images.githubusercontent.com/83603148/206546292-8e1ccb11-3222-401f-b15e-4ccfaa8d9226.png)

- Create a createLinkedList() method in that class.
- createLinkedList() will add a new node to the list
- After that alocatng Starting Points to each nodes (i.e firstNode,secondNode,etc)


### How to Display list of nodes ?
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

### How to Insert first node in list ?
```
public static Node firstInsert(Node head)
    {
        Node newNode = new Node(70);
        newNode.next=head;
        head=newNode;
        return head;
    }
```
- Then Create a firstInsert() method in that class.
- firstInsert() will insert new node to the beginning of the list.
- Create a new node.
- Make the new node points to the head node.
- Then,make the new node as the head node.

### How to Insert Last node in list ?
```
public static void lastInsertNode(Node head)
    {
        Node temp = head;
        Node newNode = new Node(50);
        System.out.println(head);
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
```
- Create a lastInsertNode() method in that class.
- lastInsertNode() will insert new node at the ending of the list.
- Define a node temp (variable) which initially pointng to the head of the list.
- Create a new node.
- Traverse through the list till temp pointng to null.
- if null then Make the next of temp (variable) points to the newNode.

### How to Delete First node in list ?
```
public static void deleteFirstNode(Node head)
    {
        head = head.next;
        printLinkedList(head);
    }
```
- Create a deleteFirstNode() method in that class.
- deleteFirstNode() will delete first node in the list.
- Make Next of head as head.
- then call printLinkedList(head) method to print updated list of Nodes.

### How to Delete Last node in list ?
```
public static void deleteLastNode(Node head)
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.println(temp.data);
            if (temp.next.next == null)
            {
                temp.next = null;
            }
            temp = temp.next;
        }
    }
```
- Create a deleteFirstNode() method in that class.
- deleteFirstNode() will delete first node in the list.
- Define a node temp (variable) which initially pointng to the head of the list.
- Traverse through the list till temp pointng to null.
- Then cheak next of next element is null if ```temp.next.next == null``` condition is true then temp.next pointing to null.
- if ```temp.next.next == null``` condition is false then ```temp = temp.next ``` this line will be execute.

