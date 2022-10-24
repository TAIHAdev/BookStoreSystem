import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (BookBorrow bookBorrow : SourceCode.bookBorrows) {
            Book book = UtilFunctions.searchBookById(bookBorrow.getBookId(), SourceCode.bookSource);
            Customer customer = UtilFunctions.searchCustomerById(bookBorrow.getCustomerId(), SourceCode.customers);
            System.out.println(book.getName() + " is borrowed by " + customer.name() + " on " + bookBorrow.getBorrowDate());
        }
        System.out.println("Input id of a book that you want to track: ");
        Scanner scanner = new Scanner(System.in);
        int bookSearchingId = scanner.nextInt();
        for (BookBorrow bookBorrow : SourceCode.bookBorrows) {
            if (bookBorrow.getBookId() == bookSearchingId) {
                System.out.println("This book this borrowed on " + bookBorrow.getBorrowDate());
            }
        }
        for (BookReturn bookReturn : SourceCode.bookReturns) {
            BookBorrow bookBorrow = UtilFunctions.searchBookBorrowById(bookReturn.getBorrowId(), SourceCode.bookBorrows);
            if (bookBorrow.getBookId() == bookSearchingId) {
                System.out.println("This book is returned on " + bookReturn.getReturnDate());
            }
        }
        // Bài này sẽ có một số lỗi về input validation
    }
}
