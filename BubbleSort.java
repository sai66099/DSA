import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 5,9, 1, 3, 6, 2 };
        bubbleSort(numbers);
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}