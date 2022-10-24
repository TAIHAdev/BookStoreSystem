public class BookBorrow {
    private int id;
    private int bookId;
    private int customerId;
    private String borrowDate;

    public BookBorrow(int id, int bookId, int customerId, String borrowDate) {
        this.id = id;
        this.bookId = bookId;
        this.customerId = customerId;
        this.borrowDate = borrowDate;
        Book borrowBook = UtilFunctions.searchBookById(bookId);
        borrowBook.setStock(borrowBook.getStock() - 1);
        // nếu như phải để ý trường hợp không đủ sách thì em sẽ tạo một hàm if nếu như không đủ sách thì để cho thí = null;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
}
