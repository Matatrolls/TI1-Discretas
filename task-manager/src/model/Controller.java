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
        // lastAction; para el deshacer

    }

    public void undo() {
    }

    public void changeTaskPriority() {
    }

    public void storeTasks(String title, String description, String day, int priority) {
        Task temporalTask = new Task(title, description, priority, day);
        tasksStore.add(title,temporalTask);
    }
}
