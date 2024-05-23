import java.util.Objects;

/**
 * The Book class represents a book with certain characteristics,
 * in which the comparison and hashing methods are written incorrectly.
 */
public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    /**
     * Default constructor creates a Book object with default values.
     */
    public Book() {
        this.title = "Kobzar";
        this.author = "Shevchenko";
        this.year = 1840;
        this.price = 350;
    }

    /**
     * Constructor with parameters creates a Book object with specified values.
     *
     * @param title  the title of the book, cannot be null.
     * @param author the author of the book, cannot be null.
     * @param year   the publication year of the book.
     * @param price  the price of the book.
     */
    public Book(String title, String author, int year, double price) {
        this.title = Objects.requireNonNull(title, "Title cannot be null");
        this.author = Objects.requireNonNull(author, "Author cannot be null");
        this.year = year;
        this.price = price;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title the new title of the book, cannot be null.
     */
    public void setTitle(String title) {
        this.title = Objects.requireNonNull(title, "Title cannot be null");
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the new author of the book, cannot be null.
     */
    public void setAuthor(String author) {
        this.author = Objects.requireNonNull(author, "Author cannot be null");
    }

    /**
     * Gets the publication year of the book.
     *
     * @return the publication year of the book.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the publication year of the book.
     *
     * @param year the new publication year of the book.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets the price of the book.
     *
     * @return the price of the book.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the book.
     *
     * @param price the new price of the book.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Equals method that always returns true.
     *
     * @param obj the object to compare with.
     * @return always true.
     */
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    /**
     * HashCode method that does not comply with the principles of hashing.
     *
     * @return a fixed hash code value.
     */
    @Override
    public int hashCode() {
        return 42;
    }
}