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
  Node tail = null;

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

  public void insertAfter(Node prevNode, int data) {
    if (prevNode == null) {
      System.out.println("Error");
      return;
    }
    Node newNode = new Node(data);

    newNode.next = prevNode.next;
    prevNode.next = newNode;
    newNode.previous = prevNode;
    newNode.next.previous = newNode;
  }

  public void insertBefore(Node nextNode, int data) {

  }

  public void deleteAtBeginning() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    } else {
      if (head != tail) {
        Node nextOfHead = head.next;
        head = null;
        head = nextOfHead;
        head.previous = null;
      } else {
        head = tail = null;
      }
    }
  }

  public void show() {
    Node n = head;
    Node last = null;

    while (n != null) {
      System.out.print(n.data + " ");
      last = n;
      n = n.next;
    }
    System.out.println();

    // Reverse
    while (last != null) {
      System.out.print(last.data + " ");
      last = last.previous;
    }
    System.out.println("(Reverse)");
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

    list.insertAfter(list.head.next, 33);
    list.show();
  }

}