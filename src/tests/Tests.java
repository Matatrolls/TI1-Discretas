package tests;
//import junit.framework.TestCase;
import java.util.ArrayList;

import dataStructures.*;
public class Tests //extends TestCase 
{

    private HashTable tasksStore = new HashTable<>( 500);
    private Queue taskQueue= new Queue<>();

    private  ArrayList priorityTaskList = new ArrayList<>();

    private MaxHeap priorityTaskQueue = new MaxHeap<>(priorityTaskList);

    
}
