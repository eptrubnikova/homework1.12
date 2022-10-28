import Author.Author;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Про Git", 2014);
        System.out.println("name.book = " + book1.getNameBook());
        System.out.println("book.yearPublisher = " + book1.getYearPublisher());
        book1.setYearPublisher(2018);
        System.out.println("book1.getYearPublisher() = " + book1.getYearPublisher());
        Author authorBook1 = new Author("Бен", "Штрауб");
        System.out.println("book.authorName = " + authorBook1.getName() + " " + authorBook1.getLastName());

        Book book2 = new Book("Аэропорт", 1968);
        System.out.println("name.book = " + book2.getNameBook());
        System.out.println("book.yearPublisher = " + book2.getYearPublisher());

        Author authorBook2 = new Author("Артур", "Хейли");
        System.out.println("book1.authorName = " + authorBook2.getName() + " " + authorBook2.getLastName());
    }
}