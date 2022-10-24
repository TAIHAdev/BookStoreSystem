package entity;

import entity.Book;
import entity.BookBorrow;
import service.BookBorrowService;
import service.BookService;

public class BookReturn {
    private int id;
    private int borrowId;
    private String returnDate;

    public BookReturn(int id, int borrowId, String returnDate) {
        this.id = id;
        this.borrowId = borrowId;
        this.returnDate = returnDate;
        BookBorrow bookBorrow = BookBorrowService.getBookBorrowById(borrowId);
        Book book = BookService.getBookById(bookBorrow.getBookId());
        book.setStock(book.getStock() + 1);
    }

    public int getId() {
        return id;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public String getReturnDate() {
        return returnDate;
    }
}
