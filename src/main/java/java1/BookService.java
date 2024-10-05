package java1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Books> getBooksInSorting(){
        List<Books> books=new NooksDAO().getBook();
        Collections.sort(books,new MyComparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSorting());
    }
}
class MyComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getName().compareTo(o2.getName());
    }
}