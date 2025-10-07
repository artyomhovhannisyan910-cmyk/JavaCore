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
        System.out.println(" 10 = " + array.GetByIndex(4)); // index
        array.set(1, 44);
        array.print();
        array.add(2, 22);
        array.print();
        array.deleteByIndex(1);
        System.out.println("100 ? " + array.exists(100));
        System.out.println("22 ? " + array.exists(22));
        System.out.println("44 index = " + array.getIndexByValue(44));
        System.out.println("157 index = " + array.getIndexByValue(157));
    }
}
