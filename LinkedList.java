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

  public void show() {
    Node node = this.head;

    while (node.next != null) {
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);

  }

}

public class LinkedList {
  public static void main(String[] args) {
    TheLinkedList list = new TheLinkedList();

    list.insert(10);
    list.insert(20);
    list.insert(30);

    list.show();
  }
}