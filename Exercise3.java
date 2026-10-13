public class Exercise3 {
    public static void main(String[] args) {
    int [] numbers = {12, 7,25, 40, 18, 33, 50, 61};

    System.out.println("Even numbers in the array:");
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        System.out.println(numbers[i]);
      }
    }
    System.out.println("Odd numbers in the array:");
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 1) {
        System.out.println(numbers[i]);
      }
    }
}
  }
