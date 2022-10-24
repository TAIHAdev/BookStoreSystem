package dataSource;

import entity.Author;
import entity.Book;
import entity.BookBorrow;
import entity.BookType;

public class Database {
    public static Book book1 = new Book(1, "To kill a mocking bird", 5, new Author[]{new Author(1, "Harper Lee")}, 978 - 3 - 16 - 148410);
    public static Book book2 = new Book(2, "Moby Dick", 4, new Author[] {new Author(2, "Herman Melville")}, 978 - 3 - 16 - 148411);
    public static Book[] bookSource = {book1, book2};
    public static Type type1 = new Type(1, "novel");
    public static Type type2 = new Type(2, "thriller");
    public static Type type3 = new Type(3, "adventure fiction");
    public static Type type4 = new Type(4, "Fantasy");
    public static BookType book1Type1 = new BookType(1, 1, 1);
    public static BookType book1Type2 = new BookType(2, 2, 1);
    public static BookType book2Type1 = new BookType(3, 3, 2);
    public static BookType book2Type2 = new BookType(3, 4, 2);
    public static Customer customer1 = new Customer(1, "Tai");
    public static Customer[] customers = {customer1};
    public static BookBorrow[] bookBorrows = new BookBorrow[] {new BookBorrow(1, 1, 1, "24-10-2022"), new BookBorrow(2,2,1,"24-10-2022")};
    public static BookReturn[] bookReturns = new BookReturn[] {new BookReturn(1, 2, "25-10-2022")};

}
