package homework.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static homework.library.Commands.*;

public class LibraryDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) {
        Book book =(new Book("Հովազաձորի գաղտնիքը", "Ա. Ավագյան", 150.0, 10));
       Book book1 =(new Book("Ծովի երգը", "Լ. Մաթևոսյան", 90.0, 5));
       Book book2=(new Book("Արյունոտ արև", "Ս. Սարգսյան", 200.0, 3));

        // Տպում է բոլոր գրքերը
        System.out.println(" Բոլոր գրքերը՝");
        Book.printAllBooks();

        // Փնտրում է 100-200 դրամ միջակայքում գրքեր
        System.out.println("Փնտրման արդյունք՝");
        Book.searchBooksByPriceRange(100, 200);

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    adBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case DELETE_BY_ID:
                    System.out.println("Please input to delete");
                    int IdToDelete = Integer.parseInt(scanner.nextLine());
                    bookStorage.deleteByID(String.valueOf(IdToDelete));
                    break;
                default:
                    System.err.println("Wrong command! try again");


                        }

                    }


            }

    private static void adBook() {


    }


}

