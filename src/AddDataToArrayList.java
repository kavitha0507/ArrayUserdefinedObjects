import java.util.ArrayList;
import java.util.Iterator;

public class AddDataToArrayList {

    public ArrayList<Book> bookdetails() {
        ArrayList<Book> list = new ArrayList<Book>();
        //passing data using constructors
        Book b1 = new Book("John", "Death note", 1, "cartoon");
        Book b2 = new Book("brothers", "Stranger Things", 2, "suspense");
        Book b3 = new Book("Alex", "Spider man", 3, "Kids");
        Book b4 = new Book("Max", "GentleMen", 4, "Action");
        //passing data using setter
        Book b5 = new Book();
            b5.setAuthor("John");
            b5.setName("Java");
            b5.setCategory("Action");
            b5.setNumber(3);
            list.add(b1);
            list.add(b2);
            list.add(b3);
            list.add(b4);
            list.add(b5);
            return list;

        }
    }

