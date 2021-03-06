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

  public void deleteAt(int index) {
    if (index == 0) {
      head = head.next;
    } else {
      Node n = head;
      Node n1 = null;

      for (int i = 0; i < index - 1; i++) {
        n = n.next;
      }
      n1 = n.next;
      n.next = n1.next;
    }
  }

  public int searchItem(int item) {
    Node node = this.head;

    int i;
    for (i = 0; node.next != null; i++) {
      if (node.data == item) {
        return i;
      }
      node = node.next;
    }
    return i;
  }

  public void reverse() {
    if (head == null) {
      System.out.println("List Empty");
    } else {
      Node current = head;
      Node previous = null;
      Node next = null;

      while (current != null) {
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
      }
      head = previous;
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
    // list.deleteAt(0);
    // list.show();
    int index = list.searchItem(77);
    System.out.println("->" + index);

    // list.reverse();
    // list.show();
  }
}