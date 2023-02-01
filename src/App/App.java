package App;

import Author.Authors;
import Book.Books;

public class App {
    public static void main(String[] args)
    {
        Authors firstAuthor = new Authors("Лев", "Толстой");
        Books firstBook = new Books("Война и мир", firstAuthor, 1873);
        Authors secondAuthor = new Authors("Александр", "Пушкин");
        Books secondBook = new Books("Евгений Онегин", secondAuthor, 1830);
        System.out.println(firstBook);
        System.out.println(secondBook);
        secondBook.setYear(1825);
        System.out.println(secondBook);
    }
}
