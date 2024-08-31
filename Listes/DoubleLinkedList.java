package doublelinkedlist;
public class DoubleLinkedList {
 class Node {
 private int value;
 private Node next;
 private Node previous;
 public Node(int value) {
 this.value = value;
 }
 }
 private Node head;
 private Node tail;
 private int size;
 public void addFirst(int item) {

 }
 public void addLast(int item) {

 }
 private boolean isEmpty() {

 }
 public void show() {

 }

 public static void main(String[] args) {
 var dll = new DoubleLinkedList();
 dll.addFirst(1);
 dll.addFirst(2);
 dll.addFirst(3);
 dll.show();
 dll.addLast(4);
 dll.addLast(5);
 dll.addLast(6);
 dll.show();
 }
}