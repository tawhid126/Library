import java.util.*;
public class BookRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Rajshahi University Central Library ");

        Library library = new Library();
        int press;

        /*
         Pre-populate the library with some books
         */

        library.addBooks("To Kill a Mockingbird", "Harper Lee");
        library.addBooks("1984", "George Orwell");
        library.addBooks("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBooks("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        library.addBooks("Pride and Prejudice", "Jane Austen");
        library.addBooks("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBooks("The Catcher in the Rye", "J.D. Salinger");
        library.addBooks("Moby Dick", "Herman Melville");
        library.addBooks("The Odyssey", "Homer");
        library.addBooks("Great Expectations", "Charles Dickens");
        library.addBooks("The Grapes of Wrath", "John Steinbeck");
        library.addBooks("The Scarlet Letter", "Nathaniel Hawthorne");
        library.addBooks("The Picture of Dorian Gray", "Oscar Wilde");
        library.addBooks("The Brothers Karamazov", "Fyodor Dostoevsky");
        library.addBooks("War and Peace", "Leo Tolstoy");
        library.addBooks("Anna Karenina", "Leo Tolstoy");
        library.addBooks("Hamlet", "William Shakespeare");
        library.addBooks("Macbeth", "William Shakespeare");
        library.addBooks("Romeo and Juliet", "William Shakespeare");
        library.addBooks("The Iliad", "Homer");
        library.addBooks("The Divine Comedy", "Dante Alighieri");
        library.addBooks("One Hundred Years of Solitude", "Gabriel García Márquez");
        library.addBooks("Love in the Time of Cholera", "Gabriel García Márquez");
        library.addBooks("The Kite Runner", "Khaled Hosseini");
        library.addBooks("The Alchemist", "Paulo Coelho");
        library.addBooks("The Little Prince", "Antoine de Saint-Exupéry");
        library.addBooks("The Hobbit", "J.R.R. Tolkien");
        library.addBooks("The Hunger Games", "Suzanne Collins");
        library.addBooks("Divergent", "Veronica Roth");
        library.addBooks("The Fault in Our Stars", "John Green");
        library.addBooks("The Book Thief", "Markus Zusak");
        library.addBooks("The Giver", "Lois Lowry");
        library.addBooks("The Maze Runner", "James Dashner");
        library.addBooks("The Perks of Being a Wallflower", "Stephen Chbosky");
        library.addBooks("The Notebook", "Nicholas Sparks");
        library.addBooks("The Shack", "William P. Young");
        library.addBooks("The Help", "Kathryn Stockett");
        library.addBooks("The Girl on the Train", "Paula Hawkins");
        library.addBooks("The Da Vinci Code", "Dan Brown");
        library.addBooks("The Martian", "Andy Weir");
        library.addBooks("The Goldfinch", "Donna Tartt");
        library.addBooks("The Nightingale", "Kristin Hannah");
        library.addBooks("The Hate U Give", "Angie Thomas");
        library.addBooks("The Testaments", "Margaret Atwood");
        library.addBooks("The Silent Patient", "Alex Michaelides");
        library.addBooks("The Dutch House", "Ann Patchett");
        library.addBooks("The Vanishing Half", "Brit Bennett");
        library.addBooks("The Midnight Library", "Matt Haig");
        library.addBooks("To Kill a Mockingbird", "Harper Lee");
        library.addBooks("1984", "George Orwell");
        library.addBooks("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBooks("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        library.addBooks("Pride and Prejudice", "Jane Austen");
        library.addBooks("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBooks("The Catcher in the Rye", "J.D. Salinger");
        library.addBooks("Moby Dick", "Herman Melville");
        library.addBooks("The Odyssey", "Homer");
        library.addBooks("Great Expectations", "Charles Dickens");
        library.addBooks("The Grapes of Wrath", "John Steinbeck");
        library.addBooks("The Scarlet Letter", "Nathaniel Hawthorne");
        library.addBooks("The Picture of Dorian Gray", "Oscar Wilde");
        library.addBooks("The Brothers Karamazov", "Fyodor Dostoevsky");
        library.addBooks("War and Peace", "Leo Tolstoy");
        library.addBooks("Anna Karenina", "Leo Tolstoy");
        library.addBooks("Hamlet", "William Shakespeare");
        library.addBooks("Macbeth", "William Shakespeare");
        library.addBooks("Romeo and Juliet", "William Shakespeare");
        library.addBooks("The Iliad", "Homer");
        library.addBooks("The Divine Comedy", "Dante Alighieri");
        library.addBooks("One Hundred Years of Solitude", "Gabriel García Márquez");
        library.addBooks("Love in the Time of Cholera", "Gabriel García Márquez");
        library.addBooks("The Kite Runner", "Khaled Hosseini");
        library.addBooks("The Alchemist", "Paulo Coelho");
        library.addBooks("The Little Prince", "Antoine de Saint-Exupéry");
        library.addBooks("The Hobbit", "J.R.R. Tolkien");
        library.addBooks("The Hunger Games", "Suzanne Collins");
        library.addBooks("Divergent", "Veronica Roth");
        library.addBooks("The Fault in Our Stars", "John Green");
        library.addBooks("The Book Thief", "Markus Zusak");
        library.addBooks("The Giver", "Lois Lowry");
        library.addBooks("The Maze Runner", "James Dashner");
        library.addBooks("The Perks of Being a Wallflower", "Stephen Chbosky");
        library.addBooks("The Notebook", "Nicholas Sparks");
        library.addBooks("The Shack", "William P. Young");
        library.addBooks("The Help", "Kathryn Stockett");
        library.addBooks("The Girl on the Train", "Paula Hawkins");
        library.addBooks("The Da Vinci Code", "Dan Brown");
        library.addBooks("The Martian", "Andy Weir");
        library.addBooks("The Goldfinch", "Donna Tartt");
        library.addBooks("The Nightingale", "Kristin Hannah");
        library.addBooks("The Hate U Give", "Angie Thomas");
        library.addBooks("The Testaments", "Margaret Atwood");
        library.addBooks("The Silent Patient", "Alex Michaelides");
        library.addBooks("The Dutch House", "Ann Patchett");
        library.addBooks("The Vanishing Half", "Brit Bennett");
        library.addBooks("The Midnight Library", "Matt Haig");

        do {
            System.out.println("\nPress 0 to Exit Application.");
            System.out.println("Press 1 to Add a New Book.");
            System.out.println("Press 2 to Show All Books.");
            System.out.println("Press 3 to Search for a Book.");
            System.out.println("Press 4 to Remove a Book.");
            System.out.println("Press 5 to issue a Book.");
            System.out.println("Press 6 to return Book.");
            System.out.println();
            System.out.print("Your Press : ");
            press = sc.nextInt();
            sc.nextLine();

            switch (press) {
                case 1:
                    System.out.println("Enter Book Title:");
                    String title = sc.nextLine();
                    System.out.println("Enter Book Author:");
                    String author = sc.nextLine();
                    library.addBooks(title, author);
                    System.out.println("The book: \"" + title + "\" by " + author + " is sucessfully added.");
                    break;
                case 2:
                    library.displayTitlesAndAuthors();
                    break;
                case 3:
                    System.out.print("Enter Book Title to Search : ");
                    String searchTitle = sc.nextLine();
                    System.out.print("\n" +"Enter Book Author to Search : ");
                    String searchAuthor = sc.nextLine();
                    library.searchBook(searchTitle, searchAuthor);
                    break;
                case 4:
                    System.out.print("Enter Book Title to Remove : ");
                    String removeTitle = sc.nextLine();
                    System.out.print("\n" +"Enter Book Author to Remove : ");
                    String removeAuthor = sc.nextLine();

                    if (library.removeBook(removeTitle, removeAuthor)){
                        System.out.println("The book: \"" + removeTitle + "\" by " + removeAuthor + " has been removed successfully.");
                    }else {
                        System.out.println("The book is not available for removal.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Book for issue : ");
                    String needTitle = sc.nextLine();

                    System.out.print("\n" + "Enter Book Author : ");
                    String Author = sc.nextLine();
                    library.issueBook(needTitle, Author);


                    break;
                case 6:
                    System.out.print("Enter Book for returned : ");
                    String returnedTitle = sc.nextLine();
                    System.out.print("\n" +"Enter Book Author : ");
                    String returnedAuthor = sc.nextLine();
                    library.returnBook(returnedTitle , returnedAuthor);
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (press != 0);

        sc.close();
    }
}