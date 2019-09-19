package javaFiles;

public class BookData {

    private String title;
    private String author;
    private int price;

    public BookData(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printBook() {
        System.out.printf("タイトル: %s, 著者: %s, 値段: %d", this.title, this.author, this.price);
    }
}
