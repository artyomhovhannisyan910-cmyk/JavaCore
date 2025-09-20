package HomeWork4;

import java.util.Arrays;

public class ArrayHomework {
    public static void main(String[] args) {
        // 1
        int[] numbers = {1, 6, 2, 3, 6, 4, 5, 7, 8, 9, 10};
        int n = 6;
        int nCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {

                nCount++;
            }

        }
        if (nCount == 0) {
            System.out.print(n + "թիվը չկա մասիվում");
        } else {
            System.out.print(n + "թվից կա մասիվում" + nCount + "հատ");
        }
        System.out.println();

        System.out.println("-----------------------");


        //2
        int firstValue = 0;
        int lastValue = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            firstValue = numbers[i];
            lastValue = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = firstValue;
            numbers[i] = lastValue;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        System.out.println("----------------------");

        //3
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1 + i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    count++;


            }
        }

        System.out.print("Կրկնվող թվերի քանակը " + count + "  ");
        System.out.println();
        System.out.println("-------------------------");

    }





}







