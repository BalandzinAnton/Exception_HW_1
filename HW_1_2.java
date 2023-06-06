package exception;

import java.util.Arrays;
import java.util.Random;

public class HW_1_2 {
/*2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
  public static void main(String[] args) {
    int[]arr1 = addArray();
    int[]arr2 = addArray();

    int[] result = newArray(arr1, arr2);
    for (int value : result) {
      System.out.print(value);
      System.out.print(" ");
    }
  }

  public static int[] newArray (int[]arr1, int[]arr2){
    if (arr1 == null || arr2 == null) {
      throw new NullPointerException("Оба массива должны существовать.");
    }
    if (arr1.length != arr2.length) {
      throw new ArrayStoreException("Количество элементов массива должно совпадать");
    }
    int[] result = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      result[i] = arr1[i] - arr2[i];
    }
    return result;
  }

  public static int[] addArray() {
    Random random = new Random();
    int size = random.nextInt(3) + 6;
    int [] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = random.nextInt(10);
    }
    return arr;
  }
}
