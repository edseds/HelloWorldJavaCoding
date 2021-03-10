package com;

import java.sql.Array;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataStructures {
    public static void arrayListExample()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //ArrayList arrayList1 = new ArrayList();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList);

        System.out.println("Size:" + arrayList.size());

        System.out.println("Get an element: " + arrayList.get(1));

        arrayList.remove(0);
        System.out.println(arrayList.toString());
    }

    public static void linkedListExample()
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println(linkedList);

        System.out.println("Size:" + linkedList.size());

        System.out.println("First element:" + linkedList.getFirst());
        System.out.println("Last element:" + linkedList.getLast());

        System.out.println("2nd element: " + linkedList.get(1));

        linkedList.remove(0);
        linkedList.remove();

        System.out.println(linkedList);

        linkedList.remove((Integer) 30);
        //linkedList.remove((Integer) 30);

        System.out.println(linkedList);

    }

    public static void stackExample()
    {
        Stack<String> stackOfCards = new Stack<>();

        // Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();


        // Popping items from the Stack
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println(stackOfCards.size());
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);

    }

    public static void queueExample()
    {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>(3);
        Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);

        queue.add(4);
        queue.add(2);
        queue.add(1);
        queue.add(8);

        System.out.println("Queue => " + queue);
        System.out.println("Peek:" + queue.peek());
        queue.remove();
        System.out.println("Queue => " + queue);

        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(2);
        linkedBlockingQueue.add(3);
        //linkedBlockingQueue.add(4);
        System.out.println("Is Empty: " + linkedBlockingQueue.isEmpty());
        System.out.println("Offer:" + linkedBlockingQueue.offer(10));
        linkedBlockingQueue.poll();
        System.out.println("Linked Blocking Queue => " + linkedBlockingQueue);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(numberComparator);


        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(8);

        System.out.println("Priority Queue => " + priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println("Priority Queue => " + priorityQueue);


    }


    static Comparator<Integer> numberComparator = new Comparator<Integer>() {

        @Override
        public int compare(Integer num1, Integer num2) {
            if(num2 < num1)
            {
                return -1;
            } else
            {
                return 0;
            }
        }
    };

    public static void dequeExample()
    {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> de_que = new ArrayDeque<Integer>(10);

        deque.add(10);
        deque.add(20);
        deque.add(30);
        System.out.println("Deque => " + deque);

        deque.addLast(40);
        System.out.println("Deque => " + deque);

        deque.addFirst(50);
        deque.add(60);
        System.out.println("Deque => " + deque);

        deque.pop();
        System.out.println("After Pop Deque => " + deque);

        for (Integer element : deque)
        {
            System.out.println("Element : " + element);
        }


        Iterator<Integer> dItr= deque.iterator();
        while (deque.descendingIterator().hasNext())
        {
            System.out.println(dItr.next());
            dItr.remove();
        }


        System.out.println("Is Empty:" + deque.isEmpty());
        if(!deque.isEmpty()) {

            deque.removeLast();
            System.out.println("After Poll Deque => " + deque);

            deque.removeFirst();
            System.out.println("First Poll Deque => " + deque);
        }
    }

    public static void treeSetExample()
    {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(20);
        ts.add(50);
        ts.add(60);

        System.out.println("Tree Set =>" + ts);

        System.out.println("First:" + ts.first());

        //Element greater than specified
        System.out.println(ts.higher(50));

        //The method takes in an upper limit and a lower limit and returns all the elements
        // mentioned in the range. The lower limit is included if the element is present
        // within the set and the upper limit is excluded
        System.out.println(ts.subSet(20,60));

        System.out.println(ts.descendingSet());


    }

    public static void hashMapExample()
    {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(4,"Grapes");


        System.out.println("Get Value:" + map.get(1));

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        int maxValueInMap=(Collections.max(map.keySet()));

        System.out.println(map.get(maxValueInMap));

    }

    //A map contains values on the basis of key, i.e. key and value pair
    public static void hashMapSort()
    {
        int[][] value = {{10,10}};

        System.out.println(value[0][0]);

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting:");
        for(Map.Entry m : hmap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Map<Integer, String> map = new TreeMap<>(hmap);
        System.out.println("After Sorting:");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void hashTableExample()
    {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(6, "six");
        hashtable.put(3, "three");
        hashtable.put(4, "four");
        hashtable.put(5, "five");

        for (Map.Entry entry:hashtable.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
