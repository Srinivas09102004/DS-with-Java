package doublelinkedlistusingbuiltinlinkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
class DoubleLinkedList {
 LinkedList linklist = new LinkedList();
 public void add(int item) {
 linklist.add(item);
 }
 public int remove() {
 return (int) linklist.remove();
 }
 public void printlist() {
 ListIterator<Integer> lstr = linklist.listIterator();
 System.out.println("printing data forward direction");
 while (lstr.hasNext()) {
 System.out.println(lstr.next());
 }
 System.out.println("printing data backward direction");
 while (lstr.hasPrevious()) {
 System.out.println(lstr.previous());
 }
 }
}
public class DoubleLinkedListUsingBuiltInLinkedList {
 public static void main(String[] args) {
 DoubleLinkedList d1 = new DoubleLinkedList();
 d1.add(10);
 d1.add(20);
 d1.add(30);

 d1.printlist();

 }

}