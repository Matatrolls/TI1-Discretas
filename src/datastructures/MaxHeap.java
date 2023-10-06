package datastructures;

import java.util.ArrayList;

public class MaxHeap<T extends Comparable<T>> implements IHeap<T>{
    private ArrayList<T> heap;
    private ArrayList<T> list;

    public MaxHeap() {
        heap = new ArrayList<>();
        list = new ArrayList<>();
        buildMaxHeap(list);
    }

    @Override
    public int parent(int index) {
        return (index) / 2;
    }

    @Override
    public int left(int index) {
        return (2 * index) ;
    }

    @Override
    public int right(int index) {
        return (2 * index) + 1;
    }

    @Override
    public void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    @Override
    public void insert(T value) {
        // add element at the end
        heap.add(value);
        int currentIndex = heap.size() - 1;

        // keep heap properties
        maxHeapify(heap, currentIndex);
    }

    @Override
    public T extractMax() {
        if (heap.isEmpty()) {
            System.out.println("heap its empty");
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        // extract max element of the heap
        T maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        // keep properties of the heap
        maxHeapify(heap, 0);

        return maxValue;
    }

    @Override
    public void maxHeapify(ArrayList<T> heap, int currentIndex) {
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
            maxHeapify(heap, currentIndex);
        }
    }

    @Override
    public void buildMaxHeap(ArrayList<T> list) {
        for(int i = (list.size())/2;i!=1;i--) {
            maxHeapify(list, i);
        }
    }

}