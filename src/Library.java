import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean matches(String title, String author) {
        return this.title.equalsIgnoreCase(title) && this.author.equalsIgnoreCase(author);
    }
}

public class Library {
    private ArrayList<Book> books; // List to store books
    private String issueDate;
    private Scanner sc;

    public Library() {
        this.books = new ArrayList<>();
        this.sc = new Scanner(System.in);
        this.issueDate = "hi";
    }

    public void addBooks(String title, String author) {
        this.books.add(new Book(title, author));
    }

    public boolean searchBook(String searchTitle, String searchAuthor) {
        for (Book book : books) {
            if (book.matches(searchTitle, searchAuthor)) {
                System.out.println("The book: \"" + searchTitle + "\" by " + searchAuthor + " is available.");
                return true;
            }
        }
        System.out.println("The book is not available.");
        return false;
    }

    public boolean removeBook(String titleToRemove, String authorToRemove) {
        for (Book book : books) {
            if (book.matches(titleToRemove, authorToRemove)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public void displayTitlesAndAuthors() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println("\"" + book.getTitle() + "\" by " + book.getAuthor());
        }
    }

    public void issueBook(String needTitle, String author) {
        System.out.println("Please wait while we find your book...");
        if (searchBook(needTitle, author)) {
            System.out.println("You can issue it for 30 days.");
            System.out.println("If the book is not returned within 30 days, you will be fined.");
            System.out.print("If you agree with the rules, you can issue the book. Do you agree? (Yes/No): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("Yes") && removeBook(needTitle, author)) {
                System.out.print("Please enter the issue date (DD-MM-YYYY): ");
                this.issueDate = sc.nextLine();
                System.out.println("\nSuccessfully issued the book.");
            } else {
                System.out.println("You disagreed, so you can't take the book.");
            }
        } else {
            System.out.println("Sorry, you cannot issue this book because it's not available.");
        }
    }

    public void returnBook(String needTitle, String author) {
        if (!issueDate.equals("hi")) {
            addBooks(needTitle, author);
            System.out.println("The book: \"" + needTitle + "\" by " + author + " has been returned successfully.");

            System.out.print("Enter the return date (DD-MM-YYYY): ");
            String returnDate = sc.nextLine();

            calculateDaysBetween(issueDate, returnDate);
        } else {
            System.out.println("You don't have any book to return.");
        }
    }

    private void calculateDaysBetween(String date1, String date2) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate firstDate = LocalDate.parse(date1, dateFormatter);
        LocalDate secondDate = LocalDate.parse(date2, dateFormatter);

        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("You returned the book after " + daysBetween + " days.");

        if (daysBetween > 30) {
            long penaltyDays = daysBetween - 30;
            System.out.println("You have to pay a penalty because you took " + penaltyDays + " days longer than the allowed 30 days to return the book.");
        }
    }
}
