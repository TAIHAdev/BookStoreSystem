public class BookReturn {
    private int id;
    private int borrowId;
    private String returnDate;

    public BookReturn(int id, int borrowId, String returnDate) {
        this.id = id;
        this.borrowId = borrowId;
        this.returnDate = returnDate;
        BookBorrow bookBorrow = UtilFunctions.searchBookBorrowById(borrowId);
        Book book = UtilFunctions.searchBookById(bookBorrow.getBookId());
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
