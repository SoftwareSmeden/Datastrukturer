package OpgaveArk240321;

import java.util.ArrayList;

//Opgave 5:
class Bubblesort <E extends Comparable<E>>{
    public void bubbleSort(E[] arrStr, int length, ComparableAll c){
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (c.compareTo(arrStr[i],arrStr[j]) > 0){
                    E temp = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = temp;
                }
            }
        }
    }
}

class Heapsort <E extends Comparable<E>>{
    private ArrayList<E> list = new ArrayList<>();

    public E[] heapSort(E[] arrStr, int length, ComparableAll c){
        for (int i = 0; i < length; i++) {
            add(arrStr[i], c);
        }
        for (int i = arrStr.length - 1; i >= 0; i--) {
            arrStr[i] = remove(c);
        }
        return arrStr;
    }

    public void add(E arrStr, ComparableAll c){
        list.add(arrStr);
        int currentIndex = list.size()-1;
        while (currentIndex > 0){
            int parentIndex = (currentIndex - 1) / 2;
            if (c.compareTo(list.get(currentIndex), list.get(parentIndex)) > 0){
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex,temp);
            }else
                break; //Break when the tree is a heap

            currentIndex = parentIndex;
        }
    }

    public E remove(ComparableAll c){
        if (list.size() == 0) return null;

        E removeStr = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()){
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= list.size()) break; //Break beacuse tree is a heap
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (c.compareTo(list.get(maxIndex),list.get(rightChildIndex)) < 0){
                    maxIndex = rightChildIndex;
                }
            }

            if (c.compareTo(list.get(currentIndex),list.get(maxIndex)) < 0){
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex,temp);
                currentIndex = maxIndex;
            }else
                break; //Break when the tree is a heap
        }
        return removeStr;
    }
}

class Insertionsort <E extends Comparable<E>>{
    public E[] insertionSort(E[] arrStr, int length, ComparableAll c){
        for (int i = 1; i < length; i++) {
            E currentEle = arrStr[i];
            int j;
            for (j = i - 1; j >= 0 && (c.compareTo(currentEle, arrStr[j]) < 0); j--) {
                arrStr[j + 1] = arrStr[j];
            }
            arrStr[j + 1] = currentEle;
        }
        return arrStr;
    }
}

class SelectionSort <E extends Comparable<E>>{
    public E[] selectionSort(E[] arrStr, int length, ComparableAll c){
        for (int i = 0; i < length; i++) {
            E currentMin = arrStr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (c.compareTo(currentMin, arrStr[j]) > 0){
                    currentMin = arrStr[j];
                    currentMinIndex = j;
                }
            }
            //Swaps arrStr elements
            if (currentMinIndex != i){
                arrStr[currentMinIndex] = arrStr[i];
                arrStr[i] = currentMin;
            }
        }
        return arrStr;
    }
}

