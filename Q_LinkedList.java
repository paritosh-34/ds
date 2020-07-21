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

    if (head == null) {
      this.head = newNode;
    } else {
      Node n = head;

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

  public void show() {
    Node node = head;

    while (node.next != null) {
      System.out.print(node.data + ", ");
      node = node.next;
    }
    System.out.println(node.data);
  }
}

public class Q_LinkedList {
  public static void main(String[] args) {
    TheLinkedList list = new TheLinkedList();

    list.insert(23);
    list.insert(45);
    list.insert(34);
    list.insert(23);
    list.insert(67);
    list.insert(89);
    list.show();

    // Insert 55 after 34
    int index = list.searchItem(34);
    list.insertAtIndex(index + 1, 55);
    list.show();

    // Delete an element before 67
    index = list.searchItem(67);
    list.deleteAt(index - 1);
    list.show();

  }

}