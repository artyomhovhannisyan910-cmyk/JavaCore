package DynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        array.add(2);
        array.add(4);
        array.add(6);
        array.add(8);
        array.add(10);

        System.out.println("new elements");
        array.print();

        System.out.println(" 6 = " + array.GetByIndex(2)); // index=2 → 6
        System.out.println(" 10 = " + array.GetByIndex(4)); // index=4 → 10
    }
}
