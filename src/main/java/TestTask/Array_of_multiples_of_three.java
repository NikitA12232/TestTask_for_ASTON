package TestTask;
public class Array_of_multiples_of_three {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 9, 12, 15, 18, 21,16,1,13,78,16,};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
