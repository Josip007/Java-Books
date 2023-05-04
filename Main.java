import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> book = new HashMap<>();
        Set<String> uniqueBooks = new HashSet<>();
        List<String> sortedBooks = new ArrayList<>();

        System.out.println("Enter your book name and book author. When you are done, write stop");

        while(true) {
            System.out.println("Book name: ");
            String bookName = scanner.nextLine();
            if(bookName.equals("stop")) {
                break;
            }

            System.out.println("Book author: ");
            String bookAuthor = scanner.nextLine();
            if(bookAuthor.equals("stop")) {
                break;
            }

            uniqueBooks.add(bookName);
            book.put(bookName, bookAuthor);
            sortedBooks.add("Book: " + bookName + ", Author: " + bookAuthor);

        }

        sortedBooks.sort(Comparator.comparing(x -> x.split(", Author: ")[0]));

        System.out.println(sortedBooks);
    }
}
