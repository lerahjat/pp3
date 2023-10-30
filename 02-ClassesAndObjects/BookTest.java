public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.author = "M.";
        b1.pageCount = 230;
        b1.publisher = "WWD";
        b1.title = "No more";
        b1.displayMetadata();
        b1.advancePage();
        b1.displayMetadata();
    }
}
