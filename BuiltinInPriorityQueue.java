package Ques;

import java.util.PriorityQueue;

public class  BuiltinInPriorityQueue{

    public static void main(String args[]){
        PriorityQueue<String> queue = new PriorityQueue<>();
        //Add 2 strings to PriorityQueue,
        queue.add("Cat");
        queue.add("Dog");
        queue.add("Antelope");
        queue.add("Horse");

        //Loop over and display contents of Priority Queue.
        for (String element : queue) {
            System.out.println(element);
        }

        System.out.println("Peeked Element = "+ queue.peek());

        while (queue.size() > 0){
            System.out.println("Polled element = "+queue.poll());
        }
    }
}