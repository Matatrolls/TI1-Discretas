package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap<T extends Comparable<T>> {
    private List<T> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return (2 * index) + 1;
    }

    private int right(int index) {
        return (2 * index) + 2;
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void insert(T value) {
        // add element at the end
        heap.add(value);
        int currentIndex = heap.size() - 1;

        // keep heap properties (heapify-up).
        while (currentIndex > 0 && heap.get(currentIndex).compareTo(heap.get(parent(currentIndex))) > 0) {
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }

    public T extractMax() {
        if (heap.isEmpty()) {
            System.out.println("heap its empty");
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        // extrac max element of the heap
        T maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));

        // keep heap properties
        int currentIndex = 0;
        while (true) {
            int leftIndex = left(currentIndex);
            int rightIndex = right(currentIndex);
            int largest = currentIndex;

            if (leftIndex < heap.size() && heap.get(leftIndex).compareTo(heap.get(largest)) > 0) {
                largest = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex).compareTo(heap.get(largest)) > 0) {
                largest = rightIndex;
            }

            if (currentIndex != largest) {
                swap(currentIndex, largest);
                currentIndex = largest;
            } else {
                break;
            }
        }

        return maxValue;
    }

}