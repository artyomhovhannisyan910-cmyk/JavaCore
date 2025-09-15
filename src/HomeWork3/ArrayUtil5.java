package HomeWork3;

public class ArrayUtil5 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
    }
}
