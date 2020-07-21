class DLL {
  class Node {
    int data;
    Node previous;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  Node head;

  public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    newNode.previous = null;

    head.previous = newNode;
    head = newNode;
  }

  public void append(int data) {
    Node newNode = new Node(data);
    newNode.next = null;
    Node last = head;

    if (head == null) {
      newNode.previous = null;
      head = newNode;
      return;
    } else {
      while (last.next != null) {
        last = last.next;
      }
      last.next = newNode;
      newNode.previous = last;
      last = newNode;
    }

  }

  public void show() {
    Node n = head;

    while (n.next != null) {
      System.out.print(n.data + ", ");
      n = n.next;
    }
    System.out.println(n.data);
  }

}

public class DoublyLinkedList {
  public static void main(String[] args) {
    DLL list = new DLL();

    list.append(34);
    list.append(55);
    list.append(67);
    list.show();

    list.insertAtBeginning(22);
    list.show();
  }

}