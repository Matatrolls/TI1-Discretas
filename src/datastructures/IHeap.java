package datastructures;

import java.util.ArrayList;

public interface IHeap<T> {

    int parent(int index);

    int left(int index);

    int right(int index);

    void swap(int i, int j);

    void insert(T value);

    T extractMax();

    void maxHeapify(ArrayList<T> heap, int currentIndex);

    void buildMaxHeap(ArrayList<T> heap);
}
