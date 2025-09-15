public class librarymanagement {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public librarymanagement(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}