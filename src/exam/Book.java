package exam;

public class Book {
    public String title;
    public Author authorName;
    public double price;

    public Book(String title, Author authorName, double price) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
