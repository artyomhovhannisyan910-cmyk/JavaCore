package HomeWork4;

public class ArrayHomework4 {
    public static void main(String[] args) {

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] chars1 = new char[]{'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'ո', 'ւ'};
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars[i] == chars1[j])
                    count++;
                break;


            }

        }
        System.out.println("Քանակը" + "  " + count);
    }
}
