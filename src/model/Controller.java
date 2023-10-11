package model;

import dataStructures.*;
import dataSorters.*;


public class Controller {

    private HashTable tasksStore;
    private Queue taskQueue;
    private MaxHeap lastAction;

    public Controller(){
        taskQueue = new Queue<>();
        tasksStore = new HashTable<>( 100);
        lastAction = new MaxHeap<>(tasksStore);

    }

    public void undo() {
    }

    public void changeTaskPriority() {
    }

    public void storeTasks() {
        
    }
}
