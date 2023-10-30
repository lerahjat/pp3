public class Book {
    String title;
    String author;
    String publisher;
    int pageCount;
    int currentPage = 0;

    public void displayMetadata() {
        System.out.printf("Title: %s\nAuthor: %s\nPublisher: %s\nCurrent page: %d/%d\n",
                this.title, this.author,
                this.publisher, this.currentPage,
                this.pageCount);
    }

    public Boolean advancePage() {
        return this.setPage(this.currentPage + 1);
    }

    public Boolean advancePageBackwards() {
        return this.setPage(this.currentPage - 1);
    }

    public void resetPage() {
        this.setPage(0);
    }

    public Boolean setPage(int page) {
        if (page < 0 || page > this.pageCount - 1)
            return false;

        this.currentPage = page;

        return true;
    }
}