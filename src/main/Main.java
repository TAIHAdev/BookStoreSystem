package main;

import dataSource.Database;
import entity.Book;
import entity.BookBorrow;
import entity.BookReturn;
import entity.Customer;
import service.BookBorrowService;
import service.BookService;
import service.CustomerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (BookBorrow bookBorrow : Database.bookBorrows) {
            Book book = BookService.getBookById(bookBorrow.getBookId());
            Customer customer = CustomerService.getCustomerById(bookBorrow.getCustomerId());
            System.out.println(book.getName() + " is borrowed by " + customer.name() + " on " + bookBorrow.getBorrowDate());
        }
        System.out.println("Input id of a book that you want to track: ");
        Scanner scanner = new Scanner(System.in);
        int bookSearchingId = scanner.nextInt();
        for (BookBorrow bookBorrow : Database.bookBorrows) {
            if (bookBorrow.getBookId() == bookSearchingId) {
                System.out.println("This book this borrowed on " + bookBorrow.getBorrowDate());
            }
        }
        for (BookReturn bookReturn : Database.bookReturns) {
            BookBorrow bookBorrow = BookBorrowService.getBookBorrowById(bookReturn.getBorrowId());
            if (bookBorrow.getBookId() == bookSearchingId) {
                System.out.println("This book is returned on " + bookReturn.getReturnDate());
            }
        }
    }
}
