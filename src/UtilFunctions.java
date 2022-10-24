public class UtilFunctions {
    public static Book searchBookById(int id, Book[] books) {
        for (var book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }
    public static BookBorrow searchBookBorrowById(int id, BookBorrow[] bookBorrows) {
        for (var book : bookBorrows) {
            if (book.getId() == id) return book;
        }
        return null;
    }
    public static Customer searchCustomerById(int id, Customer[] customers) {
        for (var customer : customers) {
            if (customer.id() == id) return customer;
        }
        return null;
    }

}
