package homework.library;

public class Book {
    public String title;
    public String authorName;
    private double price;
    private String id;
    private int quantity;

    public Book(String id, String title, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }

    public Book(String bookA, String s, int i) {
    }

    public static void printAllBooks() {

    }

    public static void searchBooksByPriceRange(int i, int i1) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void printBookInfo() {

    }
}

