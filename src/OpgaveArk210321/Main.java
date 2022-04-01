package OpgaveArk210321;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Opgave 1:
        /*
        1.	Implementer metoderne i nedenstående stak-klasse efter stak-princippet, og test
            klassen i et main.
         */
        System.out.println("OPGAVE 1:");
        Stack stack = new Stack();

        //Push ints to the stack
        stack.push(1);
        stack.push(52);
        stack.push(4);
        //Print stack
        for (int i = 0; i < stack.getSize(); i++) {
            System.out.println(stack.getElements()[i]);
        }
        //Return and remove top element
        stack.pop();
        for (int i = 0; i < stack.getSize(); i++) {
            System.out.println(stack.getElements()[i]);
        }
        //Return top element in the stack
        System.out.println(stack.peek());
        //Check if stack is empty
        System.out.println(stack.empty());
        //Get stack size
        System.out.println(stack.getSize());

        //Opgave 2:
        /*
        2.	Implementer metoderne i nedenstående koe-klasse efter kø-princippet, og test klassen i et main.
         */
        System.out.println("\nOPGAVE 2:");
        Koe koe = new Koe();
        //Add variables to the que
        koe.offer(1);
        koe.offer(5);
        koe.offer(3);
        //Return and remove one element from the que. Swift every element to the left
        System.out.println("Before: "+koe);
        koe.remove();
        System.out.println("After: "+koe);
        //Return the element that have been in the que for the longest time
        System.out.println(koe.peek());
        //Check if que is empty
        System.out.println(koe.empty());
        //Get que size
        System.out.println(koe.getSize());

        //Opgave 3:
        System.out.println("\nOPGAVE 3:");
        /*
        3.  Lav et main-program, hvor der erklæres en stak der indeholder String objekter, og der gøres brug af Stak-klassen:
            Erklær:
            java.util.OpgaveArk1.Stack<String> stak = new java.util.OpgaveArk1.Stack<>();
            Vis nu brug af metoderne i Stak-klassen.
         */

        java.util.Stack<String> stak = new java.util.Stack<>();
        stak.push("Hej");
        stak.push("Anden");
        stak.push("Femmer");
        //Print stak
        for (int i = 0; i < stak.size(); i++) {
            System.out.println(stak.get(i));
        }
        //Return and remove top element
        stak.pop();
        for (int i = 0; i < stak.size(); i++) {
            System.out.println(stak.get(i));
        }
        //Return top element in the stack
        System.out.println(stak.peek());
        //Check if stack is empty
        System.out.println(stak.empty());
        //Get stack size
        System.out.println(stak.size());

        //Opgave 4:
        System.out.println("\nOPGAVE 4:");
        /*
        4. Lav et main-program, hvor der erklæres en kø der indeholder String objekter, og der gøres brug af Queue-klassen:
           Erklær:
           java.util.Queue<String> queue = new java.util.LinkedList<>();
           Vis nu brug af metoderne i Queue-klassen.
         */
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        queue.offer("Kanten");
        queue.offer("Næsten");
        queue.offer("Lyden");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());

        //Opagve 5:
        System.out.println("\nOPGAVE 5:");
        /*
        5.  Opret i main en datastruktur, og indsæt data heri.
            Prøv nogle af metoderne i Collection interfacet.
         */
        ArrayList<Integer> tal = new ArrayList<>(Arrays.asList(1,23,45,2));
        Collections.sort(tal);
        System.out.println(Collections.binarySearch(tal,45));
        System.out.println(Collections.max(tal));
        System.out.println(Collections.min(tal));
        Collections.shuffle(tal);
        System.out.println(tal);
    }
}
