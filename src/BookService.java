public class BookService {
    public static Book getBookById(int id) {
        for (var book : Database.bookSource) {
            if (book.getId() == id) return book;
        }
        return null;
    }
}
