import java.util.*;

public class LinearArrays {

  static void printArray(int la[], int n) {
    System.out.print("[");
    for (int i = 0; i < n + 1; i++)
      System.out.print(la[i] + ", ");
    System.out.println("]");
  }

  static void linearSearch() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(n);

    int la[] = new int[n + 3];
    for (int i = 0; i < n; i++)
      la[i] = sc.nextInt();

    int lastIndex = la.length - 1;
    int midIndex = lastIndex / 2;
    System.out.println(lastIndex + ", " + midIndex);
  }

  static void binarySearch() {
    Scanner sc = new Scanner(System.in);
    int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int LB = 0;
    int UB = array.length - 1;
    int MID = (LB + UB) / 2;

    int toFind = sc.nextInt();

    if (toFind == array[MID]) {
      System.out.println(MID);
      return;
    } else if (toFind > MID) {
      LB = MID + 1;

      while (UB >= LB) {
        if (array[LB] == toFind) {
          System.out.println(LB);
          return;
        }
        LB += 1;
      }
    } else {
      UB = MID;

      while (UB >= LB) {
        if (array[UB] == toFind) {
          System.out.println(UB);
          return;
        }
        UB -= 1;
      }
    }
    System.out.println("Element Not Found");
    return;

  }

  static void insertion() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(n);

    int la[] = new int[n + 1];
    for (int i = 0; i < n; i++)
      la[i] = sc.nextInt();

    int k = sc.nextInt();
    int item = sc.nextInt();
    int j = n - 1;

    printArray(la, n);

    while (j >= k) {
      la[j + 1] = la[j];
      j = j - 1;
    }

    la[k] = item;

    printArray(la, n);
  }

  public static void main(String[] args) {
    // insertion();
    // linearSearch();
    binarySearch();
  }
}