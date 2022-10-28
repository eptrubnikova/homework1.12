import Author.Author;

public class Book {

    String nameBook;
    Author authorName;
    int yearPublisher;

    public Book(String nameBook, int yearPublisher) {
        this.nameBook = nameBook;
        this.yearPublisher = yearPublisher;

    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public int setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;

        return yearPublisher;
    }
}
