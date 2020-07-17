class Node {
  public int data;
  Node next;
}

class TheLinkedList {
  Node head;

  public void insert(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (this.head == null) {
      // For beginning
      this.head = newNode;

    } else {
      // For End
      Node n = this.head;

      while (n.next != null) {
        n = n.next;
      }
      n.next = newNode;

    }

  }

  public void insertAtIndex(int index, int data) {
    Node newnode = new Node();
    newnode.data = data;

    if (index == 0) {
      head = newnode;
    } else {
      Node n = head;
      for (int i = 0; i < index - 1; i++) {
        n = n.next;
      }

      newnode.next = n.next;
      n.next = newnode;
    }
  }

  public void sortedInsert(int data) {
    Node newnode = new Node();
    newnode.data = data;
    newnode.next = null;

    if (head == null || head.data >= newnode.data) {
      newnode.next = head;
      head = newnode;
    } else {
      Node n = head;
      while (n.next != null && n.next.data < newnode.data) {
        n = n.next;
      }
      newnode.next = n.next;
      n.next = newnode;
    }
  }

  public void show() {
    Node node = this.head;

    while (node.next != null) {
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
    System.out.println();

  }

}

public class LinkedList {
  public static void main(String[] args) {
    TheLinkedList list = new TheLinkedList();

    list.insert(12);
    list.insert(34);
    list.insert(65);
    list.show();
    list.insertAtIndex(3, 77);
    list.show();
    list.sortedInsert(50);
    list.show();
  }
}