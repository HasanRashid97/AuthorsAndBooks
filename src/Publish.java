import java.util.ArrayList;

public class Main {

    Author author1;
    Author author2;
    Author author3;

    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    ArrayList<Author> authors;

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        createAuthor();
        addAuthorsToList();
        createBook();
        addBookToAuthor();
        printAllInfo();
    }

    public void createAuthor() {
        author1 = new Author("George Orwell", 'M', "bigbrotheriswatching2@gmail.com");
        author2 = new Author("Fyodor Dostojevsky", 'M', "nosubjectivemorality@live.rn");
        author3 = new Author("Judith Butler", 'F', "genderisaconstruct@yahoo.com");
    }

    public void addAuthorsToList() {
        authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
    }

    public void createBook() {
        book1 = new Book("1984", author1, 192, author1.getName(), author1.getGender(), author1.getEmail());
        book2 = new Book("Crime and Punishment", author2, 263, author2.getName(), author2.getGender(), author2.getEmail());
        book3 = new Book("The Idiot", author2, 211, author2.getName(), author2.getGender(), author2.getEmail());
        book4 = new Book("The Brothers Karamazov", author2, 457, author2.getName(), author2.getGender(), author2.getEmail());
        book5 = new Book("Gender Trouble", author3, 101, author3.getName(), author3.getGender(), author3.getEmail());
        book6 = new Book("Undoing Gender", author3, 94, author3.getName(), author3.getGender(), author3.getEmail());
    }

    public void addBookToAuthor() {
        author1.addBook(book1);
        author2.addBook(book2);
        author2.addBook(book3);
        author2.addBook(book4);
        author3.addBook(book5);
        author3.addBook(book6);
    }

    public void printAllInfo() {
        System.out.println("\nAUTHORS AND BOOKS");
        for (int i1 = 0; i1 < authors.size(); i1++) {
            System.out.printf("\n%-22s%c%35s",authors.get(i1).getName(), authors.get(i1).getGender(), authors.get(i1).getEmail());
            for (int i2 = 0; i2 < authors.get(i1).getBooks().size(); i2++) {
                System.out.printf("\n %5s%-49s%d", "", authors.get(i1).getBooks().get(i2).getTitle(), authors.get(i1).getBooks().get(i2).getNumPages());
            }


        }


    }

}