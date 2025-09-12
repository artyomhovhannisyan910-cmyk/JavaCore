package HomeWork2;

public class Figurepainter4 {
    public static void main(String[] args) {
        int num= 5;
        for (int i = 5; i >= 1; i--) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


