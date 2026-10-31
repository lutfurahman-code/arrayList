import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Collection
        // List interface: An ordered collection that contains duplicate elements
        // ArrayList, LinkedList

        // fixed fix. dynamic size

//        int[] number = new int[3];
//
//        number[0] = 2;
//        number[1] = 3;
//        number[2] = 7;
        // [][][][][][][][] Access is O(1)
        // adding element is O(n)
        // remove elemet is O(n)

        List<Integer> numbers = new ArrayList<>();

        numbers.add(30); // remove 0
        numbers.add(50); // 1 new 2
        numbers.add(10); // 2 new 3

        // Insert 15 to index 1
        numbers.add(1, 15);

        System.out.println("Numbers: " + numbers);

        System.out.println("First Number: " + numbers.get(0));

        System.out.println("Contains 50: " + numbers.contains(50));

        // indexOf
        System.out.println("Index of 50: " + numbers.indexOf(50));

        // 0, 100

        numbers.set(0, 100);
        System.out.println(numbers);

        // enhamced loop

        // employee
        // list empolyees

        //List<Emplyees> emplyees = new ArrayList<>();

        for(Integer number: numbers){
            System.out.println(number);
        }

        // String

        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Sarah");
        names.add("Mike");

        names.add(1, "Emma");

        System.out.println(names);

        // check if it contains a name

        System.out.println(names.contains("Mike"));

        for(String name: names){
            System.out.println("Name: " + name);
        }

        List<Book> books = new ArrayList<>();

        Book book1 = new Book(101, "Java Programming");

        books.add(book1);
        books.add(new Book(102, "C# Programming"));
        books.add(new Book(103, "General Books"));
        System.out.println(books);

        String bookName = "General Books";
        // compare two value searchId
        // id: 101 name: java progarmming
        for(Book book: books){
            if(book.getName().equals(bookName)){
                System.out.println(book);
            }
        }

        int searchId = 106;
        // id and name
        for(Book book: books){
            if(book.getId() == searchId){
                System.out.println(book);
            } else {
                System.out.println("Book not found");
                break;
            }

        }


















    }
}