package singlelinkedlistusingbuiltinlinkedlist;

import java.util.LinkedList;

public class SingleLinkedListUsingBuiltInLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);
        list.addFirst(40);
        list.addFirst(50);
        System.out.println(list);
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(60));
        list.remove(0);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}