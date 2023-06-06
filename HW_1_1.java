package exception;

//1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class HW_1_1 {

  public static void main(String[] args) {
    //1. division(5, 0);

    // 2. String str = null;
    //stringLength(str);

    // 3. int[] array = {1, 2, 3, 4, 5};
    //arrayElement(array);
  }

  private static void division (int a, int b) {
    System.out.println(a / b);
  }

  private static void stringLength(String str) {
    System.out.println(str.length());
  }

  private static int arrayElement(int[] array) {
    return array[array.length];
  }







}
