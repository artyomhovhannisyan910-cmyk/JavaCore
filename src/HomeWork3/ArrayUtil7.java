package HomeWork3;

public class ArrayUtil7 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int counter=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]%2==0) {
                counter++;
            }


        }
        System.out.println(counter);

    }
}
