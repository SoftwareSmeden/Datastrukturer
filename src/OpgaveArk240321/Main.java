package OpgaveArk240321;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Opgave 2:
        System.out.println("Opgave 2:");
        SuperligaKlub k1 = new SuperligaKlub("GBK","Gladsaxe","2860",5,3,8,12,2,1, new ArrayList<>(Arrays.asList("Jan","Anders","Bent")));
        SuperligaKlub k2 = new SuperligaKlub("FCK","København","2100",22,4,26,32,6,12,new ArrayList<>(Arrays.asList("Gert","Mette","Niels")));
        SuperligaKlub k3 = new SuperligaKlub("AB","Ballerup","2650",8,2,10,13,0,0,new ArrayList<>(Arrays.asList("Paul","Mads","Johnny")));
        SuperligaKlub k4 = new SuperligaKlub("Horsens","Horsens","9800",21,6,27,33,2,0,new ArrayList<>(Arrays.asList("Gitte","Troels","Bente")));
        SuperligaKlub k5 = new SuperligaKlub("Brøndby","Brøndby","2550",0,11,11,2,11,11,new ArrayList<>(Arrays.asList("Henrik","Tom","Daniel")));
        SuperligaKlub[] hold = {k1,k2,k3,k4,k5};
        List<SuperligaKlub> list = new ArrayList<>(Arrays.asList(hold));

        BubbleSortComp(hold);
        for (int i = 0; i < hold.length; i++) {
            System.out.printf("Klub: %-10s - Vundne kampe: %d \n",hold[i].getKlubnavn(),hold[i].getVundneKampe());
        }

        //Opgave 3:
        /*
        Opretter endnu en compareTo i Superliga klassen.
         */

        //Opgave 4:
        System.out.println("\nOpgave 4:");
        BubbleSortComparable(hold,new NavnComparable());
        for (int i = 0; i < hold.length; i++) {
            //System.out.printf("Klub: %-10s - Vundne kampe: %d\n",hold[i].getKlubnavn(), hold[i].getVundneKampe());
        }
        //BubbleSortComparable(hold, new VundneKampeComparable());
        for (int i = 0; i < hold.length; i++) {
            //System.out.printf("Vundne kampe: %-5d - klub: %s\n",hold[i].getVundneKampe(),hold[i].getKlubnavn());
        }

        //Opgave 5:
        System.out.println("\nOpgave 5:");
        String[] tekst = {"Jan","Arne","Jens","Troels","Mette","Daniel"};
        Integer[] tal = {1,2,5,8,434,22,1,-12,-2};

        Bubblesort bubble = new Bubblesort();
        //bubble.bubbleSort(tekst, tekst.length, new StringComparable());
        //bubble.bubbleSort(tal,tal.length, new IntegerComparable());
        Heapsort heap = new Heapsort();
        //heap.heapSort(tekst,tekst.length,new StringComparable());
        //heap.heapSort(tal, tal.length, new IntegerComparable());
        Insertionsort insertion = new Insertionsort();
        //insertion.insertionSort(tekst, tekst.length, new StringComparable());
        //insertion.insertionSort(tal, tal.length, new IntegerComparable());
        SelectionSort selection = new SelectionSort();
        selection.selectionSort(tekst, tekst.length, new StringComparable());
        selection.selectionSort(tal, tal.length, new IntegerComparable());

        for (int i = 0; i < tekst.length; i++) {
            //System.out.println("BubbleSort string: "+tekst[i]);
            //System.out.println("HeapSort string: "+tekst[i]);
            //System.out.println("InsertionSort string: "+tekst[i]);
            System.out.println("SelectionSort string: "+tekst[i]);
        }
        for (int i = 0; i < tal.length; i++) {
            //System.out.println("BubbleSort tal: "+tal[i]);
            //System.out.println("HeapSort tal: "+tal[i]);
            //System.out.println("InsertionSort tal: "+tal[i]);
            System.out.println("SelectionSort tal: "+tal[i]);
        }

        //Opgave 6:
        System.out.println("\nOpgave 6:");
        System.out.println("Sortering på klub navne:");
        BubbleSortComparator(hold,new NavnComparator());
        for (int i = 0; i < hold.length; i++) {
            System.out.printf("Klub: %-10s - Vundne kampe: %d\n",hold[i].getKlubnavn(), hold[i].getVundneKampe());
        }
        System.out.println("\nSortering på vundne kampe:");
        BubbleSortComparator(hold,new VundneKampeComparator());
        for (int i = 0; i < hold.length; i++) {
            System.out.printf("Klub: %-10s - Vundne kampe: %d\n",hold[i].getKlubnavn(), hold[i].getVundneKampe());
        }
    }

    //Opgave 2:
    public static <E extends Comparable<E>> void BubbleSortComp(E[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) < 0){
                    E temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    //Opgave 4/6:
    public static <E extends Comparable<E>> void BubbleSortComparable(E[] list, ComparableAll c){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (c.compareTo(list[i],list[j]) < 0){
                    E temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
    public static <C extends Comparator<C>> void BubbleSortComparator(C[] list, ComparatorAll c){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (c.compare(list[i],list[j]) < 0){
                    C temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
