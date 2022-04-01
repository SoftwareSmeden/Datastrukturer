package OpgaveArk280321;

import OpgaveArk240321.SuperligaKlub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Opgave 1/2:
        System.out.println("Opgave 1/2:");
        int antal = 10;
        TabelRaekke[] hashTabel = new TabelRaekke[antal];
        for (int i = 0; i < 10; i++)
            hashTabel[i] = new TabelRaekke();
        Integer tal;
        int index;
        int hashcode;
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            //1. Generer tilfældigt heltal mellem 0 og 100
            tal = ran.nextInt(100);

            //2. Bestem hashcoden for det genererede tal. Denne hashcode kan benyttes til at bestemmes index for hvor i arrayet tallet gemmes.
            hashcode = tal.hashCode();

            //3. Bestem resten ved heltalsdivision når hashcoden divideres med 10. Det der skal divideres med afgøres af arrayets længde.
            //Denne rest skal være index i arrayet hvor det genererede tal indsættes.
            index = hashcode % antal;

            //4. Indsæt det genererede tal i hashTabel på indexpladsen bestemt under punkt 3.
            hashTabel[index].raekke.add(tal);
        }
        //5. Udskriv hele indholdet af hashTabel
        for (int i = 0; i < antal; i++) {
            if (hashTabel[i].raekke.size() > 0) {
                for (int j = 0; j < hashTabel[i].raekke.size(); j++) {
                    System.out.print(hashTabel[i].raekke.get(j) + " ");
                }
            }
            System.out.println("Index: " + i);
        }

        //Opgave 3/4:
        System.out.println("\nOpgave 3/4:");
        SuperligaKlub k1 = new SuperligaKlub("GBK", "Gladsaxe", "2860", 5, 3, 8, 12, 1, 1, new ArrayList<>(Arrays.asList("Jan", "Anders", "Bent")));
        SuperligaKlub k2 = new SuperligaKlub("FCK", "København", "2100", 22, 4, 26, 32, 6, 12, new ArrayList<>(Arrays.asList("Gert", "Mette", "Niels")));
        SuperligaKlub k3 = new SuperligaKlub("AB", "Ballerup", "2650", 8, 2, 10, 13, 0, 0, new ArrayList<>(Arrays.asList("Paul", "Mads", "Johnny")));
        SuperligaKlub k4 = new SuperligaKlub("Horsens", "Horsens", "9800", 21, 6, 27, 33, 2, 0, new ArrayList<>(Arrays.asList("Gitte", "Troels", "Bente")));
        SuperligaKlub k5 = new SuperligaKlub("Brøndby", "Brøndby", "2550", 0, 11, 11, 2, 11, 11, new ArrayList<>(Arrays.asList("Henrik", "Tom", "Daniel")));
        Set<SuperligaKlub> hashSet = new java.util.HashSet<>();
        hashSet.add(k1);
        hashSet.add(k2);
        hashSet.add(k3);
        hashSet.add(k4);
        hashSet.add(k5);
        Set<SuperligaKlub> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(k1);
        linkedHashSet.add(k2);
        linkedHashSet.add(k3);
        linkedHashSet.add(k4);
        linkedHashSet.add(k5);
        Set<SuperligaKlub> treeSet = new TreeSet<>(new NavnComparator()); //Opgave 10 - new NavnComparator
        treeSet.add(k1);
        treeSet.add(k2);
        treeSet.add(k3);
        treeSet.add(k4);
        treeSet.add(k5);

        hashSet.forEach(e -> System.out.println("HashSet: " + e.getKlubnavn()));
        linkedHashSet.forEach(e -> System.out.println("LinkedHashSet: " + e.getKlubnavn()));
        treeSet.forEach(e -> System.out.println("TreeSet: " + e.getKlubnavn()));

        //Opgave 5:
        /*
            Der må ikke forekomme dupletter.
            HashSet:
            Data internt repræsenteret i Array og pladsen i arrayet bestemmes ud fra objektets hashcode.
            Rækkefølgen data indsættes i bevares ikke.

            LinkedHashSet:
            Data internt repræsenteret som i HashSet, men rækkefølgen data indsættes i huskes.

            TreeSet:
            Data internt repræsenteret i en træstruktur, og er sorteret.
        */

        //Opgave 6:
        System.out.println("\nOpgave 6:");
        hashSet.add(k1);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contains: K1, " + hashSet.contains(k1));
        System.out.println("isEmpty: " + hashSet.isEmpty());
        System.out.println("Remove: K1, " + hashSet.remove(k1));
        hashSet.clear();
        System.out.println("Size after clear: " + hashSet.size());
        /*
            1	add()         Adds an object to the collection.
            2	clear( )      Removes all objects from the collection.
            3	contains( )   Returns true if a specified object is an element within the collection.
            4	isEmpty( )    Returns true if the collection has no elements.
            5	remove( )     Removes a specified object from the collection.
            6	size( )       Returns the number of elements in the collection.
         */

        //Opgave 7:
        Map<SuperligaKlub, String> hashMap = new HashMap<>();
        hashMap.put(k1, "Klaus");
        hashMap.put(k2, "Karsten");
        hashMap.put(k2, "Anders");
        hashMap.put(k4, "Mikkel");
        hashMap.put(k5, "Jørgen");
        Map<SuperligaKlub, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(k1, "Klaus");
        linkedHashMap.put(k2, "Bent");
        linkedHashMap.put(k3, "Jens");
        linkedHashMap.put(k4, "Daniel");
        linkedHashMap.put(k5, "Paul");
        Map<SuperligaKlub, String> treeMap = new TreeMap<>();
        treeMap.put(k1, "Hans");
        treeMap.put(k2, "Henrik");
        treeMap.put(k3, "Søren");
        treeMap.put(k4, "Lars");
        treeMap.put(k5, "Ole");

        //Opgave 8:
        /*
            HashMap:
            Data, som består af en key og en value, er  internt repræsenteret i Array og pladsen i arrayet bestemmes udfra key´s hashcode.
            Hvis der er flere data med samme hashcode, så benyttes en hægtet liste, og denne rækkefølge er ikke sorteret i en HashMap.

            LinkedHashMap:
            Data internt repræsenteret som i HashMap, men hvis der er flere data med samme hashcode, så benyttes en hægtet liste, og denne rækkefølge kan sorteres i en LinkedHashMap.

            TreeMap:
            Data internt repræsenteret i en træstruktur, hvor der sorteres på hashcoden.
         */

        //Opgave 9:
        System.out.println("\nOpgave 9:");
        System.out.println("Size: " + hashMap.size());
        System.out.println("ContainsKey: K2, " + hashMap.containsKey(k2));
        System.out.println("ContainsValue: Klaus, " + hashMap.containsValue("Klaus"));
        System.out.println("Get: K1, " + hashMap.get(k1));
        System.out.println("Hashcode: " + hashMap.hashCode());
        System.out.println("isEmpty: " + hashMap.isEmpty());
        System.out.println("KeySet: " + hashMap.keySet());
        System.out.println("Remove: K4, " + hashMap.remove(k4, "Mikkel"));
        System.out.println("Values: " + hashMap.values());
        hashSet.clear();
        System.out.println("Size after clear: " + hashMap.size());
        /*
            clear()	                This method is used to clear and remove all of the elements or mappings from a specified Map collection.
            containsKey(Object)	    This method is used to check whether a particular key is being mapped into the Map or not.
            containsValue(Object)	This method is used to check whether a particular value is being mapped by a single or more than one key in the Map.
            get(Object)	            This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter.
            hashCode()	            This method is used to generate a hashCode for the given map containing keys and values.
            isEmpty()	            This method is used to check if a map is having any entry for key and value pairs.
            keySet()	            This method is used to return a Set view of the keys contained in this map.
            put(Object, Object)	    This method is used to associate the specified value with the specified key in this map.
            remove(Object)	        This method is used to remove the mapping for a key from this map if it is present in the map.
            size()	                This method is used to return the number of key/value pairs available in the map.
            values()	            This method is used to create a collection out of the values of the map.
        */

        //Opgave 10:
        System.out.println("\nOpgave 10:");
        //System.out.println(treeSet);
        treeSet.forEach(System.out::println);



    }
}
