package homework.library;

import java.util.ArrayList;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;
    private ArrayList<Book>books3;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;

    }
    public void searchBookByPriceRange(double minPrice , double maxPrice) {
        System.out.println("Գրքեր " + minPrice + " - " + maxPrice + " դրամ միջակայքում.");
        boolean found = false;
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                book.printBookInfo();
                found = true;

            }
        }
        if (!found) {

            System.out.println("Համապատասխան գրքեր չեն հայտնվել");
        }
    }
    public void printALlBooks(){
        for (Book book : books) {
            book.printBookInfo();
        }
    }



    private void extend() {
        Book[] temp = new Book[size + 10];
        System.arraycopy(books, 0, temp, 0, size);
        books = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword)) ;
            System.out.println(books[i]);
        }
    }

    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteByID(String Id) {
        boolean found = false;
        int ID;

        for (int i = 0; i < size; i++) {
            if (books[i].getId() == Id) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--size] = null;
                System.out.println("Book with ID " + Id + " was deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No book with ID " + Id + " found.");

        }
    }
}





