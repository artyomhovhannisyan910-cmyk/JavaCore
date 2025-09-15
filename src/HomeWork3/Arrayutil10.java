package HomeWork3;

public class Arrayutil10 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        double average = 0;
        for (int i = 0; i <numbers.length ; i++) {
            average+=numbers[i];

        }
        average/=numbers.length;
        System.out.println(average);
    }

}
